package Introduction;

public class Test {

	public static void main(String[] args) {
		
		FirstProgram obj = new FirstProgram();
		obj.Display();
		
		DataTypes type = new DataTypes();
		type.show();
		
		
//		AccessModifiers access = new AccessModifiers("Aditi",23757,50000);
//		access.Display();
		
		Profile emp = new Profile("Aditi",23757,50000);
		emp.Display();
		
		
		Account account1 = new Account(2002403204,"Aditi Gudadhe","Mumbai");
		account1.Display();

	}

}
