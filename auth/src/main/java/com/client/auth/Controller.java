package com.client.auth;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping(value = "/api")
public class Controller {

    @RequestMapping(value = "/v1/auth/token", method = RequestMethod.POST)
    public ResponseEntity<String> get() {
        return new ResponseEntity<String>(UUID.randomUUID().toString(), HttpStatus.OK);
    }

}
