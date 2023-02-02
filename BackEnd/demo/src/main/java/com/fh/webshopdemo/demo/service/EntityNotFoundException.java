package com.fh.webshopdemo.demo.service;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Entity could not be found")
public class EntityNotFoundException extends RuntimeException {
}
