package com.lrc.mapper;

import com.lrc.pojo.Student;
import java.util.List;

/**
 * @author luo
 * @date 2021/7/5 21:59
 */

public interface StudentMapper {

  /**
   * 查询所有的学生信息以及对应的老师信息
   * @return
   */
  List<Student> getAllStudent();

}
