package com.mapstructdemo.service.serviceImp;

import com.mapstructdemo.mapper.UserMapper;
import com.mapstructdemo.request.UserRegisterRequest;
import com.mapstructdemo.response.UserRegistrationResponse;
import com.mapstructdemo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private  UserMapper mapper;



    private static final Logger LOGGER= LoggerFactory.getLogger(UserServiceImp.class);

    @Override
    public UserRegistrationResponse registration(UserRegisterRequest request) {

        UserRegistrationResponse response = mapper.registrationRequestToRegistrationResponse(request);

        LOGGER.info("****** Response I getting after Mapping: "+response);

        return response;
    }
}
