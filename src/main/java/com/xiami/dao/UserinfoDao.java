package com.xiami.dao;

import com.xiami.po.UserInfo;

import java.util.List;

/**
 * Created by liuhongchun on 2018/2/1.
 */
public interface UserinfoDao {

    void  saveUserinfo(UserInfo userInfo);

    UserInfo getUserinfo(String UserinfoId);

    List<UserInfo>  getListUserinfo();

}
