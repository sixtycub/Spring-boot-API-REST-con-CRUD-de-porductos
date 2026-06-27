package com.example.demo.Exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice

public class GlobalExceptionHandler {
 
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String> handlerIllegalArgument(IllegalArgumentException ex){
        return ResponseEntity.badRequest().body(ex.getMessage());

    

}
}