package Fundamentals2;

import Fundamentals1.Student;

public class ScopeTest {

	public static void main(String[] args) {
	

		Student student1 = new Student(23757,"Aditi", "aditiee", "qwerty");
//		System.out.println("STUDENT ID : " + student1.studentId); DEFAULT
		System.out.println("STUDENT NAME : " + student1.studentName);//PUBLIC 
//		System.out.println("USERNAME : " + student1.userName);//PROTECTED
//		System.out.println("PASSWORD : " + student1.password);//PRIVATE
	}

}
