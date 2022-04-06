package com.example.mapstruct.service.users;

import com.example.mapstruct.controllers.user.UserDto;
import com.example.mapstruct.model.User;
import org.springframework.stereotype.Service;

import java.util.Optional;

public interface IUserService {
    User save(UserDto user);

    User findByEmail(String email);
}
