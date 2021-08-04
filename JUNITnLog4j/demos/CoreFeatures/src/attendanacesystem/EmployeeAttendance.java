package attendanacesystem;

import java.lang.reflect.Constructor;

public class EmployeeAttendance {

	int employee_id;
	String employee_Name;
	boolean loggedIn;
	int attendance;
	int actulaWorkHours;
	
	
	public EmployeeAttendance() {
		// TODO Auto-generated constructor stub
		System.out.println("in deafult constructor...");
	}
	
	public EmployeeAttendance(int employee_id, String employee_Name) {
		this();
		this.employee_id=employee_id;
		this.employee_Name=employee_Name;
		System.out.println("in two para constructor...");
	}
	
	public EmployeeAttendance(int employee_id, String employee_Name, boolean loggedIn, int attendance,
			int actulaWorkHours) {
		this(employee_id,employee_Name);//constructor chaining
				
		this.loggedIn = loggedIn;
		this.attendance = attendance;
		this.actulaWorkHours = actulaWorkHours;
	}
	
	
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public String getEmployee_Name() {
		return employee_Name;
	}
	public void setEmployee_Name(String employee_Name) {
		this.employee_Name = employee_Name;
	}
	public boolean isLoggedIn() {
		return loggedIn;
	}
	public void setLoggedIn(boolean loggedIn) {
		this.loggedIn = loggedIn;
	}
	public int getAttendance() {
		return attendance;
	}
	public void setAttendance(int attendance) {
		this.attendance = attendance;
	}
	public int getActulaWorkHours() {
		return actulaWorkHours;
	}
	public void setActulaWorkHours(int actulaWorkHours) {
		this.actulaWorkHours = actulaWorkHours;
	}
	
	
	public int markingAttendance() {
		if(isLoggedIn()==true)
		setAttendance(1);
		else
			setAttendance(0);
		
		return getAttendance();
	}
	
	
	
	
}
