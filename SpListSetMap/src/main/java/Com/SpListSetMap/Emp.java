package Com.SpListSetMap;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Emp {
	private String name;
	
	private List<String>phone;
	
	private Set<String>addess;
	
	private Map<String,String> course;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getPhone() {
		return phone;
	}

	public void setPhone(List<String> phone) {
		this.phone = phone;
	}

	public Set<String> getAddess() {
		return addess;
	}

	public void setAddess(Set<String> addess) {
		this.addess = addess;
	}

	public Map<String, String> getCourse() {
		return course;
	}

	public void setCourse(Map<String, String> course) {
		this.course = course;
	}

	public Emp(String name, List<String> phone, Set<String> addess, Map<String, String> course) {
		super();
		this.name = name;
		this.phone = phone;
		this.addess = addess;
		this.course = course;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
