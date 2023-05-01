package com.client.feign;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class ClientService {

    private final Client client;

    public String post() {
        log.info("Start requesting token in feign module...");
        var token = client.get();
        log.info("Token in feign module {}", token);
        return token;
    }

}
