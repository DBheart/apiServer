package kr.deity.server.api.sample.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class BaseException extends RuntimeException {
    public BaseException(String message){
        super(message);
    }
}
