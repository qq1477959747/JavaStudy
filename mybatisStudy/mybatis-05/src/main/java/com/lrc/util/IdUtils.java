package com.lrc.util;

import java.util.UUID;
import org.junit.Test;

/**
 * @author luo
 * @date 2021/7/6 19:33
 */

public class IdUtils {

  public static String getId() {
    return UUID.randomUUID().toString().replaceAll("-","");
  }

  @Test
  public void test() {
    System.out.println(IdUtils.getId());
  }

}
