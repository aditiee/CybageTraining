package BasicPrograms;

class Student
{
	int rollNo;
	String name;
	String branchName;
	
	public void setDetails(int rollNo, String name, String branchName)
	{
		this.rollNo=rollNo;
		this.name=name;
		this.branchName=branchName;
	}
	
	public void getDetails()
	{
		System.out.println("STUDENT DETAILS : "+"\nROLL NO : "+ rollNo+"\nNAME : " + name+ "\nBRANCH NAME : "+branchName);
	}
	
	
	
}