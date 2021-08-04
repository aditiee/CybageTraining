/*Define variables in class using static method initialize these variables and display.*/
package Fundamentals2;

public class Student {
	
	 static String studentName;
	 static String subject;
	 static int marks;
		
	static
	{
		studentName="Aditi Gudadhe";
		subject = "History";
		marks = 75;
	}
	
	public static void display()
	{
		System.out.println("\nStudent Name : "+ studentName);
		System.out.println("Subject : " + subject);
		System.out.println("Marks : " + marks);
	}
	
	

	
	


}
