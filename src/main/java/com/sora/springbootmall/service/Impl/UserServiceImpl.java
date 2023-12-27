package com.sora.springbootmall.service.Impl;

import com.sora.springbootmall.dao.UserDao;
import com.sora.springbootmall.dto.UserRegisterRequest;
import com.sora.springbootmall.model.User;
import com.sora.springbootmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }
}
