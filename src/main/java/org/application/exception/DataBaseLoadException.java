package org.application.exception;

public class DataBaseLoadException extends RuntimeException {

    public DataBaseLoadException(Throwable cause) {
        super(cause);
    }

    public DataBaseLoadException(String message, Throwable cause) {
        super(message, cause);
    }
    public DataBaseLoadException(String message) {
        super(message);
    }
}
