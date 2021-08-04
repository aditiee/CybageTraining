package oops;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		University universities[]= {
			new PuneUniversity(new String[]{"AWS","MI","AI"}, "State Board", 1022, 50, new String[] {"B.Sc","B.E","M.E"}),
			new MumbaiUniversity()};
		
		MumbaiUniversity mumbaiUniversity=new MumbaiUniversity();
		
		mumbaiUniversity.enrollby("Open");
		mumbaiUniversity.enrollStudents();
		
		for(University u: universities)
			u.enrollStudents();
		
		
		Radio myMachine=new Radio();
		myMachine.toaccept();
		
		Printer p=new Desktop();
		
			p.toPrint();
	}

}
