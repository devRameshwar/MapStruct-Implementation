package com.mapstructdemo.mapper;

import com.mapstructdemo.request.UserRegisterRequest;
import com.mapstructdemo.response.UserRegistrationResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserRegistrationResponse registrationRequestToRegistrationResponse(UserRegisterRequest request);
}
