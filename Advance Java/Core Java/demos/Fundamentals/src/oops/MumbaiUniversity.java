package oops;

public class MumbaiUniversity extends University {

	String eligibiltyCreteria;
	
	public MumbaiUniversity() {
		super();
	}
	
	public void enrollby(String quota) {
		System.out.println("Enrolling by Quota"+quota);
	}
	
	public void enrollby(String quota,int marks) {
		System.out.println("Enrolling by Quota and marks"+quota);
	}
	
	public void enrollby(float percentage,String quota) {
		System.out.println("Enrolling by percentage and Quota"+quota);
	}
}
