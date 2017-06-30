package pro.lukasgorny.factory;

import pro.lukasgorny.core.JPubg;
import pro.lukasgorny.core.JPubgImpl;

/**
 * Created by Łukasz on 29.06.2017.
 */
public class JPubgFactory {

    public static JPubg getWrapper(String apiKey) {
        return new JPubgImpl(apiKey);
    }
}