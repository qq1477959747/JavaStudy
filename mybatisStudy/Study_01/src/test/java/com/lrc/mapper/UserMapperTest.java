package com.lrc.mapper;

import com.lrc.pojo.User;
import com.lrc.utils.MybatisUtils;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class UserMapperTest {

  @Test
  public void testGetUserList() {
    //获得 SqlSession 对象
    SqlSession sqlSession = MybatisUtils.getSqlSession();
    //第一种 getMapper
//    UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//    List<User> userList = mapper.getUserList();
    //第二种
    List<User> userList = sqlSession.selectList("com.lrc.mapper.UserMapper.getUserList");
    System.out.println(userList.toString());
    sqlSession.close();
  }

  @Test
  public void testGetUserById() {
    //获得 SqlSession 对象
    SqlSession sqlSession = MybatisUtils.getSqlSession();
    //第一种 getMapper
    UserMapper mapper = sqlSession.getMapper(UserMapper.class);
    User user = mapper.getUserById(1);
    System.out.println(user);
    sqlSession.close();
  }

  @Test
  public void testAddUser() {
    //获得 SqlSession 对象
    SqlSession sqlSession = MybatisUtils.getSqlSession();
    //第一种 getMapper
    UserMapper mapper = sqlSession.getMapper(UserMapper.class);
    User user = new User();
    user.setName("罗日程");
    user.setPassword("1234");
    int i = mapper.addUser(user);
    if (i > 0) {
      System.out.println("插入成功：" + user);
    }
    //提交事务
    sqlSession.commit();
    sqlSession.close();
  }

  @Test
  public void testUpdateUser() {
    //获得 SqlSession 对象
    SqlSession sqlSession = MybatisUtils.getSqlSession();
    //第一种 getMapper
    UserMapper mapper = sqlSession.getMapper(UserMapper.class);
    User user = new User();
    user.setName("罗日程");
    user.setPassword("1234");
    int i = mapper.updateUser(user,5);
    if (i > 0) {
      System.out.println("修改成功：" + user);
    }
    //提交事务
    sqlSession.commit();
    sqlSession.close();
  }

  @Test
  public void deleteUser(){
    //获得 SqlSession 对象
    SqlSession sqlSession = MybatisUtils.getSqlSession();
    //第一种 getMapper
    UserMapper mapper = sqlSession.getMapper(UserMapper.class);
    int i = mapper.deleteById(3);
    if (i>0) {
      System.out.println("删除成功");
    }
    sqlSession.commit();
    sqlSession.close();
  }

}
