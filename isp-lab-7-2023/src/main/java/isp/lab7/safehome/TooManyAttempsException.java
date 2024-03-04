package isp.lab7.safehome;

public class TooManyAttempsException extends Exception{
    public TooManyAttempsException(String message) {
        super(message);
    }
}
