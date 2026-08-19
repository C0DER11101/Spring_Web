package com.jsp.web.controller;

import com.jsp.web.dto.UserDto;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
public class UserController {

    @RequestMapping(value = "/register") // this is used by Handler Mapping to uniquely identify the respective service methods
    public ModelAndView register(UserDto userDto) {
        System.out.println(userDto);
        return new ModelAndView("home.jsp");
    }

    @RequestMapping(value = "/login")
    public void login() {
    }
}