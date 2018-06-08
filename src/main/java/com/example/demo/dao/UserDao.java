package com.example.demo.dao;

import com.example.demo.domain.User;
import org.apache.ibatis.annotations.Param;

public interface UserDao {
    /*
    根据用户名查找
     */
    User findByName(@Param("name") String name);
}
