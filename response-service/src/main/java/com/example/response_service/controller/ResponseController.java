package com.example.response_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResponseController {

    @GetMapping("/response")
    public String response(){
        return "Ciao, ti rispondo";
    }
}
