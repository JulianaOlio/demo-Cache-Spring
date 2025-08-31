package com.example.demo.Cache.Spring.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<Map<String,String>> handlerIllegalArgument(IllegalArgumentException ex){
        Map<String,String> erro =new HashMap<>();
        erro.put("mensagem", ex.getMessage());
        erro.put("status","400");
        erro.put("timestamp", LocalDateTime.now().toString());
        return ResponseEntity.badRequest().body(erro);
    }
}
