package com.example.hello_service.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {

    private final RestTemplate restTemplate = new RestTemplate();

    @Value("${response.service.url}")
    private String responseServiceUrl;

    @GetMapping("/hello")
    public String hello() {
        String response = restTemplate.getForObject(responseServiceUrl + "/response", String.class);
        return "Ciao! La risposta è: \"" + response + "\"";
    }
}
