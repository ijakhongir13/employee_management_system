package com.meteo.employee_management_system.service;

import com.meteo.employee_management_system.model.User;
import com.meteo.employee_management_system.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
}