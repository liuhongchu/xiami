package com.xiami.test;

import redis.clients.jedis.Jedis;

/**
 * Created by liuhongchun on 2018/2/1.
 */
public class RedisTest {
    public static void  main(String args[]){
        Jedis jedis = new Jedis("127.0.0.1");
        System.out.print("jedis联通成功！");
        System.out.print("==:"+jedis.ping());
    }
}
