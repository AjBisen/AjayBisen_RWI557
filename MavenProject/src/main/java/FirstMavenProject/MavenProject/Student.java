package FirstMavenProject.MavenProject;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	@Id
	private int id;

	private String name;
	private String City;
	
	
	@Override
	public String toString() {
//		return "Student [id=" + id + ", name=" + name + ", City=" + City + ", getId()=" + getId() + ", getName()="
//				+ getName() + ", getCity()=" + getCity() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
//				+ ", toString()=" + super.toString() + "]";
		return this.id+"   :  " +this.name+" : "+this.City;
		
	}
	
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public Student(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		City = city;
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
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	
	

	}


