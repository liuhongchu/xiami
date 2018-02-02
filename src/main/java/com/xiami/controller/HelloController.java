package com.xiami.controller;

import com.xiami.dao.impl.UserinfoDaoImpl;
import com.xiami.po.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

@Controller
@RequestMapping("/")
public class HelloController {
	@Autowired
	private UserinfoDaoImpl userinfoDaoImpl;
	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		//获取6位随机数
		int random=(int) ((Math.random()+1)*100000);
		UserInfo userInfo = new UserInfo(random, "陕西西安","redis测试","reditoken",1,new Date(), new Date(), new Date(),0, "test1","test2","test3","test4" ,"test5","testunuserid", "alipayUserId", "type");
		userinfoDaoImpl.saveUserinfo(userInfo);
		UserInfo userInfo1= userinfoDaoImpl.getUserinfo(String.valueOf(userInfo.getUserId()));
		model.addAttribute("message", "Hello world!"+userInfo1.getLoseTime()+"===="+userInfo1.getIpAddress());
		return "hello";
	}
}