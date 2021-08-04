package Introduction;

//SUB CLASS 
public class Profile extends AccessModifiers {

	public Profile(String empName, int empId, double salary) {
		super(empName, empId, salary);
	
	}
	
	void Display()
	{
		System.out.println("\nEMPLOYEE'S NAME : " + empName);
		System.out.println("EMPLOYEE ID : " + empId);
//		System.out.println("EMPLOYEE SALARY : " + salary); PRIVATE DATA MEMBER CANNOT BE ACCCESED OUTSIDE THE CLASS
	}
	
	
	

}
