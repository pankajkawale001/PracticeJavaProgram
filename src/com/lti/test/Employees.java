package com.lti.test;

public class Employees {
	private Integer id;
	private String name;
	private String grad;
	private double salary;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrad() {
		return grad;
	}
	public void setGrad(String grad) {
		this.grad = grad;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employees [id=" + id + ", name=" + name + ", grad=" + grad + ", salary=" + salary + "]";
	}
	public Employees(Integer id, String name, String grad, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.grad = grad;
		this.salary = salary;
	}
	
	
}
