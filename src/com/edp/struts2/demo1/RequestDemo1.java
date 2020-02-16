package com.edp.struts2.demo1;

import java.util.Arrays;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 
 * @Title: RequestDemo1.java
 * @Package com.edp.struts2.demo1
 * @author EdPeng
 * @version 创建时间 2020年2月15日
 * @Description 访问Servlet的API方式一：完全解耦合的方式
 * @version V1.0
 */
public class RequestDemo1 extends ActionSupport {

	@Override
	public String execute() throws Exception {
		// 接收参数
		// 利用struts2中的对象ActionContext对象
		ActionContext context = ActionContext.getContext();
		// 调用ActionContext中的方法
		// 类似于request.getParameterMap();
		Map<String, Object> map = context.getParameters();
		for (String key : map.keySet()) {
			String[] valuse = (String[]) map.get(key);
			System.out.println(key+"    "+Arrays.toString(valuse));
		}
		
		//向域对象中存入数据
		context.put("reqName", "reqValue");//相当于request.setAttribute();
		context.getSession().put("sessName", "sessValue");//相当于session.setAttribute();
		context.getApplication().put("appName", "appValue");//相当于application.setAttribute();
		
		return SUCCESS;
	}
}
