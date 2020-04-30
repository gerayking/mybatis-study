package com.gerayking.dao;

import com.gerayking.pojo.User;
import com.gerayking.utils.MybatisUtils;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

public class UserDaoTest {
     @Test
    public void getUserList(){
         SqlSession sqlSession = MybatisUtils.getSqlSession();
         UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
         List<User> userList = userMapper.getUserList();
         for (User user : userList) {
             System.out.println(user);
         }
         sqlSession.close();
     }
     @Test
    public void getUserById(){
         SqlSession sqlSession = MybatisUtils.getSqlSession();
         UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
         User user = userMapper.getUserById(2);
         System.out.println(user);
         sqlSession.close();
     }
     @Test
    public void addUser(){
         User user = new User(5,"aa","123");
         SqlSession sqlSession = MybatisUtils.getSqlSession();
         UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
         userMapper.addUser(user);
         sqlSession.close();
     }
}
