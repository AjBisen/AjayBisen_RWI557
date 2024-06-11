package com.Sprefrence;

public class Add {
	private int id;
	
	
	private Emp obj;
          

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Emp getObj() {
		return obj;
	}


	public void setObj(Emp obj) {
		this.obj = obj;
	}


	@Override
	public String toString() {
		return "Add [id=" + id + ", obj=" + obj + "]";
	}

//
//	public Add(int id, Emp obj) {
//		super();
//		this.id = id;
//		this.obj = obj;
//	}


	public Add() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
