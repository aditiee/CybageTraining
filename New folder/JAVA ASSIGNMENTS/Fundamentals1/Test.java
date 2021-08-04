
package Fundamentals1;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.print("ENTER THE DIGIT : ");
		int digit = scan.nextInt();
		Digits sum= new Digits();
		System.out.println("SUM OF DIGITS : "+sum.getSumOfDigits(digit));
		
		System.out.print("ENTER SEQUENCE OF INTEGER : ");
		int sequenceOfIntger = scan.nextInt();
		IntegerSequence digits = new IntegerSequence();
		digits.Display( sequenceOfIntger);
		
		 System.out.print("INPUT A STRING : ");
	        String str =scan.nextLine();
	        MiddleString middleString = new MiddleString();
	        System.out.print("THE MIDDLE CHARACTER IN THE STRING : " + middleString.middle(str)+"\n");
		
		Employee emp1 = new Employee();
		
		emp1.setEmpID();
		emp1.setEmpName("Aditi Gudadhe");
		emp1.setDesignation("SOFTWARE ENGINEER");
		emp1.setSalary(50000);
		emp1.Display();
		
		Employee emp2 = new Employee();
		
		emp2.setEmpName("SAYAI MANKAR");
		emp2.setDesignation("SOFTWARE ENGINEER");
		emp2.setSalary(50000);
		emp2.setEmpID();
		
		emp2.Display();
		
		
		Date date1 = new Date();
		Date date2=new Date(04,06,1997);
		date1.Print();
		date2.Print();
	}

}
