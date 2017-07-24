package pro.lukasgorny.core;

import java.io.IOException;

import pro.lukasgorny.dto.FilterCriteria;
import pro.lukasgorny.dto.Player;
import pro.lukasgorny.dto.Stat;
import pro.lukasgorny.enums.PUBGStat;
import pro.lukasgorny.exceptions.BadResponseCodeException;

/**
 * Created by Łukasz "Husar" Górny on 2017-06-29.
 */
public interface JPubg {
    /**
     * Retrieves player specified by nickname data from the PUBGTracker API
     * and returns it in JSON String format. Use this method if you want to parse the
     * data by yourself.
     *
     * @param nickname nickname of the player
     * @return JSON String format with player data
     * @throws IOException              When there are input/output stream related problems
     * @throws BadResponseCodeException When server returns other code than 200 OK
     */
    String getByNickname(final String nickname) throws IOException, BadResponseCodeException;

    /**
     * Retrieves player specified by nickname data from the PUBGTracker API
     * and filters it by specified criteria.
     *
     * @param nickname nickname of the player
     * @param criteria filtering criteria
     * @return Object with player data
     * @throws IOException              When there are input/output stream related problems
     * @throws BadResponseCodeException When server returns other code than 200 OK
     */
    Player getByNickname(final String nickname, final FilterCriteria criteria) throws IOException, BadResponseCodeException;

    /**
     * Retrieves player specified by steamID data from the PUBGTracker API
     * and returns it in JSON String format. Use this method if you want to parse the
     * data by yourself.
     *
     * @param steamID steamID of the player
     * @return JSON String format with player data
     * @throws IOException              When there are input/output stream related problems
     * @throws BadResponseCodeException When server returns other code than 200 OK
     */
    String getBySteamID(final String steamID) throws IOException, BadResponseCodeException;

    /**
     * Retrieves player specified by nickname data from the PUBGTracker API
     * and filters it by specified criteria.
     *
     * @param steamID  steamID of the player
     * @param criteria filtering criteria
     * @return Object with player data
     * @throws IOException              When there are input/output stream related problems
     * @throws BadResponseCodeException When server returns other code than 200 OK
     */
    Player getBySteamID(final String steamID, final FilterCriteria criteria) throws IOException, BadResponseCodeException;

    /**
     * Filters stat by name from specified players matches from the latest season.
     *
     * @param player steamID of the player
     * @param stat   specifies what stat you want to be filtered
     * @return Object with stat data
     */
    Stat getPlayerMatchStatByStatName(Player player, PUBGStat stat);
}