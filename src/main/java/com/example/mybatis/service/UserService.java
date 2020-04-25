package com.example.mybatis.service;

import com.example.mybatis.model.User;

import java.util.List;

/**
 * @author lz
 * @date 2018/12/21
 */
public interface UserService {
    List<User> findAll();
}
