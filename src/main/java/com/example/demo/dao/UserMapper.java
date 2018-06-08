package com.example.demo.dao;

import com.example.demo.domain.User;
import org.apache.ibatis.annotations.*;

//注解形式
@Mapper
public interface UserMapper {
/*
@Select 是查询类的注解，所有的查询均使用这个
@Result 修饰返回的结果集，关联实体类属性和数据库字段一一对应，如果实体类属性和数据库属性名保持一致，就不需要这个属性来修饰。
@Insert 插入数据库使用，直接传入实体类会自动解析属性到对应的值
@Update 负责修改，也可以直接传入对象
@Delete 负责删除
 */
    @Select("SELECT * FROM user WHERE NAME = #{name}")
    @Results({
            @Result(property = "name", column = "name", javaType = String.class),
    })
    User findByName(@Param("name") String name);

}