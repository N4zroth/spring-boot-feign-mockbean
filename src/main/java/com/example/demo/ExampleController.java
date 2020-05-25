package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class ExampleController {

    private final ExampleClient exampleClient;

    @GetMapping("/example")
    public ResponseEntity<String> example() {
        return ResponseEntity.ok(exampleClient.get());
    }
}
