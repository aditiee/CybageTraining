package ConstructorChaining;

public class Mobile {
	String brandName;
	int memory;
	int cameraPixel;
	static int mobileCount;
	
	Mobile()
	{
		System.out.println("INSIDE DEFAULT ");
	}
	
	Mobile(int memory)
	{
		this.memory=memory;
	}
	
	public Mobile(String brandName, int cameraPixel,int memory) {
		
		this(memory);
		this.brandName = brandName;
		this.cameraPixel = cameraPixel;
		mobileCount++;
	}
	
	public void calling(int phoneNumber)
	{
		System.out.println("Calling no : " + phoneNumber);
	}
	
	public void clickedPicture()
	{
		System.out.println("Picture Clicked with "+ cameraPixel + " Camera Pixels");
	}
	
	public int getCount()
	{
		return mobileCount;
	}
	
	
	public static void synUpSIM()
	{
		System.out.println("SYNCING UP WITH SIM....");
	}

}
