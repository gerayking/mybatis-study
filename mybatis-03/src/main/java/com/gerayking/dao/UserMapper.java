package com.gerayking.dao;

import com.gerayking.pojo.User;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.Alias;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    List<User> getUserByLimit(Map<String ,Integer>map);
    List<User> getUserByRowBounds(RowBounds rowBounds);
}
