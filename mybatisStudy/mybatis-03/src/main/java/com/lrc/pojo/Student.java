package com.lrc.pojo;

/**
 * @author luo
 * @date 2021/7/5 21:50
 */

public class Student {

  /**
   * 主键id
   */
  private Integer id;
  /**
   * 学生姓名
   */
  private String name;
  /**
   * 老师
   */
  private Teacher teacher;

  @Override
  public String toString() {
    return "Student{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", teacher=" + teacher +
        '}';
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Teacher getTeacher() {
    return teacher;
  }

  public void setTeacher(Teacher teacher) {
    this.teacher = teacher;
  }

  public Student(Integer id, String name, Teacher teacher) {
    this.id = id;
    this.name = name;
    this.teacher = teacher;
  }

  public Student() {
  }
}
