package com.mkyong.common;

import java.util.Collections;
import java.util.List;

public class Product {
	private String product; 

	private String user_code = "testuser" ; 
	private String gender = "MALE" ; 
	private String unit = "METRIC" ; 
	private String height ="188" ; 
	private String weight = "90"; 
	private String age = "35"; 
	private String body_shape = "BOX" ; 
	private String cup_size_country = null ; 
	private String underbust_measurement = null ; 
	private String cup_siez = null ; 
	private String fit ; 
	
	private List relevant_attributes = Collections.emptyList();
	
	public Product(String product, String fit) {
		super();
		this.product = product;
		this.fit = fit;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getUser_code() {
		return user_code;
	}
	public void setUser_code(String user_code) {
		this.user_code = user_code;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getBody_shape() {
		return body_shape;
	}
	public void setBody_shape(String body_shape) {
		this.body_shape = body_shape;
	}
	public String getCup_size_country() {
		return cup_size_country;
	}
	public void setCup_size_country(String cup_size_country) {
		this.cup_size_country = cup_size_country;
	}
	public String getUnderbust_measurement() {
		return underbust_measurement;
	}
	public void setUnderbust_measurement(String underbust_measurement) {
		this.underbust_measurement = underbust_measurement;
	}
	public String getCup_siez() {
		return cup_siez;
	}
	public void setCup_siez(String cup_siez) {
		this.cup_siez = cup_siez;
	}
	public String getFit() {
		return fit;
	}
	public void setFit(String fit) {
		this.fit = fit;
	}
	public List getRelevant_attributes() {
		return relevant_attributes;
	}
	public void setRelevant_attributes(List relevant_attributes) {
		this.relevant_attributes = relevant_attributes;
	}
	public Product(String product, String user_code, String gender, String unit, String height, String weight,
			String age, String body_shape, String cup_size_country, String underbust_measurement, String cup_siez,
			String fit, List relevant_attributes) {
		super();
		this.product = product;
		this.user_code = user_code;
		this.gender = gender;
		this.unit = unit;
		this.height = height;
		this.weight = weight;
		this.age = age;
		this.body_shape = body_shape;
		this.cup_size_country = cup_size_country;
		this.underbust_measurement = underbust_measurement;
		this.cup_siez = cup_siez;
		this.fit = fit;
		this.relevant_attributes = relevant_attributes;
	} 
}
