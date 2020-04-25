package com.example.mybatis.dao;

import com.example.mybatis.model.User;

import java.util.List;

/**
 * @author lz
 * @date 2018/12/21
 */
public interface UserDao {
    List<User> selectAll();
}
