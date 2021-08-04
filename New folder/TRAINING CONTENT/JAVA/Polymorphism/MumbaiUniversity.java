package Polymorphism;

public class MumbaiUniversity extends  University{

	public MumbaiUniversity() {
		super();
		// TODO Auto-generated constructor stub
	}

	String eligiblityCriteria;
	
	//FUNCTION OVERLOADING 
	public void enrollBy(String quota)
	{
		System.out.println("ENROLLING BY QUOTA " + quota);
	}
	
	public void enrollBy(String quota, int marks)
	{
		System.out.println("ENROLLING BY QUOTA AND MARKS " + quota);
	}
	
	public void enrollBy(float percentage,String quota)
	{
		System.out.println("ENROLLING BY QUOTA AND PERCENTAGE" + quota);
	}

}
