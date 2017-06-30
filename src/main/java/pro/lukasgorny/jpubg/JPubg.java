package pro.lukasgorny.jpubg;

import pro.lukasgorny.enums.PUBGMode;
import pro.lukasgorny.enums.PUBGRegion;
import pro.lukasgorny.exceptions.ApiException;

/**
 * Created by Łukasz "Husar" Górny on 2017-06-29.
 */
public interface JPubg {
    /**
     * Retrieves player specified by nickname stats from the PUBGTracker API
     * and returns them in JSON String format.
     * @param nickname nickname of the player
     * @return JSON String format with player data whose data you want to retrieve
     * @throws ApiException When something goes fatally wrong and response is NULL
     */
    String getByNickname(String nickname) throws ApiException;

    /**
     * Retrieves player specified by nickname stats from the PUBGTracker API
     * and returns them in JSON String format. Currently does not work as PUBGTracker
     * does not support fetching data by mode or region.
     * @param nickname nickname of the player
     * @param mode specifies from what game mode you want the data to be retrieved
     * {@link PUBGMode#solo}
     * {@link PUBGMode#duo}
     * {@link PUBGMode#squad}
     * @return JSON String format with player data whose data you want to retrieve
     * @throws ApiException When something goes fatally wrong and response is NULL
     */
    String getByNickname(String nickname, PUBGMode mode) throws ApiException;

    /**
     * Retrieves player specified by nickname stats from the PUBGTracker API
     * and returns them in JSON String format. Currently does not work as PUBGTracker
     * does not support fetching data by mode or region.
     * @param nickname nickname of the player
     * @param region specifies from what region you want the data to be retrieved
     * {@link PUBGRegion#AGG}
     * {@link PUBGRegion#AS}
     * {@link PUBGRegion#NA}
     * {@link PUBGRegion#EU}
     * {@link PUBGRegion#OC}
     * {@link PUBGRegion#SA}
     * @return JSON String format with player data whose data you want to retrieve
     * @throws ApiException When something goes fatally wrong and response is NULL
     */
    String getByNickname(String nickname, PUBGRegion region) throws ApiException;

    /**
     * Retrieves player specified by nickname stats from the PUBGTracker API
     * and returns them in JSON String format. Currently does not work as PUBGTracker
     * does not support fetching data by mode or region.
     * @param nickname nickname of the player
     * @param mode specifies from what game mode you want the data to be retrieved {@link PUBGMode#solo} {@link PUBGMode#duo} {@link PUBGMode#squad}
     * @param region specifies from what region you want the data to be retrieved
     * {@link PUBGRegion#AGG}
     * {@link PUBGRegion#AS}
     * {@link PUBGRegion#NA}
     * {@link PUBGRegion#EU}
     * {@link PUBGRegion#OC}
     * {@link PUBGRegion#SA}
     * @return JSON String format with player data whose data you want to retrieve
     * @throws ApiException When something goes fatally wrong and response is NULL
     */
    String getByNickname(String nickname, PUBGMode mode, PUBGRegion region) throws ApiException;

    /**
     * Retrieves player specified by steamID stats from the PUBGTracker API
     * and returns them in JSON String format.
     * @param steamID steamID of the player
     * @return JSON String format with player data whose data you want to retrieve
     * @throws ApiException When something goes fatally wrong and response is NULL
     */
    String getBySteamID(String steamID) throws ApiException;

    /**
     * Retrieves player specified by steamID stats from the PUBGTracker API
     * and returns them in JSON String format.
     * @param steamID steamID of the player
     * @param mode specifies from what game mode you want the data to be retrieved
     * {@link PUBGMode#solo}
     * {@link PUBGMode#duo}
     * {@link PUBGMode#squad}
     * @return JSON String format with player data whose data you want to retrieve
     * @throws ApiException When something goes fatally wrong and response is NULL
     */
    String getBySteamID(String steamID, PUBGMode mode) throws ApiException;

    /**
     * Retrieves player specified by nickname stats from the PUBGTracker API
     * and returns them in JSON String format. Currently does not work as PUBGTracker
     * does not support fetching data by mode or region.
     * @param steamID steamID of the player
     * @param region specifies from what region you want the data to be retrieved
     * {@link PUBGRegion#AGG}
     * {@link PUBGRegion#AS}
     * {@link PUBGRegion#NA}
     * {@link PUBGRegion#EU}
     * {@link PUBGRegion#OC}
     * {@link PUBGRegion#SA}
     * @return JSON String format with player data whose data you want to retrieve
     * @throws ApiException When something goes fatally wrong and response is NULL
     */
    String getBySteamID(String steamID, PUBGRegion region) throws ApiException;

    /**
     * Retrieves player specified by nickname stats from the PUBGTracker API
     * and returns them in JSON String format. Currently does not work as PUBGTracker
     * does not support fetching data by mode or region.
     * @param steamID steamID of the player
     * @param mode specifies from what game mode you want the data to be retrieved
     * {@link PUBGMode#solo}
     * {@link PUBGMode#duo}
     * {@link PUBGMode#squad}
     * @param region specifies from what region you want the data to be retrieved
     * {@link PUBGRegion#AGG}
     * {@link PUBGRegion#AS}
     * {@link PUBGRegion#NA}
     * {@link PUBGRegion#EU}
     * {@link PUBGRegion#OC}
     * {@link PUBGRegion#SA}
     * @return JSON String format with player data whose data you want to retrieve
     * @throws ApiException When something goes fatally wrong and response is NULL
     */
    String getBySteamID(String steamID, PUBGMode mode, PUBGRegion region) throws ApiException;
}