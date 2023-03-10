package com.example.RESTWithSpring.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class CustomExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String,String>> handleInvalidException(MethodArgumentNotValidException ex){

        Map<String,String> errormap=new HashMap<>();
        ex.getBindingResult().getFieldErrors().forEach(error->{
            errormap.put(error.getField(),error.getDefaultMessage());
        });
        return new ResponseEntity<>(errormap, HttpStatus.BAD_REQUEST);
    }
}
