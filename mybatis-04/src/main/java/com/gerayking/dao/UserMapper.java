package com.gerayking.dao;

import com.gerayking.pojo.User;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.Alias;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    @Select("select * from mybatis.user")
    List<User> getUserList();
//  方法存在多个参数，所有的都必须加上@Param
    @Select("select *from mybatis.user where id=#{id}")
    User getUserById(@Param("id") int id);
    @Insert("insert into user(id,name,pwd) values(#{id},#{name},#{pwd})")
    int addUser(User user);
    @Update("update user set name=#{name},pwd=${pwd} where id = #{id}")
    int updateById(User user);
    @Delete("delete from user where id = ${id}")
    int deleteById(@Param("id") int id);
}
