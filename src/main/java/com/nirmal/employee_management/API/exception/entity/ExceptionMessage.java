package com.nirmal.employee_management.API.exception.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public record ExceptionMessage(@JsonProperty("message") String message,@JsonProperty("details") String details) {
}
