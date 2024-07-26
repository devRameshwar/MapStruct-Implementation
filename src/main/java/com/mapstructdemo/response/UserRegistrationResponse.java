package com.mapstructdemo.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

 @Data
 @AllArgsConstructor
@NoArgsConstructor
public class UserRegistrationResponse {

    private String userId;
    private String userName;
    private String email;
    private String mobileNumber;
    private String type;
    private LocalDate joiningDate;




}
