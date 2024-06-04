package com.Spring;

public class Address {
	
	private int rno;
	private String name ;
	private String Schname;
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSchname() {
		return Schname;
	}
	public void setSchname(String schname) {
		Schname = schname;
	}
	public Address(int rno, String name, String schname) {
		super();
		this.rno = rno;
		this.name = name;
		Schname = schname;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Address [rno=" + rno + ", name=" + name + ", Schname=" + Schname + "]";
	}
	
	
	
	

}
