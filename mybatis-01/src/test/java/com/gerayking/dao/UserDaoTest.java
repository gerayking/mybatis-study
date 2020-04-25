package com.gerayking.dao;

import com.gerayking.pojo.User;
import com.gerayking.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {
    @Test
    public void test(){
        //第一步获取sqlsession
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //第二步执行sql
        UserDao UserDao = sqlSession.getMapper(UserDao.class);
        List<User> userList = UserDao.getUserList();
        for (User user : userList) {
            System.out.println(user);
        }
    }
}
