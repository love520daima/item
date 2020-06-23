package com.bo.dao;

import com.bo.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
/**
  * @author 吕博文
  * @date 2020/6/23
  * 描述：
 */
@Mapper
public interface UserMapper {
    public List<User> queryUserList();
}


