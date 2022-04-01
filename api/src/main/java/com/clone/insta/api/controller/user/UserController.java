package com.clone.insta.api.controller.user;

import com.clone.insta.api.dto.user.UserDto;
import com.clone.insta.api.service.user.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/_api/v1")
public class UserController {
    private final UserService userService;
    @GetMapping(value = "/users/{id}")
    public UserDto getUser(@PathVariable long id) {
        return userService.getUser(id);
    }
}
