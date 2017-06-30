package pro.lukasgorny.utils;

import pro.lukasgorny.enums.PUBGMode;
import pro.lukasgorny.enums.PUBGRegion;
import pro.lukasgorny.settings.Settings;

/**
 * Created by Łukasz "Husar" Górny on 2017-06-29.
 */
public class UrlUtils {

    public static String prepareNicknameRequestURL(String nickname, PUBGMode mode, PUBGRegion region) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Settings.URL_REQUEST_BY_NICKNAME);
        stringBuilder.append(nickname);

        return stringBuilder.toString();
    }

    public static String prepareSteamIDRequestURL(String steamID, PUBGMode mode, PUBGRegion region) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Settings.URL_REQUEST_BY_STEAMID);
        stringBuilder.append(steamID);

        return stringBuilder.toString();
    }
}