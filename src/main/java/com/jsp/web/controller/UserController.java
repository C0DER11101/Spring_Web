package com.jsp.web.controller;

import com.jsp.web.dto.UserDto;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
public class UserController {

    @RequestMapping(value = "/register") // this is used by Handler Mapping to uniquely identify the respective service methods
    public void register(UserDto userDto) {
    }

    @RequestMapping(value = "/login")
    public void login() {
    }
}