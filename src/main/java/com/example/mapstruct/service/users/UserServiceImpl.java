package com.example.mapstruct.service.users;


import com.example.mapstruct.controllers.user.UserDto;
import com.example.mapstruct.model.User;
import com.example.mapstruct.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class UserServiceImpl implements IUserService{
    @Autowired
    IUserRepository userRepository;
    @Override
    public User save(UserDto userDto) {
       return userRepository.save(new User(userDto));
    }

    @Override
    public User findByEmail(String email) {
        if(!email.equals("")){
            Optional<User> user = userRepository.findFirstByEmail(email);
            if (user.isPresent()){
                return user.get();
            }else {
                return null;
            }
        }
        return null;

    }
}
