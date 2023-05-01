package com.client.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "feignClient", url = "localhost:8082/api")
public interface Client {

    @RequestMapping(value = "/v1/auth/token", method = RequestMethod.POST)
    public String get();
}
