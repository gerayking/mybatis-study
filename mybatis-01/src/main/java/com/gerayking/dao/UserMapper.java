package com.gerayking.dao;

import com.gerayking.pojo.User;

import java.util.List;

public interface UserMapper {
    //获取所有用户
    List<User> getUserList();
    //通过id查询用户
    User getUserById(int id);
    //修改用户
    int updataUser(User user);
    //增加用户
    int addUser(User user);
    //删除用户
    int delUserById(int id);
}
