package com.jsp.web.service;

import com.jsp.web.dto.UserDto;
import com.jsp.web.model.UserModel;
import com.jsp.web.repository.UserRepository;
import com.jsp.web.util.SequenceGeneratorUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepo;

    public void processRegister(UserDto userDto) {
        UserModel userModel = new UserModel();
        userModel.setAltKey(SequenceGeneratorUtil.generateAltKey());
        userModel.setName(userDto.getName());
        userModel.setEmail(userDto.getEmail());
        userModel.setCity(userDto.getCity());
        userModel.setPincode(userDto.getPincode());
        userModel.setContact(userDto.getContact());

        userRepo.registerUser(userModel);
    }
}