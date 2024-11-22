package com.gsxy.core.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select("select * from users where username = #{username} limit 1")
    Users selectByUsername(String username);

    void insert(Users build);

    void update(Users build);

    @Select("select * from users where id = #{id} limit 1")
    Users queryById(Long id);
}
