package com.cybage.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Employee {

	@NotNull(message="Empid should not be blank")
	int empid;
	
	@NotEmpty(message="Name should not be blank")
	@Size(min=3,max=7)
	String ename;
	
	@NotEmpty(message="Designation should not be blank")
	String desgn;
	
	@NotNull(message="Salary should not be blank")
	float salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Employee(int empid, String ename, String desgn, float salary) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.desgn = desgn;
		this.salary = salary;
	}
	

	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getDesgn() {
		return desgn;
	}
	public void setDesgn(String desgn) {
		this.desgn = desgn;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + ", desgn=" + desgn + ", salary=" + salary + "]";
	}
	
	
}
