package com.lms.module.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.time.LocalDateTime;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends  RuntimeException{

    public ResourceNotFoundException(String resource, String fieldName, String fieldValue){
        super(String.format("%s not found for %s - %s ", resource, fieldName, fieldValue));
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class ErrorResponseDto {

        private String errorMessage;
        private String apiPath;
        private HttpStatus statusCode;
        private LocalDateTime timestamp;
    }
}
