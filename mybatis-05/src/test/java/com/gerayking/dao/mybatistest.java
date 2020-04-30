package com.gerayking.dao;


import com.gerayking.pojo.Student;
import com.gerayking.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class mybatistest {
    @Test
    public void getStudentById(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        SutdentMapper mapper = sqlSession.getMapper(SutdentMapper.class);
        Student student = mapper.getStudentById(1);
        System.out.println(student);
        sqlSession.close();
    }
    @Test
    public void getStudent(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        SutdentMapper mapper = sqlSession.getMapper(SutdentMapper.class);
        List<Student> studentList = mapper.getStudentList2();
        for (Student student : studentList) {
            System.out.println(student);
        }
        sqlSession.close();
    }
}
