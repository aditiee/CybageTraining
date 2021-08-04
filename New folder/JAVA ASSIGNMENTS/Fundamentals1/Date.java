/*Assignment # 2
Write a class Date.  Overload constructor to initialize attributes.
Create Date objects using non-parameterized & parameterized constructors both.
Print values of day, month & year for every object.
*/
package Fundamentals1;

public class Date {
	
	public int day;
	public int month;
	public int year;
	
	
	
	public Date() {
		this.day = 01;
		this.month = 01;
		this.year = 2021;
	}

	
	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	

	void Print()
	{
		System.out.println("\n"+day+"-"+month+"-"+year);
	}
}
