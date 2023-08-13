package com.security.service;

import com.security.dto.SignupDTO;
import com.security.dto.UserDTO;

public interface AuthService {
    UserDTO createUser(SignupDTO signupDTO);
}
