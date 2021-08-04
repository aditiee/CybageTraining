package Polymorphism;

public class PuneUniversity extends University {

	String certifications[];
	
	public PuneUniversity(String universityName, int u_id, int totalCourses, String[] courses) {
		super(universityName, u_id, totalCourses, courses);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void enrollStudents() {
		System.out.println("PUNE UNIVERSITY STUDENTS ...");
	}

	

	
	

}
