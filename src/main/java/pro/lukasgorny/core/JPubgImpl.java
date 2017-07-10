package pro.lukasgorny.core;

import pro.lukasgorny.dto.Player;
import pro.lukasgorny.dto.Stat;
import pro.lukasgorny.enums.PUBGMode;
import pro.lukasgorny.enums.PUBGRegion;
import pro.lukasgorny.enums.PUBGStat;
import pro.lukasgorny.exceptions.ApiException;
import pro.lukasgorny.services.HttpService;
import pro.lukasgorny.services.MatchStatFilterService;
import pro.lukasgorny.services.PlayerDataFilterService;

/**
 * Created by Łukasz "Husar" Górny on 2017-06-29.
 */
public class JPubgImpl implements JPubg {

    private HttpService httpService;
    private PlayerDataFilterService playerDataFilterService;
    private MatchStatFilterService matchStatFilterService;

    public JPubgImpl(String apiKey) {
        httpService = new HttpService(apiKey);
        playerDataFilterService = new PlayerDataFilterService();
        matchStatFilterService = new MatchStatFilterService();
    }

    public JPubgImpl(String apiKey, int connectionTimeout) {
        httpService = new HttpService(apiKey, connectionTimeout);
        playerDataFilterService = new PlayerDataFilterService();
        matchStatFilterService = new MatchStatFilterService();
    }

    @Override
    public String getByNickname(String nickname) throws ApiException {
        return httpService.executeGetByNicknameAction(nickname);
    }

    @Override
    public Player getByNickname(String nickname, PUBGMode mode) throws ApiException {
        String data = httpService.executeGetByNicknameAction(nickname);
        return playerDataFilterService.filterByMode(data, mode);
    }

    @Override
    public Player getByNickname(String nickname, PUBGRegion region) throws ApiException {
        String data = httpService.executeGetByNicknameAction(nickname);
        return playerDataFilterService.filterByRegion(data, region);
    }

    @Override
    public Player getByNickname(String nickname, PUBGMode mode, PUBGRegion region) throws ApiException {
        String data = httpService.executeGetByNicknameAction(nickname);
        return playerDataFilterService.filterByModeAndRegion(data, mode, region);
    }

    @Override
    public String getBySteamID(String steamID) throws ApiException {
        return httpService.executeGetBySteamIDAction(steamID);
    }

    @Override
    public Player getBySteamID(String steamID, PUBGMode mode) throws ApiException {
        String data = httpService.executeGetBySteamIDAction(steamID);
        return playerDataFilterService.filterByMode(data, mode);
    }

    @Override
    public Player getBySteamID(String steamID, PUBGRegion region) throws ApiException {
        String data = httpService.executeGetBySteamIDAction(steamID);
        return playerDataFilterService.filterByRegion(data, region);
    }

    @Override
    public Player getBySteamID(String steamID, PUBGMode mode, PUBGRegion region) throws ApiException {
        String data = httpService.executeGetBySteamIDAction(steamID);
        return playerDataFilterService.filterByModeAndRegion(data, mode, region);
    }

    @Override
    public Stat getPlayerMatchStatByStatName(Player player, PUBGStat stat) throws ApiException {
        return matchStatFilterService.filterPlayerMatchStatByStatName(player, stat);
    }

}