package com.lrc.mapper;

import java.util.List;
import mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import pojo.User;
import util.MybatisUtil;

/**
 * @author luo
 * @date 2021/7/1 0:07
 */

public class UserMapperTest {

  @Test
  public void test() {
    SqlSession sqlSession = MybatisUtil.getSqlSession();
    UserMapper mapper = sqlSession.getMapper(UserMapper.class);
    List<User> userList = mapper.getUserList();
    System.out.println(userList.size());
  }

}
