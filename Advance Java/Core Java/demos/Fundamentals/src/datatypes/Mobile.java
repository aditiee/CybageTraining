package datatypes;

public class Mobile {
	
	String brandName;
	int memory;
	int cameraPixel;
	static int countMobile;
	int imei;
	
	
	Mobile(){
		System.out.println("Inside default");
	}
	
	
	Mobile(int memory){
		this.memory=memory;
		
	}
	
	
	Mobile(String bname,int px,int memory){
		this(memory);//
		this.brandName=bname;
		this.cameraPixel=px;
		countMobile++;
	}
	
	
	public void  calling(int phoneNumber){
		phoneNumber++;
		System.out.println("Calling to: "+phoneNumber);
	}
	
	public void clickPicture() {
		System.out.println("Picture clicked with "+cameraPixel+" pixels");
	}
	
	public int getCount() {
		return countMobile;
	}
	
	
	static public void syncupSim() {
		System.out.println("Syncing up with SIM");
	}

}
