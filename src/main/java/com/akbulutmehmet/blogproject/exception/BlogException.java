package com.akbulutmehmet.blogproject.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class BlogException extends RuntimeException{
    public BlogException(String message) {
        super(message);
    }
}
