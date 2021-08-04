package ConstructorChaining;
import java.lang.instrument.*;
public class Arrays{
	
	int rollNo[];
	int mobiles[];
	private  static Instrumentation instrument;
	long totalMemory;
	long freeMemory;
	
	public Arrays()
	{
		totalMemory = Runtime.getRuntime().totalMemory();
		freeMemory=Runtime.getRuntime().freeMemory();
		rollNo=new int[20];
		mobiles=new int[4];
		System.out.println(totalMemory);
		System.out.println(freeMemory);
	}
	
	public Arrays(int x,int y)
	{
		System.out.print(x+y + " ");
	}
	
	public int getLength()
	{
		return rollNo.length;
	}
	
	public long getSize()
	{
//		return instrument.getObjectSize();
		
   return totalMemory-freeMemory;
	}
	

}
