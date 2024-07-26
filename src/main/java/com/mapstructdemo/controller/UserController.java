package com.mapstructdemo.controller;

import com.mapstructdemo.request.UserRegisterRequest;
import com.mapstructdemo.response.UserRegistrationResponse;
import com.mapstructdemo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/user")
public class UserController {

    private UserService service;

    private  final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    public UserController(UserService service){
        this.service=service;
    }

    @RequestMapping(path = "/register",method = {RequestMethod.POST})
    public ResponseEntity<UserRegistrationResponse> registration(@RequestBody UserRegisterRequest request){
        LOGGER.info("************ Request in controller: "+request);
        return ResponseEntity.ok(service.registration(request));
    }



    @RequestMapping(value = "/get-wish",method = {RequestMethod.GET})
    public String getMessage(){
        return "Welcome Rameshwar";
    }
}
