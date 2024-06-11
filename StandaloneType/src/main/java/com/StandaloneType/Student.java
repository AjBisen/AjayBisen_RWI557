package com.StandaloneType;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("obj")
public class Student {
	
	@Value("Ajay Bisen")
	private String sname;
	
	
	@Value("Indore")
	private String city;
	
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [sname=" + sname + ", city=" + city + "]";
	}
	

}
