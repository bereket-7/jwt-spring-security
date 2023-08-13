package com.security.controller;

import com.security.dto.WelcomeResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")

public class WelcomeController {

    @GetMapping("/welcome")
    public WelcomeResponse welcome() {
        return new WelcomeResponse("welcome to JWT Authorization");
    }

}
