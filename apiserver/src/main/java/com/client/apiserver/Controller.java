package com.client.apiserver;

import com.client.feign.Client;
import com.client.feign.ClientService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
@RequiredArgsConstructor
@Slf4j
public class Controller {

    private final ClientService client;

    @RequestMapping(value = "/v1/token", method = RequestMethod.POST)
    public ResponseEntity<String> post() {
        log.info("Start requesting token...");
        var token = client.post();
        log.info("Token {}", token);
        return new ResponseEntity<String>(token, HttpStatus.OK);
    }

}
