package com.example.mapstruct.exception;
import org.springframework.http.HttpStatus;
import com.example.mapstruct.error.ErrorCodeEnum;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

public class ServerErrorResponseDto
{
    String message;

    ErrorCodeEnum errorCode;

    int httpStatus;

    public ServerErrorResponseDto(String message, ErrorCodeEnum errorCode, HttpStatus httpStatus )
    {
        this.message = message;
        this.errorCode = errorCode;
        this.httpStatus = httpStatus.value();
    }

    public String getMessage()
    {
        return message;
    }

    public ErrorCodeEnum getErrorCode()
    {
        return errorCode;
    }

    public int getHttpStatus()
    {
        return httpStatus;
    }
}
