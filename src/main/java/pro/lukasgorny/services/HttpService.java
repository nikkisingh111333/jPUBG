package pro.lukasgorny.services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

import pro.lukasgorny.exceptions.ApiException;
import pro.lukasgorny.exceptions.BadResponseCodeException;
import pro.lukasgorny.messages.Messages;
import pro.lukasgorny.settings.Settings;
import pro.lukasgorny.utils.MessageUtils;
import pro.lukasgorny.utils.StringUtils;
import pro.lukasgorny.utils.UrlUtils;

/**
 * Created by Łukasz "Husar" Górny on 2017-06-29.
 */
public class HttpService {

    private URL url;
    private String apiKey;
    private HttpURLConnection connection;

    public HttpService(String apiKey) {
        this.apiKey = apiKey;
    }

    public String executeGetByNicknameAction(String nickname) throws ApiException {
        if(StringUtils.isNullOrEmpty(nickname)) {
            throw new IllegalArgumentException(Messages.NICKNAME_MUST_NOT_BE_NULL_OR_EMPTY);
        }

        String response = sendGetByNicknameRequest(nickname);

        if(response == null) {
            throw new ApiException(Messages.FATAL_ERROR_NULL_RESPONSE);
        }

        return response;
    }

    public String executeGetBySteamIDAction(String steamID) throws ApiException {
        if(StringUtils.isNullOrEmpty(steamID)) {
            throw new IllegalArgumentException(Messages.STEAMID_MUST_NOT_BE_NULL_OR_EMPTY);
        }

        String response = sendGetBySteamIDRequest(steamID);

        if(response == null) {
            throw new ApiException(Messages.FATAL_ERROR_NULL_RESPONSE);
        }

        return response;
    }


    private String sendGetByNicknameRequest(String nickname) {
        try {
            return sendGetRequest(UrlUtils.prepareNicknameRequestURL(nickname));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    private String sendGetBySteamIDRequest(String steamID) {
        try {
            return sendGetRequest(UrlUtils.prepareSteamIDRequestURL(steamID));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    private String sendGetRequest(final String urlString) throws Exception {
        prepareURL(urlString);
        prepareAndOpenConnection();
        setRequestProperties();

        return processResponse();
    }

    private void prepareURL(String urlString) throws MalformedURLException {
        url = new URL(urlString);
    }

    private void prepareAndOpenConnection() throws IOException {
        connection = (HttpURLConnection) url.openConnection();
    }

    private void setRequestProperties() throws ProtocolException {
        connection.setRequestMethod(Settings.REQUEST_TYPE);
        connection.setRequestProperty(Settings.REQUEST_HEADER_USER_AGENT, Settings.USER_AGENT);
        connection.setRequestProperty(Settings.REQUEST_HEADER_TRN_API_KEY, apiKey);
    }

    private String processResponse() throws IOException, BadResponseCodeException {
        int responseCode = connection.getResponseCode();

        if(responseCode != HttpURLConnection.HTTP_OK) {
            throw new BadResponseCodeException(MessageUtils.prepareBadCodeErrorMessage(responseCode));
        }

        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(connection.getInputStream()));
        String output;
        StringBuilder response = new StringBuilder();

        while ((output = bufferedReader.readLine()) != null) {
            response.append(output);
        }

        bufferedReader.close();

        return response.toString();
    }
}