package com.pan.dao;

import com.pan.domain.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

//用户的持久层接口
public interface IUserDao {

    //查找所有操作
    @Select("select * from user")
    List<User> findAll();

}
