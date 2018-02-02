package com.xiami.dao.impl;

import com.xiami.dao.UserinfoDao;
import com.xiami.po.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by liuhongchun on 2018/2/1.
 */
@Service
public class UserinfoDaoImpl implements UserinfoDao {

    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public void saveUserinfo(UserInfo userInfo) {
        ValueOperations<String, UserInfo> valueops = redisTemplate
                .opsForValue();
        valueops.set(String.valueOf(userInfo.getUserId()), userInfo);
    }

    @Override
    public UserInfo getUserinfo(String UserinfoId) {
        ValueOperations<String, UserInfo> valueops = redisTemplate.opsForValue();
        UserInfo userInfo = valueops.get(UserinfoId);
        return userInfo;

    }

    @Override
    public List<UserInfo> getListUserinfo() {
        ListOperations<String, Object> listOperations = redisTemplate.opsForList();
       return (List<UserInfo>) listOperations.getOperations();
    }
}
