package pro.lukasgorny.services;

import java.util.stream.Collectors;
import com.google.gson.Gson;

import pro.lukasgorny.dto.Player;
import pro.lukasgorny.enums.PUBGMode;
import pro.lukasgorny.enums.PUBGRegion;

/**
 * Created by Łukasz "Husar" Górny on 2017-06-30.
 */
public class DataFilterService {

    public Player filterByMode(String data, PUBGMode mode) {
        Player player = jsonToObject(data);
        player.setMatches(player.getMatches().stream().filter(stat -> mode.equals(stat.getMatchType())).collect(Collectors.toList()));

        return player;
    }

    public Player filterByRegion(String data, PUBGRegion region) {
        Player player = jsonToObject(data);
        player.setMatches(player.getMatches().stream().filter(stat -> region.equals(stat.getRegion())).collect(Collectors.toList()));

        return player;
    }

    public Player filterByModeAndRegion(String data, PUBGMode mode, PUBGRegion region) {
        Player player = jsonToObject(data);
        player.setMatches(player.getMatches().stream().filter(stat -> region.equals(stat.getRegion()) && mode.equals(stat.getMatchType())).collect(Collectors.toList()));

        return player;
    }

    private Player jsonToObject(String data) {
        Gson gson = new Gson();
        return gson.fromJson(data, Player.class);
    }
}
