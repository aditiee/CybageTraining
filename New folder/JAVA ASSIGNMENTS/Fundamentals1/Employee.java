/*Assignment # 1 : Create a class Employee  & write Accessors & Mutators. Create objects with default constructor & set values using mutators.Display/print values of attributes of each object created.*/
package Fundamentals1;

public class Employee {

	static int id=2000;
	public int empID;
	public String empName;
	public String designation;
	protected double salary;
	
	
	
	public int getEmpID() {
		return empID;
	}
	public void setEmpID() {
		this.empID =id++;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	void Display()
	{
		System.out.println("\nEMPLOYEE ID : " + empID);
		System.out.println("EMPLOYEE NAME : "+ empName);
		System.out.println("DESIGNATION : " + designation );
		System.out.println("SALARY : " +salary);
	}
	

	
}
