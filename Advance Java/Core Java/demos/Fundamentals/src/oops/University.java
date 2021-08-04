package oops;

public class University {

	String boardName;
	int u_id;
	int totalCourses;
	String courses[];
	
	public University() {
		// TODO Auto-generated constructor stub
	}
	
	public University(String boardName, int u_id, int totalCourses, String[] courses) {
		super();
		this.boardName = boardName;
		this.u_id = u_id;
		this.totalCourses = totalCourses;
		this.courses = courses;
	}


	public void enrollStudents() {
		System.out.println("Enrolling students");
	}
	
}
