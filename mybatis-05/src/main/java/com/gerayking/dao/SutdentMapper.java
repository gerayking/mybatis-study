package com.gerayking.dao;

import com.gerayking.pojo.Student;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface SutdentMapper {
    List<Student> getStudentList();
    List<Student> getStudentList2();
    Student getStudentById(int id);

}
