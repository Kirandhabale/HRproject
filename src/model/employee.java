package model;

public class employee {
	
	private int eid;
	private String emp_name;
	private int dep_id;
	private String emp_address;
	private String city;
	private String dob;
	employee(){
		
	}
	public employee(int emp_id, String emp_name, int dep_id, String emp_address, String city, String dob) {
		super();
		this.eid = eid;
		this.emp_name = emp_name;
		this.dep_id = dep_id;
		this.emp_address = emp_address;
		this.city = city;
		this.dob = dob;
	}
	public int getEmp_id() {
		return eid;
	}
	public void setEmp_id(int emp_id) {
		this.eid = eid;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public int getDep_id() {
		return dep_id;
	}
	public void setDep_id(int dep_id) {
		this.dep_id = dep_id;
	}
	public String getEmp_address() {
		return emp_address;
	}
	public void setEmp_address(String emp_address) {
		this.emp_address = emp_address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "employee [eid=" + eid + ", emp_name=" + emp_name + ", dep_id=" + dep_id + ", emp_address="
				+ emp_address + ", city=" + city + ", dob=" + dob + "]";
	}
	

}
	