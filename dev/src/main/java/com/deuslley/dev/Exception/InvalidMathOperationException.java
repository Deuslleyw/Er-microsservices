package com.deuslley.dev.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class InvalidMathOperationException extends RuntimeException {
    private static final long serialVersionUID = 1L;


    public InvalidMathOperationException(String exception){
        super(exception);
    }

}
