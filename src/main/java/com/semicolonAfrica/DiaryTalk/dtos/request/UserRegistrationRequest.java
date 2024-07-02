package com.semicolonAfrica.DiaryTalk.dtos.request;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserRegistrationRequest {
    private Long Id;
    private String name;
    private String email;
    private String password;
    private String phoneNumber;
    private String address;


}
