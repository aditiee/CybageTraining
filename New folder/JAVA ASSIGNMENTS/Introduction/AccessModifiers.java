/*Assignment #3 : Write a program to demonstrate different access modifiers */
package Introduction;

public class AccessModifiers {
	
	public String empName;
	protected int empId;
	private double salary;
	
	String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	int getEmpId() {
		return empId;
	}
	void setEmpId(int empId) {
		this.empId = empId;
	}
	double getSalary() {
		return salary;
	}
	void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
	public AccessModifiers(String empName, int empId, double salary) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.salary = salary;
	}
	
	

}
