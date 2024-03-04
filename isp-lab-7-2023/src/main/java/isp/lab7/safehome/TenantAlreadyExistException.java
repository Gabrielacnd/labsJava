package isp.lab7.safehome;

public class TenantAlreadyExistException extends Exception{
    public TenantAlreadyExistException(String message) {
        super(message);
    }
}
