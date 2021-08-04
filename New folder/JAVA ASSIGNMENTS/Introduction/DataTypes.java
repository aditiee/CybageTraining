/*Assignment #2 : Write a program to print size of different data types in java */
package Introduction;

public class DataTypes {
	
	static String s;
	public void show()
	{

		byte a=0;
		System.out.println("\nBYTE : " + a +" "+ Byte.SIZE/8 + " bytes");
		boolean b =false;
		System.out.println("BOOLEAN : " + b );
		char ch='A';
		System.out.println("ChARACTER : " + ch + " " +Character.SIZE/8 + " bytes");
		short sh=0;
		System.out.println("SHORT : " + sh + " "+Short.SIZE/8 + " bytes");
		int c = 0;
		System.out.println("INT : " + c + " "+ Integer.SIZE/8 +" bytes");
		long l= 0;
		System.out.println("LONG : " + l+" "+ Long.SIZE/8 +" bytes");
		float f=0;
		System.out.println("FLOAT : "+ f + " " + Float.SIZE/8 + " bytes");
		System.out.println("STRING : " + s);
		
		
		}
		
}


