package com.lrc.mapper;

import com.lrc.pojo.User;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author luo
 */
public interface UserMapper {

  /**
   * 获取用户列表
   * @return 用户列表
   */
  List<User> getUserList();

  /**
   * 根据id获取用户
   * @param id
   * @return
   */
  User getUserById(@Param("id") Integer id);

  /**
   * 新增
   * @param user
   * @return
   */
  int addUser(@Param("user") User user);

  /**
   * 修改
   * @param user
   * @param id
   * @return
   */
  int updateUser(@Param("user") User user,@Param("id") Integer id);

  /**
   * 根据id删除
   * @param id
   * @return
   */
  int deleteById(@Param("id") Integer id);


}
