package com.edp.struts2.demo2;

import java.util.Date;

import javax.jws.soap.SOAPBinding.Use;

import com.edp.struts2.domain.User;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 
 * @Title: UserAction1.java
 * @Package com.edp.struts2.demo2
 * @author EdPeng
 * @version 创建时间 2020年2月15日
 * @Description  属性驱动——提供set方法的方式
 * @version V1.0
 */
public class UserAction1 extends ActionSupport {
	// 提供了对应的属性
	private String username;
	private String password;
	private Integer age;
	private Date birthday;
	private Double salary;
	// 提供属性对应的set方法

	// 接收数据
	// 封装数据
	@Override
	public String execute() throws Exception {
		System.out.println(username);
		System.out.println(password);
		System.out.println(age);
		System.out.println(birthday);
		System.out.println(salary);
		
		//封装数据
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		user.setAge(age);
		user.setBirthday(birthday);
		user.setSalary(salary);
		return NONE;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
}
