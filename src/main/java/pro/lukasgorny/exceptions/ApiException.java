package pro.lukasgorny.exceptions;

/**
 * Created by lukaszgo on 2017-06-29.
 */
public class ApiException extends Exception {

    public ApiException(String message) {
        super(message);
    }
}