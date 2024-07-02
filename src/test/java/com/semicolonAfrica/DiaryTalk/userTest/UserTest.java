package com.semicolonAfrica.DiaryTalk.userTest;



import com.semicolonAfrica.DiaryTalk.Exceptions.DiaryTalkException;
import com.semicolonAfrica.DiaryTalk.dtos.request.UserLoginRequest;
import com.semicolonAfrica.DiaryTalk.dtos.request.UserRegistrationRequest;
import com.semicolonAfrica.DiaryTalk.dtos.response.UserLoginResponse;
import com.semicolonAfrica.DiaryTalk.dtos.response.UserRegistrationResponse;
import com.semicolonAfrica.DiaryTalk.services.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class UserTest {
    @Autowired
    private UserService userService;


    @Test
    public void testThatUserCanRegister() throws DiaryTalkException {

        UserRegistrationRequest request = new  UserRegistrationRequest();
        request.setName("fehintola1");
        request.setEmail("fehintola@gmail.com");
        request.setPassword("mastertouch");
        request.setAddress("minnesota");
        request.setPhoneNumber("08033111469");

        UserRegistrationResponse response = userService.registerUser(request);
        assertThat(response).isNotNull();

    }

   @Test
    public void testThatUserCanLogin() throws DiaryTalkException {
        UserLoginRequest request = new  UserLoginRequest();
        request.setEmail("fehintola@gmail.com");
        request.setPassword("mastertouch");

        UserLoginResponse response = userService.loginUser(request);
        assertThat(response).isNotNull();

   }



}
