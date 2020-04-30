package com.gerayking.dao;

import com.gerayking.pojo.User;
import com.gerayking.utils.MybatisUtils;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserDaoTest {
     @Test
    public void getUserByLimit(){
         SqlSession sqlSession = MybatisUtils.getSqlSession();
         UserMapper mapper = sqlSession.getMapper(UserMapper.class);
         HashMap<String, Integer> map = new HashMap<String, Integer>();
         map.put("startIndex",0);
         map.put("pages",2);
         List<User> userByLimit = mapper.getUserByLimit(map);
         for (User user : userByLimit) {
             System.out.println(user);
         }
         sqlSession.close();
     }
     @Test
    public void getUserByRowBounds(){
         SqlSession sqlSession = MybatisUtils.getSqlSession();
//         RouBounds实现分页
         RowBounds rowBounds = new RowBounds(1,2);
         List<User> userList = sqlSession.selectList("com.gerayking.dao.UserMapper.getUserByRowBounds", null, rowBounds);
         for (User user : userList) {
             System.out.println(user);
         }
         sqlSession.close();
     }
}
