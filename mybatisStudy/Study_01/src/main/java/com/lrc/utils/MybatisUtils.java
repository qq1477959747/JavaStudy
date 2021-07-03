package com.lrc.utils;

import java.io.IOException;
import java.io.InputStream;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * @author luo
 */
public class MybatisUtils {

  //创建SqlSessionFactory
  private static SqlSessionFactory sqlSessionFactory;

  //静态代码块
  static {
    try {
      String resource = "mybatis-config.xml";
      //创建IO流读取xml文件信息
      InputStream inputStream = Resources.getResourceAsStream(resource);
      //创建sqlsessionFactory实例
      sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }catch (IOException e){
      e.printStackTrace();
    }
  }

  /**
   * @return sqlSession
   */
  public static SqlSession getSqlSession() {
    return sqlSessionFactory.openSession();
  }

}
