package pro.lukasgorny.core;

import pro.lukasgorny.dto.Player;
import pro.lukasgorny.enums.PUBGMode;
import pro.lukasgorny.enums.PUBGRegion;
import pro.lukasgorny.exceptions.ApiException;
import pro.lukasgorny.services.DataFilterService;
import pro.lukasgorny.services.HttpService;

/**
 * Created by Łukasz "Husar" Górny on 2017-06-29.
 */
public class JPubgImpl implements JPubg {

    private HttpService httpService;
    private DataFilterService dataFilterService;

    public JPubgImpl(String apiKey) {
        httpService = new HttpService(apiKey);
        dataFilterService = new DataFilterService();
    }

    @Override
    public String getByNickname(String nickname) throws ApiException {
        return httpService.executeGetByNicknameAction(nickname);
    }

    @Override
    public Player getByNickname(String nickname, PUBGMode mode) throws ApiException {
        String data = httpService.executeGetByNicknameAction(nickname);
        return dataFilterService.filterByMode(data, mode);
    }

    @Override
    public Player getByNickname(String nickname, PUBGRegion region) throws ApiException {
        String data = httpService.executeGetByNicknameAction(nickname);
        return dataFilterService.filterByRegion(data, region);
    }

    @Override
    public Player getByNickname(String nickname, PUBGMode mode, PUBGRegion region) throws ApiException {
        String data = httpService.executeGetByNicknameAction(nickname);
        return dataFilterService.filterByModeAndRegion(data, mode, region);
    }

    @Override
    public String getBySteamID(String steamID) throws ApiException {
        return httpService.executeGetBySteamIDAction(steamID);
    }

    @Override
    public Player getBySteamID(String steamID, PUBGMode mode) throws ApiException {
        String data = httpService.executeGetBySteamIDAction(steamID);
        return dataFilterService.filterByMode(data, mode);
    }

    @Override
    public Player getBySteamID(String steamID, PUBGRegion region) throws ApiException {
        String data = httpService.executeGetBySteamIDAction(steamID);
        return dataFilterService.filterByRegion(data, region);
    }

    @Override
    public Player getBySteamID(String steamID, PUBGMode mode, PUBGRegion region) throws ApiException {
        String data = httpService.executeGetBySteamIDAction(steamID);
        return dataFilterService.filterByModeAndRegion(data, mode, region);
    }
}