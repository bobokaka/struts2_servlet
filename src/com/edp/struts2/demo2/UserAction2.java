package com.edp.struts2.demo2;

import com.edp.struts2.domain.User;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 
 * @Title: UserAction2.java
 * @Package com.edp.struts2.demo2
 * @author EdPeng
 * @version 创建时间 2020年2月15日
 * @Description 属性驱动——在页面中提供表达式方式
 * @version V1.0
 */
public class UserAction2 extends ActionSupport{

	//提供一个User对象
	private User user;
	//提供user的set和get方法，一定要提供get方法
	//拦截器完成数据的封装，它需要把相应的对象创建
	//通过get方法可以获得同一个对象，将数据封装到同一个对象中。
	//源代码，核心core包中struts-default.xml中的各种拦截器完成属性封装
	//<interceptor-ref name="params"/>属性封装
	// <interceptor-ref name="modelDriven"/>模型封装
	 //<interceptor-ref name="conversionError"/>类型转换的拦截器
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
	@Override
	public String execute() throws Exception {
		System.out.println(user.toString());
		return NONE;
	}

}
