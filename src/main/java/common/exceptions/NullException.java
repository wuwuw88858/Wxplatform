package common.exceptions;

/*
* 空指针异常
*
* */
public class NullException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public NullException(){}
    public NullException(String message) {
        super(message);
    }

    public NullException(Throwable throwable) {
        super(throwable);
    }
    public NullException(String message, Throwable throwable) {
        super(message, throwable);
    }
    public NullException(String message, Throwable throwable, boolean enableSuppression,
                         boolean writeableStackTrace) {
        super(message, throwable, enableSuppression, writeableStackTrace);
    }

}
