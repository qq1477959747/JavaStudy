package com.lrc.utils;

import java.io.IOException;
import java.io.InputStream;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * @author luo
 * @date 2021/7/5 21:45
 */

public class MybatisUtils {

  private static SqlSessionFactory sqlSessionFactory;

  static {
    try {
      String resource = "mybatis-config.xml";
      InputStream io = Resources.getResourceAsStream(resource);
      sqlSessionFactory= new SqlSessionFactoryBuilder().build(io);
    }catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static SqlSession getSqlSession() {
    return sqlSessionFactory.openSession();
  }

}
