package com.bangsun.nanjing.ConductProject.pojo;

public class User {

	
	private int id;
	
	private String name;
	
	private int age;
	
	private String password;
	
	private String sex;
	
	private String address;
	public User(){
		
	}
	public User(int id, String name, int age, String password, String sex, String address) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.password = password;
		this.sex = sex;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
	