package com.semicolonAfrica.DiaryTalk.services;


import com.semicolonAfrica.DiaryTalk.Exceptions.DiaryTalkException;
import com.semicolonAfrica.DiaryTalk.data.model.User;
import com.semicolonAfrica.DiaryTalk.data.repository.UserRepository;
import com.semicolonAfrica.DiaryTalk.dtos.request.UserLoginRequest;
import com.semicolonAfrica.DiaryTalk.dtos.request.UserRegistrationRequest;
import com.semicolonAfrica.DiaryTalk.dtos.response.UserLoginResponse;
import com.semicolonAfrica.DiaryTalk.dtos.response.UserRegistrationResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class UserServiceApp implements UserService {
    private final UserRepository userRepository;

    @Override
    public UserRegistrationResponse registerUser(UserRegistrationRequest request) throws DiaryTalkException {
        boolean isRegistered = userRepository.findByEmail(request.getEmail()) != null;
        if (isRegistered) throw new DiaryTalkException("User already taken");

        User user = new User();
        user.setEmail(request.getEmail());
        user.setPassword(request.getPassword());
        user.setAddress(request.getAddress());
        user.setName(request.getName());
        user.setPhoneNumber(request.getPhoneNumber());


        userRepository.save(user);
        UserRegistrationResponse response = new UserRegistrationResponse();
        response.setId(user.getId());
        response.setMessage("successfully register user");

        return response;
    }

    @Override
    public UserLoginResponse loginUser(UserLoginRequest request) throws DiaryTalkException {
        User existinguser = userRepository.findByEmail(request.getEmail());
        if (existinguser == null) throw new DiaryTalkException("User not found");
        if (!existinguser.getPassword().equals(request.getPassword())) throw new DiaryTalkException("Invalid password");
        existinguser.setLogin(true);
        userRepository.save(existinguser);
        UserLoginResponse response = new UserLoginResponse();
        response.setMessage("User successfully logged in");
        return response;
    }



}
