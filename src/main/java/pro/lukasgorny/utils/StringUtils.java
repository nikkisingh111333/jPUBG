package pro.lukasgorny.utils;

/**
 * Created by Łukasz "Husar" Górny on 2017-06-29.
 */
public class StringUtils {

    public static boolean isNullOrEmpty(String toTest) {
        return toTest == null || toTest.isEmpty();
    }
}