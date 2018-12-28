package common.exceptions;

public class FailException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public FailException(){}
    public FailException(String message) {
        super(message);
    }
    public FailException(Throwable throwable) {
        super(throwable);
    }
    public FailException(String message, Throwable throwable) {
        super(message, throwable);
    }
    public FailException(String message, Throwable throwable, boolean enableSuppression,
                         boolean writeableStackTrace) {
        super(message, throwable, enableSuppression, writeableStackTrace);
    }
}
