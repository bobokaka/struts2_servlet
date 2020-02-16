package com.edp.struts2.demo1;

import java.util.Arrays;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.util.ServletContextAware;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 
 * @Title: RequestDemo3.java
 * @Package com.edp.struts2.demo1
 * @author EdPeng
 * @version 创建时间 2020年2月15日
 * @Description 接口注入的方式
 * @version V1.0
 */
// 接口注入需要实现 org.apache.struts2.interceptor.ServletRequestAware接口
public class RequestDemo3 extends ActionSupport implements ServletRequestAware,ServletContextAware {
	private HttpServletRequest request;
	private ServletContext context;

	@Override
	public String execute() throws Exception {
		// 1.接收参数
		// 通过接口注入的方式获得request对象
		Map<String, String[]> map = request.getParameterMap();
		for (String key : map.keySet()) {
			String[] values = map.get(key);
			System.out.println(key + "      " + Arrays.toString(values));
		}

		// 向域对象中存入数据
		// 向request中保存数据
		request.setAttribute("reqName", "reqValue");
		// 向session中保存数据
		request.getSession().setAttribute("sessName", "sessValue");
		// 向application中保存数据
//		可以：ServletActionContext.getServletContext().setAttribute("appName", "appValue");
		context.setAttribute("appName", "appValue");
		return SUCCESS;
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}

	@Override
	public void setServletContext(ServletContext context) {
		this.context=context;
	}
}
