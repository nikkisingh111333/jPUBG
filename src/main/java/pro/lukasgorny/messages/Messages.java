package pro.lukasgorny.messages;

/**
 * Created by Łukasz "Husar" Górny on 2017-06-29.
 */
public class Messages {
    public static final String BAD_RESPONSE_CODE_ERROR = "FATAL ERROR! Server has returned %s response code.";
    public static final String FATAL_ERROR_NULL_RESPONSE = "FATAL ERROR! Null response returned!";
    public static final String NICKNAME_MUST_NOT_BE_NULL_OR_EMPTY = "Nickname argument must not be null or empty!";
    public static final String STEAMID_MUST_NOT_BE_NULL_OR_EMPTY = "SteamID argument must not be null or empty!";
    public static final String CANNOT_FILTER_PLAYER_NULL = "Cannot filter player data, because player object returned is null!";
    public static final String CANNOT_GET_PLAYER_MATCH_STAT = "Cannot get player match stat, because player object returned is null!";
    public static final String BAD_NUMBER_OF_STATS_RETURNED = "More than one stat or no stats with given name was returned while filtering matches. This is an error.";
    public static final String PLAYER_HAS_NO_MATCHES_PLAYED = "Specified player has no matches played, no stats can be filtered.";

}