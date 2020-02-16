package com.edp.struts2.domain;

import java.util.Date;

/**
 * 
 * @Title: Product.java
 * @Package com.edp.struts2.domain
 * @author EdPeng
 * @version 创建时间 2020年2月16日
 * @Description 产品的实体类
 * @version V1.0
 */
public class Product {
	private String name;
	private Double price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
	
}
