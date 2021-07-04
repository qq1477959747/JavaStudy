package mapper;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import pojo.User;

/**
 * @author luo
 */
public interface UserMapper {

  /**
   * 获取用户列表
   *
   * @return 用户列表
   */
  List<User> getUserList();

  /**
   * 根据id获取用户
   *
   * @param id
   * @return
   */
  User getUserById(@Param("id") Integer id);

  /**
   * 新增
   *
   * @param user
   * @return
   */
  int addUser(@Param("user") User user);

  /**
   * 修改
   *
   * @param user
   * @param id
   * @return
   */
  int updateUser(@Param("user") User user, @Param("id") Integer id);

  /**
   * 根据id删除
   *
   * @param id id
   * @return 影响行数
   */
  int deleteById(@Param("id") Integer id);

  /**
   * 分页查询
   *
   * @param map
   * @return
   */
  List<User> getUserByLimit(Map<String, Integer> map);


}
