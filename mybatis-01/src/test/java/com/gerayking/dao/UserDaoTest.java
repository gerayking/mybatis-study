package com.gerayking.dao;

import com.gerayking.pojo.User;
import com.gerayking.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {
    @Test
    public void getUserList(){
        //第一步获取sqlsession
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //第二步执行sql
        UserMapper UserDao = sqlSession.getMapper(UserMapper.class);
        List<User> userList = UserDao.getUserList();
        for (User user : userList) {
            System.out.println(user);
        }
    }
    @Test
    public void getUserById(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.getUserById(2);
        System.out.println(user);
    }
    @Test
    public void updataUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = new User(1,"lyp","123456");
        userMapper.updataUser(user);
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void addUser(){
        User user = new User(1,"梁雅萍","333");
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        userMapper.addUser(user);
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void delUserById(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        userMapper.delUserById(1);
        sqlSession.commit();
        sqlSession.close();
    }
}
