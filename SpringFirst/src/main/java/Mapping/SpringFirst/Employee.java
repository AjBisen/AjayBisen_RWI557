package Mapping.SpringFirst;

public class Employee {
	
	
		private int id;
		private String ename;
		private String comname;
		private float sallry;

		                                   
		public Employee() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
		
		public Employee(int id, String ename, String comname, float sallry) {
			super();
			this.id = id;
			this.ename = ename;
			this.comname = comname;
			this.sallry = sallry;
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
		public float getSallry() {
			return sallry;
		}
		public void setSallry(float sallry) {
			this.sallry = sallry;
		}
		@Override
		public String toString() {
			return "Employee [id=" + id + ", ename=" + ename + ", comname=" + comname + ", sallry=" + sallry + ", getId()="
					+ getId() + ", getEname()=" + getEname() + ", getComname()=" + getComname() + ", getSallry()="
					+ getSallry() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
					+ super.toString() + "]";
		}
		
	}

