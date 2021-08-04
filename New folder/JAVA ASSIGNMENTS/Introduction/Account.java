package Introduction;

public class Account {
	
	public long account_Number;
	public String accHolderName;
	public String branchName;
	
	
	
	public Account() {
		super();
	}
	
	public Account(long account_Number, String accHolderName) {
		super();
		this.account_Number = account_Number;
		this.accHolderName = accHolderName;
	}


	public Account(long account_Number) {
		super();
		this.account_Number = account_Number;
	}


	public Account(long account_Number, String accHolderName, String branchName) {
		super();
		this.account_Number = account_Number;
		this.accHolderName = accHolderName;
		this.branchName = branchName;
	}
	
	void Display()
	{
		System.out.println("\nACCOUNT NUMBER : " + account_Number);
		System.out.println("ACCOUNT HOLDER'S NAME : " +accHolderName);
		System.out.println("BRANCH NAME : " + branchName  );
	}
	
}
