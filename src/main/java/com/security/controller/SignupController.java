package com.security.controller;

import com.security.dto.UserDTO;
import com.security.service.AuthService;
import com.security.dto.SignupDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SignupController {
    @Autowired
    private AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<?> signupUser(@RequestBody SignupDTO signupDTO) {
        UserDTO newUser = authService.createUser(signupDTO);
        if (newUser == null) {
            return new ResponseEntity<>("User not created, try again!", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(newUser, HttpStatus.CREATED);
    }

}
