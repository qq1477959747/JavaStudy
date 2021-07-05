package com.lrc.mapper;

import com.lrc.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

/**
 * @author luo
 * @date 2021/7/5 21:59
 */

public interface TeacherMapper {

  /**
   * 根据 id 得到一个老师
   * @param id
   * @return
   */
  Teacher getTeacherById(@Param("id") Integer id);

}
