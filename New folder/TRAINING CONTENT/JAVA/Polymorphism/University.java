package Polymorphism;

import java.util.Arrays;

public class University {

		String universityName;
		int u_id;
		int totalCourses;
		String courses[];
		
		public University(String universityName, int u_id, int totalCourses, String[] courses) {
			super();
			this.universityName = universityName;
			this.u_id = u_id;
			this.totalCourses = totalCourses;
			this.courses = courses;
		}

		
		
		public University() {
			// TODO Auto-generated constructor stub
		}



		public void Display()
		{
			System.out.println("University Name= " + universityName + "\nu_id=" + u_id + "\nTotal Courses=" + totalCourses
					+ "\nCourses=" + Arrays.toString(courses) );
		}
		public void enrollStudents() {
			System.out.println("ENROLLING STUDENTS...");
		}
		
}
