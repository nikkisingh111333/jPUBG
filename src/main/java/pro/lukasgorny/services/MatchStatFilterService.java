package pro.lukasgorny.services;

import java.util.List;
import java.util.stream.Collectors;

import pro.lukasgorny.dto.Player;
import pro.lukasgorny.dto.Stat;
import pro.lukasgorny.enums.PUBGStat;
import pro.lukasgorny.exceptions.ApiException;
import pro.lukasgorny.messages.Messages;

/**
 * Created by Łukasz "Husar" Górny on 2017-07-10.
 */
public class MatchStatFilterService {
    public Stat filterPlayerMatchStatByStatName(Player player, PUBGStat statName) throws ApiException {

        if (player == null) {
            throw new ApiException(Messages.CANNOT_GET_PLAYER_MATCH_STAT);
        }

        if (player.getMatches() == null || player.getMatches().isEmpty()) {
            throw new ApiException(Messages.PLAYER_HAS_NO_MATCHES_PLAYED);
        }

        List<Stat> results = player.getMatches().get(player.getMatches().size() - 1).getStats().stream()
                                   .filter(stat -> statName.getLabelName().equals(stat.getField())).collect(Collectors.toList());

        if (results.size() != 1) {
            throw new ApiException(Messages.BAD_NUMBER_OF_STATS_RETURNED);
        }

        return results.get(0);
    }
}
