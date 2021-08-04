package com.cybage.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.validation.constraints.NotEmpty;
//import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Size;

@Entity
public class Employee  {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	//@NotNull(message="Empid should not be blank")
	Long empid;
	
	@Column
	//@NotEmpty(message="Name should not be blank")
	//@Size(min=3,max=7)
	String ename;
	
	@Column
	//@NotEmpty(message="Designation should not be blank")
	String desgn;
	
	@Column
	//@NotNull(message="Salary should not be blank")
	float salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Employee(Long empid, String ename, String desgn, float salary) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.desgn = desgn;
		this.salary = salary;
	}
	

	public Long getEmpid() {
		return empid;
	}
	public void setEmpid(Long empid) {
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
