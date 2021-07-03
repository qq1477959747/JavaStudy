package com.lrc.mapper;

import com.lrc.pojo.User;
import java.util.List;

public interface UserMapper {

  /**
   * 获取用户列表
   * @return 用户列表
   */
  List<User> getUserList();

}
