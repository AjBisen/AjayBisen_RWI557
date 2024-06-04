package com.Spring;

public class Employee {
	private int eid;
	private float salrry;
	private String name;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Employee(int eid, float salrry, String name) {
		super();
		this.eid = eid;
		this.salrry = salrry;
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", salrry=" + salrry + ", name=" + name + "]"; 
	}
	
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public float getSalrry() {
		return salrry;
	}
	public void setSalrry(float salrry) {
		this.salrry = salrry;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
