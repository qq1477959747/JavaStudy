package com.lrc.mapper;

import com.lrc.pojo.Blog;
import java.util.List;
import java.util.Map;

/**
 * @author luo
 * @date 2021/7/6 19:29
 */

public interface BlogMapper {

  /**
   * 插入一条数据
   * @param blog 待插入的数据
   * @return 影响行数
   */
  Integer addBlog(Blog blog);

  /**
   * 查询
   * @param map
   * @return
   */
  List<Blog> queryBlogIf(Map map);
  List<Blog> queryBlogChoose(Map map);

}
