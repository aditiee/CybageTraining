package datatypes;

import java.lang.instrument.Instrumentation;

public class ArrayDemo {
	
	int rollno[];
	Mobile mobiles[];
	long totalMem;
	
	
	public ArrayDemo() {
		totalMem=Runtime.getRuntime().totalMemory();
		rollno=new int[20];
		mobiles=new Mobile[4];
		//rollno=new int[]{23,56,78,89};
		System.out.println(totalMem);
		System.out.println(Runtime.getRuntime().freeMemory());
		
	}
	
	public int getSize() {
		return mobiles.length;
	}
	public long sizeofOneObject() {
		return totalMem-Runtime.getRuntime().freeMemory();
		}

}
