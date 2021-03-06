package com.sm.domain;

import java.math.BigDecimal;

/**
 * Created by prash on 11/22/2016.
 */
public class Product {
	private Integer id;
	private String description;
	private BigDecimal price;
	private String url;
	
	
	public Product(Integer id, String description, BigDecimal price, String url) {
		super();
		this.id = id;
		this.description = description;
		this.price = price;
		this.url = url;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
}
