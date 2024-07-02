package com.semicolonAfrica.DiaryTalk.dtos.request;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserLoginRequest {
    private String password;
    private String email;
}
