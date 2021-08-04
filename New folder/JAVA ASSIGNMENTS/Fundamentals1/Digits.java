/*Assignment # 3
Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer. 
 Test Data
Input an integer between 0 and 1000: 565
Expected Output :
The sum of all digits in 565 is 16
*/
package Fundamentals1;
import java.util.Scanner;
public class Digits {
	
	public int getSumOfDigits(int digit)
	{
		int sum=0;
	
		while(digit != 0)
		{
			sum+=digit%10;
			digit/=10;
			
			
		}
		return sum;
	}
	
	
}
