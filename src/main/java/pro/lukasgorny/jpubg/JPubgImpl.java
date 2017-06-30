package pro.lukasgorny.jpubg;

import pro.lukasgorny.enums.PUBGMode;
import pro.lukasgorny.enums.PUBGRegion;
import pro.lukasgorny.exceptions.ApiException;
import pro.lukasgorny.http.HttpService;

/**
 * Created by Łukasz "Husar" Górny on 2017-06-29.
 */
public class JPubgImpl implements JPubg {

    private HttpService httpService;

    public JPubgImpl(String apiKey) {
        httpService = new HttpService(apiKey);
    }

    @Override
    public String getByNickname(String nickname) throws ApiException {
        return httpService.executeGetByNicknameAction(nickname, PUBGMode.solo, PUBGRegion.AGG);
    }

    @Override
    public String getByNickname(String nickname, PUBGMode mode) throws ApiException {
        return httpService.executeGetByNicknameAction(nickname, mode, PUBGRegion.AGG);
    }

    @Override
    public String getByNickname(String nickname, PUBGRegion region) throws ApiException {
        return httpService.executeGetByNicknameAction(nickname, PUBGMode.solo, region);
    }

    @Override
    public String getByNickname(String nickname, PUBGMode mode, PUBGRegion region) throws ApiException {
        return httpService.executeGetByNicknameAction(nickname, mode, region);
    }

    @Override
    public String getBySteamID(String steamID) throws ApiException {
        return httpService.executeGetBySteamIDAction(steamID, PUBGMode.solo, PUBGRegion.AGG);
    }

    @Override
    public String getBySteamID(String steamID, PUBGMode mode) throws ApiException {
        return httpService.executeGetBySteamIDAction(steamID, mode, PUBGRegion.AGG);
    }

    @Override
    public String getBySteamID(String steamID, PUBGRegion region) throws ApiException {
        return httpService.executeGetBySteamIDAction(steamID, PUBGMode.solo, region);
    }

    @Override
    public String getBySteamID(String steamID, PUBGMode mode, PUBGRegion region) throws ApiException {
        return httpService.executeGetBySteamIDAction(steamID, mode, region);
    }
}