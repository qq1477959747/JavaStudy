package com.lrc.mapper;

import com.lrc.pojo.Student;
import com.lrc.utils.MybatisUtils;
import java.util.List;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @author luo
 * @date 2021/7/5 22:13
 */

public class StudentMapperTest {

  @Test
  public void getAllStudentTest() {
    SqlSession sqlSession = MybatisUtils.getSqlSession();
    StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
    List<Student> allStudent = mapper.getAllStudent();
    if (!CollectionUtils.isEmpty(allStudent) && allStudent.size() > 0) {
      for (Student student : allStudent) {
        System.out.println(student);
      }
    }
  }

}
