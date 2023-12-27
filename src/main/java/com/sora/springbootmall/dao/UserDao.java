package com.sora.springbootmall.dao;

import com.sora.springbootmall.dto.UserRegisterRequest;
import com.sora.springbootmall.model.User;

public interface UserDao {
    Integer createUser(UserRegisterRequest userRegisterRequest);

    User getUserById(Integer userId);
}
