package com.lrc.util;

import java.io.IOException;
import java.io.InputStream;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * @author luo
 * @date 2021/7/5 23:26
 */

public class MybatisUtils {

  private static SqlSessionFactory sqlSessionFactory;

  static {
    try {
      InputStream io = Resources.getResourceAsStream("mybatis-config.xml");
      sqlSessionFactory = new SqlSessionFactoryBuilder().build(io);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static SqlSession getSqlSession() {
    return sqlSessionFactory.openSession();
  }

}
