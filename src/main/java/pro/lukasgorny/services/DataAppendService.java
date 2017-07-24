package pro.lukasgorny.services;

import pro.lukasgorny.dto.Player;
import pro.lukasgorny.enums.PUBGSeason;

/**
 * Created by Łukasz "Husar" Górny on 2017-07-24.
 */
public class DataAppendService {

    private MatchValidationService matchValidationService;

    public DataAppendService() {
        this.matchValidationService = new MatchValidationService();
    }

    public Player appendSeasonToStats(Player player) {
        matchValidationService.validate(player.getMatches());
        player.getMatches().forEach(match -> match.getStats().forEach(stat -> stat.setSeason(PUBGSeason.findByKey(match.getSeason()))));

        return player;
    }
}
