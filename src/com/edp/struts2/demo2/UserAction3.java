package com.edp.struts2.demo2;

import com.edp.struts2.domain.User;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * 
 * @Title: UserAction3.java
 * @Package com.edp.struts2.demo2
 * @author EdPeng
 * @version 创建时间 2020年2月15日
 * @Description 方式三：模型驱动——模型驱动方式
 * @version V1.0
 */

public class UserAction3 extends ActionSupport implements ModelDriven<User> {
	// 首先得实现模型驱动的接口

	// 必须手动提供对象的实例
	private User user = new User();// 手动实例化User

	@Override
	// 模型驱动需要使用的方法
	public User getModel() {
		return user;
	}

	@Override
	public String execute() throws Exception {

		System.out.println(user);
		return NONE;
	}

}
