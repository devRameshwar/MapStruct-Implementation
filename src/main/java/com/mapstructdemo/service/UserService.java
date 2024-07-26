package com.mapstructdemo.service;

import com.mapstructdemo.request.UserRegisterRequest;
import com.mapstructdemo.response.UserRegistrationResponse;

public interface UserService {

    UserRegistrationResponse registration(UserRegisterRequest request);

}
