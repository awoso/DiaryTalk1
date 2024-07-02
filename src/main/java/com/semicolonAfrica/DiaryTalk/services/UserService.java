package com.semicolonAfrica.DiaryTalk.services;

import com.semicolonAfrica.DiaryTalk.dtos.request.UserLoginRequest;
import com.semicolonAfrica.DiaryTalk.dtos.request.UserRegistrationRequest;
import com.semicolonAfrica.DiaryTalk.dtos.response.UserLoginResponse;
import com.semicolonAfrica.DiaryTalk.dtos.response.UserRegistrationResponse;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    UserRegistrationResponse registerUser(UserRegistrationRequest request);

    UserLoginResponse loginUser(UserLoginRequest request);

}
