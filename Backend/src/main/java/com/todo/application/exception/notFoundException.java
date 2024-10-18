package com.todo.application.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class notFoundException extends RuntimeException{
    public notFoundException(String prompt) {
        super(prompt);
    }
}
