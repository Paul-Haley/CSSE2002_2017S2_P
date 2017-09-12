package week06;

public class YouAreTooPoorException extends Exception {
    public YouAreTooPoorException() {
        super();
    }
    
    public YouAreTooPoorException(String message) {
        super(message);
    }
}
