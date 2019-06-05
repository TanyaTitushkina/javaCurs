package javaCurs.chapter20;

public class InvalidSubscriptionException extends RuntimeException {

    public InvalidSubscriptionException(String message) {
        super(message);
    }

    public InvalidSubscriptionException(Throwable cause) {
        super(cause);
    }

    public InvalidSubscriptionException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidSubscriptionException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
