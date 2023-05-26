package com.example.fitnes.service;

import com.example.fitnes.model.User;
import com.example.fitnes.web.dto.UserRegistrarionDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrarionDto userRegistrarionDto);
}
