package com.gerayking.pojo;

import lombok.Data;

@Data
public class Student {
    private  int id;
    private String name;
    //每个学生对应一个老师
    private Teacher teacher;
}
