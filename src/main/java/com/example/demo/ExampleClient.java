package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "example-client", url = "httpstat.us")
public interface ExampleClient {

    @GetMapping("/200")
    String get();
}
