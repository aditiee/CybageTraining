package Fundamentals2;

import java.util.Arrays;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
	
		//static import
		System.out.println("PI : " + Circle.getPI());
		
		//Single object
		Singleton singleObj1;
		singleObj1=Singleton.getInstance();
		
		Scanner scan = new Scanner(System.in);
		System.out.print("ENTER HEIGHT OF TRIANGLE : ");
		double height = scan.nextDouble();
		System.out.print("ENTER BREADTH OF TRIANGLE : ");
		double breadth = scan.nextDouble();
		System.out.println("AREA Of TRIANGLE :" + Triangle.Area(breadth, height));
		
		

		
//		LargestArray large = new LargestArray();
//	large.LargestElement(new int[] {12,99,88,45,22,6,80,9});
		
		Student.display();
		

	}

}
