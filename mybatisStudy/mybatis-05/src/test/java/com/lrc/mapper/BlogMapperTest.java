package com.lrc.mapper;

import com.lrc.pojo.Blog;
import com.lrc.util.IdUtils;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;
import utils.MybatisUtils;

/**
 * @author luo
 * @date 2021/7/6 19:44
 */

public class BlogMapperTest {

  Logger logger = Logger.getLogger(BlogMapperTest.class);

  @Test
  public void testAddBlog() {
    SqlSession sqlSession = MybatisUtils.getSqlSession();
    BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
    Blog blog = new Blog();
    blog.setId(IdUtils.getId());
    blog.setTitle("东京食尸鬼2");
    blog.setAuthor("hahh");
    blog.setCreateTime(new Date());
    blog.setViews(new Random().nextInt(9999));
    Integer integer = mapper.addBlog(blog);
    if (integer != null && integer > 0) {
      logger.info(String.format("添加成功：%s",blog.toString()));
    }
    sqlSession.commit();
    sqlSession.close();
  }

  @Test
  public void testQueryBlogIf() {
    SqlSession sqlSession = MybatisUtils.getSqlSession();
    BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
    Map map = new HashMap();
//    map.put("title","终末的女武神");
    map.put("author","罗日程");
    map.put("views",900);
    List<Blog> blogs = mapper.queryBlogChoose(map);
    System.out.println(blogs);
    sqlSession.close();
  }
}
