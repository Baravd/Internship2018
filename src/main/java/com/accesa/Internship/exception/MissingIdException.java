/*
 * Copyright (c) 2018 7 8 Valentin Bara
 */

package com.accesa.Internship.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class MissingIdException extends RuntimeException {

    public MissingIdException(String message) {
        super(message);
    }
}
