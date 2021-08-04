package beans;

import java.io.Serializable;

public class Employee implements Serializable{

	private int empid;
	private String name;
	private String dept;
	public int getEmpid() {
		return empid;
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int e,String n,String d){
		this.empid=e;
		this.name=n;
		this.dept=d;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
}
