package com.santander.bootcamp.Exceptions;

import java.io.Serial;

public class DevException extends Exception {

    @Serial
    private static final long serialVersionUID = 1L;

    public DevException(String message) {
        super(message);
    }
}

