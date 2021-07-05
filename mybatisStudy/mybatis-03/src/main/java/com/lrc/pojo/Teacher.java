package com.lrc.pojo;

/**
 * @author luo
 * @date 2021/7/5 21:52
 */

public class Teacher {

  /**
   * 主键 id
   */
  private Integer id;
  /**
   * 姓名
   */
  private String name;

  @Override
  public String toString() {
    return "Teacher{" +
        "id=" + id +
        ", name='" + name + '\'' +
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

  public Teacher(Integer id, String name) {
    this.id = id;
    this.name = name;
  }

  public Teacher() {
  }
}
