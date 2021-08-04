package Inheritance;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PuneUniversity puneUniversity = new PuneUniversity("Pune University", 2022, 50,new String[] {"Machine Learning", "Aritificial Intelligence","AWS","PYTHON"});
		puneUniversity.Display();
		puneUniversity.enrollStudents();
		
		if(puneUniversity instanceof University)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}

	}

}
