package com.lrc.mapper;

import com.lrc.pojo.Teacher;
import com.lrc.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @author luo
 * @date 2021/7/5 22:07
 */

public class TeacherMapperTest {

  @Test
  public void testGetTeacherById() {
    SqlSession sqlSession = MybatisUtils.getSqlSession();
    TeacherMapper teacherMapper = sqlSession.getMapper(TeacherMapper.class);
    Teacher teacherById = teacherMapper.getTeacherById(1);
    if (null != teacherById) {
      System.out.println(teacherById);
    }
    sqlSession.close();
  }

}
