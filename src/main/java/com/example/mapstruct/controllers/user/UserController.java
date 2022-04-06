package com.example.mapstruct.controllers.user;
import com.example.mapstruct.model.User;
import com.example.mapstruct.service.users.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class UserController {
    private final IUserService userService;

    public UserController(@Autowired IUserService userService) {
        this.userService = userService;
    }

    @PostMapping("user")
    public ResponseEntity<User> create(@RequestBody UserDto userDto )
    {
        return ResponseEntity.ok( userService.save( userDto ) );
    }
}
