package com.edp.struts2.demo1;

import java.util.Arrays;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 
 * @Title: RequestDemo2.java
 * @Package com.edp.struts2.demo1
 * @author EdPeng
 * @version 创建时间 2020年2月15日
 * @Description 访问Servlet的API方式二：原生的方式
 * @version V1.0
 */
public class RequestDemo2 extends ActionSupport {

	@Override
	public String execute() throws Exception {
		// 接收参数
		//直接获得request对象，通过ServletActionContext
		HttpServletRequest request = ServletActionContext.getRequest();
		Map<String, String[]> map = request.getParameterMap();
		for (String key : map.keySet()) {
			String[] values =map.get(key);
			System.out.println(key+"      "+Arrays.toString(values));
		}
		
		//向域对象中存入数据
		//向request中保存数据
		request.setAttribute("reqName", "reqValue");
		//向session中保存数据
		request.getSession().setAttribute("sessName", "sessValue");
		//向application中保存数据
		ServletActionContext.getServletContext().setAttribute("appName", "appValue");
		return SUCCESS;
	}

}
