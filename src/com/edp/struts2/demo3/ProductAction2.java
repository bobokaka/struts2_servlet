package com.edp.struts2.demo3;

import java.util.Map;

import com.edp.struts2.domain.Product;
import com.opensymphony.xwork2.ActionSupport;
import com.sun.swing.internal.plaf.metal.resources.metal;

/**
 * 
 * @Title: ProductAction2.java
 * @Package com.edp.struts2.demo3
 * @author EdPeng
 * @version 创建时间 2020年2月16日
 * @Description 复杂数据类型的封装：封装数据到Map集合中 
 * @version V1.0
 */
public class ProductAction2 extends ActionSupport {
	
	private Map<String, Product> map;
	
	public Map<String, Product> getMap() {
		return map;
	}

	public void setMap(Map<String, Product> map) {
		this.map = map;
	}

	@Override
	public String execute() throws Exception {
		for (String key : map.keySet()) {
			Product product = map.get(key);
			System.out.println(key+"    "+product);
		}
		return NONE;
	}
}
