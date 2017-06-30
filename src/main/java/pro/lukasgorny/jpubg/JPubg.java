package pro.lukasgorny.jpubg;

import pro.lukasgorny.enums.PUBGMode;
import pro.lukasgorny.enums.PUBGRegion;
import pro.lukasgorny.exceptions.ApiException;

/**
 * Created by Łukasz "Husar" Górny on 2017-06-29.
 */
public interface JPubg {
    String getByNickname(String nickname) throws ApiException;
    String getByNickname(String nickname, PUBGMode mode) throws ApiException;
    String getByNickname(String nickname, PUBGRegion region) throws ApiException;
    String getByNickname(String nickname, PUBGMode mode, PUBGRegion region) throws ApiException;

    String getBySteamID(String steamID) throws ApiException;
    String getBySteamID(String steamID, PUBGMode mode) throws ApiException;
    String getBySteamID(String steamID, PUBGRegion region) throws ApiException;
    String getBySteamID(String steamID, PUBGMode mode, PUBGRegion region) throws ApiException;
}