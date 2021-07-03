package com.lrc.mapper;

import com.lrc.pojo.User;
import com.lrc.utils.MybatisUtils;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class UserMapperTest {

  @Test
  public void testGetUserList() {
    SqlSession sqlSession = MybatisUtils.getSqlSession();
    UserMapper mapper = sqlSession.getMapper(UserMapper.class);
    List<User> userList = mapper.getUserList();
    System.out.println(userList.toString());
    sqlSession.close();
  }

}
