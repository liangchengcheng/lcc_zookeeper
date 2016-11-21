package com.lcc.exception;

/**
 * Created by lcc on 2016/11/21.
 */
public class ParaException extends RuntimeException {

    public ParaException() {
        super();
    }

    public ParaException(String message) {
        super(message);
    }

    public ParaException(String message, Throwable cause) {
        super(message, cause);
    }

    public ParaException(Throwable cause) {
        super(cause);
    }

    protected ParaException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
