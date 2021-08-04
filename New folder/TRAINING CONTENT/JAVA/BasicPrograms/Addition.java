package BasicPrograms;
import java.util.Scanner;
public class Addition {

	public static void main(String args[]) {
	
		Scanner scan = new Scanner(System.in);
		System.out.print("ENTER FIRST NO : ");
		int a = scan.nextInt();
		System.out.print("ENTER SECOND NO : ");
		int b= scan.nextInt();
		int c = a + b;
		System.out.println("Addition is : " + c);
		
	}

}
