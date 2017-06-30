package pro.lukasgorny.core;

import pro.lukasgorny.dto.Player;
import pro.lukasgorny.enums.PUBGMode;
import pro.lukasgorny.enums.PUBGRegion;
import pro.lukasgorny.exceptions.ApiException;

/**
 * Created by Łukasz "Husar" Górny on 2017-06-29.
 */
public interface JPubg {
    /**
     * Retrieves player specified by nickname data from the PUBGTracker API
     * and returns it in JSON String format. Use this method if you want to parse the
     * data by yourself.
     * @param nickname nickname of the player
     * @return JSON String format with player data
     * @throws ApiException When something goes fatally wrong and response is NULL
     */
    String getByNickname(String nickname) throws ApiException;

    /**
     * Retrieves player specified by nickname data from the PUBGTracker API
     * and filters it by specified mode.
     * @param nickname nickname of the player
     * @param mode specifies from what game mode you want the data to be retrieved
     * {@link PUBGMode#solo}
     * {@link PUBGMode#duo}
     * {@link PUBGMode#squad}
     * @return Object with player data
     * @throws ApiException When something goes fatally wrong and response is NULL
     */
    Player getByNickname(String nickname, PUBGMode mode) throws ApiException;

    /**
     * Retrieves player specified by nickname data from the PUBGTracker API
     * and filters it by specified region.
     * @param nickname nickname of the player
     * @param region specifies from what region you want the data to be retrieved
     * {@link PUBGRegion#agg}
     * {@link PUBGRegion#as}
     * {@link PUBGRegion#na}
     * {@link PUBGRegion#eu}
     * {@link PUBGRegion#oc}
     * {@link PUBGRegion#sa}
     * @return Object with player data
     * @throws ApiException When something goes fatally wrong and response is NULL
     */
    Player getByNickname(String nickname, PUBGRegion region) throws ApiException;

    /**
     * Retrieves player specified by nickname data from the PUBGTracker API
     * and filters it by specified region and mode.
     * @param nickname nickname of the player
     * @param mode specifies from what game mode you want the data to be retrieved {@link PUBGMode#solo} {@link PUBGMode#duo} {@link PUBGMode#squad}
     * @param region specifies from what region you want the data to be retrieved
     * {@link PUBGRegion#agg}
     * {@link PUBGRegion#as}
     * {@link PUBGRegion#na}
     * {@link PUBGRegion#eu}
     * {@link PUBGRegion#oc}
     * {@link PUBGRegion#sa}
     * @return Object with player data
     * @throws ApiException When something goes fatally wrong and response is NULL
     */
    Player getByNickname(String nickname, PUBGMode mode, PUBGRegion region) throws ApiException;

    /**
     * Retrieves player specified by steamID data from the PUBGTracker API
     * and returns it in JSON String format. Use this method if you want to parse the
     * data by yourself.
     * @param steamID steamID of the player
     * @return JSON String format with player data
     * @throws ApiException When something goes fatally wrong and response is NULL
     */
    String getBySteamID(String steamID) throws ApiException;

    /**
     * Retrieves player specified by steamID data from the PUBGTracker API
     * and filters it by specified mode.
     * @param steamID steamID of the player
     * @param mode specifies from what game mode you want the data to be retrieved
     * {@link PUBGMode#solo}
     * {@link PUBGMode#duo}
     * {@link PUBGMode#squad}
     * @return Object with player data
     * @throws ApiException When something goes fatally wrong and response is NULL
     */
    Player getBySteamID(String steamID, PUBGMode mode) throws ApiException;

    /**
     * Retrieves player specified by steamID data from the PUBGTracker API
     * and filters it by specified region.
     * @param steamID steamID of the player
     * @param region specifies from what region you want the data to be retrieved
     * {@link PUBGRegion#agg}
     * {@link PUBGRegion#as}
     * {@link PUBGRegion#na}
     * {@link PUBGRegion#eu}
     * {@link PUBGRegion#oc}
     * {@link PUBGRegion#sa}
     * @return Object with player data
     * @throws ApiException When something goes fatally wrong and response is NULL
     */
    Player getBySteamID(String steamID, PUBGRegion region) throws ApiException;

    /**
     * Retrieves player specified by steamID data from the PUBGTracker API
     * and filters it by specified mode and region.
     * @param steamID steamID of the player
     * @param mode specifies from what game mode you want the data to be retrieved
     * {@link PUBGMode#solo}
     * {@link PUBGMode#duo}
     * {@link PUBGMode#squad}
     * @param region specifies from what region you want the data to be retrieved
     * {@link PUBGRegion#agg}
     * {@link PUBGRegion#as}
     * {@link PUBGRegion#na}
     * {@link PUBGRegion#eu}
     * {@link PUBGRegion#oc}
     * {@link PUBGRegion#sa}
     * @return Object with player data
     * @throws ApiException When something goes fatally wrong and response is NULL
     */
    Player getBySteamID(String steamID, PUBGMode mode, PUBGRegion region) throws ApiException;
}