package Mapping.SpringF;

public class Employee {

	
	private int id ;
	private String ename;
	private String comname;
	private float salrry;
	
	
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String ename, String comname, float salrry) {
		super();
		this.id = id;
		this.ename = ename;
		this.comname = comname;
		this.salrry = salrry;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getComname() {
		return comname;
	}

	public void setComname(String comname) {
		this.comname = comname;
	}

	public float getSalrry() {
		return salrry;
	}

	public void setSalrry(float salrry) {
		this.salrry = salrry;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", ename=" + ename + ", comname=" + comname + ", salrry=" + salrry;
					}

	
}
