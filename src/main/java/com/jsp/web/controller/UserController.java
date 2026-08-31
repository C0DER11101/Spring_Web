package com.jsp.web.controller;

import com.jsp.web.dto.UserDto;
import com.jsp.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/register") // this is used by Handler Mapping to uniquely identify the respective service methods
    public ModelAndView register(UserDto userDto) {
        System.out.println(userDto);
        userService.processRegister(userDto);
        return new ModelAndView("name", userDto.getName(), "home.jsp");
    }

    @RequestMapping(value = "/login")
    public void login() {
    }

}