package ConstructorChaining;

public class Test {

	public static void main(String[] args) {
		Mobile iPhone = new Mobile("iPhone",500,45);
		iPhone.calling(837909100);
		iPhone.clickedPicture();
		
		Mobile RedMI = new Mobile("RedMI",1000,48);
		Mobile NokiaI = new Mobile("Nokia",1000,48);
		Mobile Oppo = new Mobile("Oppo",1000,48);
		
		
		System.out.println("NUMBER OF MOBILES : " +RedMI.getCount());
		
		//static variable
		iPhone.synUpSIM();
		Mobile.synUpSIM();
		
		Arrays obj= new Arrays();
		System.out.println("LENGTH : "+obj.getLength());
		System.out.println("MEMORY UTILIZED : " + obj.getSize());
		
		Arrays[] obj1= new Arrays[10];
	for(int i=0;i<10;i++)
	{
		obj1[i]=new Arrays(i,i+1);
	
	}

	}

}
