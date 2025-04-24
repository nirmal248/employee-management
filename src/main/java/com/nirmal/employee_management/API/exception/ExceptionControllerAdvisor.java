package com.nirmal.employee_management.API.exception;

import com.nirmal.employee_management.API.exception.entity.ExceptionMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionControllerAdvisor {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ExceptionMessage> handleResouceNotFoundException(ResourceNotFoundException exception) {
        return new ResponseEntity<>(new ExceptionMessage("Employee Not found","Employee id provided not present or deleted."), HttpStatus.NOT_FOUND);
    }
}
