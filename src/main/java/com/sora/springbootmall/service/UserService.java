package com.sora.springbootmall.service;

import com.sora.springbootmall.dto.UserLoginRequest;
import com.sora.springbootmall.dto.UserRegisterRequest;
import com.sora.springbootmall.model.User;

public interface UserService {
    Integer register(UserRegisterRequest userRegisterRequest);

    User getUserById(Integer userId);

    User login(UserLoginRequest userLoginRequest);
}
