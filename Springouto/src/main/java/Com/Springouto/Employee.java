package Com.Springouto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	

	private int eid;
	private float salrry;
	private String name;
	
	@Autowired
	
	@Qualifier("add1")
	private Address address;
	
	public Address getAddress() {
		return address;
	}



	public void setAddress(Address address) {
		this.address = address;
	}



	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
		
	public Employee(int eid, float salrry, String name, Address address) {
		super();
		this.eid = eid;
		this.salrry = salrry;
		this.name = name;
		this.address = address;
	}




	
	


	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", salrry=" + salrry + ", name=" + name + ", address=" + address + "]";
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
