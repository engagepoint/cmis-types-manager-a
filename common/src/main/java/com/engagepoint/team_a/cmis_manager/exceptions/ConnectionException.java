package com.engagepoint.team_a.cmis_manager.exceptions;


public class ConnectionException extends BaseException {
    public ConnectionException(String message) {
        super(message);
    }

    public ConnectionException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
