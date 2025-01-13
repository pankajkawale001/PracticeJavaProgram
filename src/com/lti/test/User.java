package com.lti.test;

public class User {
	
	private String name;
    private Country country;
    private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", country=" + country + ", age=" + age + "]";
	}
	public User(String name, Country country, int age) {
		super();
		this.name = name;
		this.country = country;
		this.age = age;
	}
    
    

}
