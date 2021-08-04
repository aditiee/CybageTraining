package oops;

public class PuneUniversity extends University {

	String certifications[];
	
	
	public PuneUniversity(String[] certifications,String broadName ,int uid,int totalCourses,String[] courses) {
		super(broadName,uid,totalCourses,courses);
		this.certifications = certifications;
	}


	@Override
	public void enrollStudents() {
		// TODO Auto-generated method stub
		//super.enrollStudents();
		System.out.println("Enroll in Pune university");
	}
	
}
