package com.edp.struts2.demo3;

/**
 * 
 * @Title: ProductAction1.java
 * @Package com.edp.struts2.demo3
 * @author EdPeng
 * @version 创建时间 2020年2月16日
 * @Description 复杂类型的数据封装：封装到list集合
 * @version V1.0
 */

import java.util.List;

import com.edp.struts2.domain.Product;
import com.opensymphony.xwork2.ActionSupport;

public class ProductAction1 extends ActionSupport {
	private List<Product> products;

	// 提供集合的set方法和get方法（get方法必不可少）
	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public List<Product> getProducts() {
		return products;
	}

	@Override
	public String execute() throws Exception {
		for (Product product : products) {
			System.out.println(product);
		}
		return NONE;
	}
}
