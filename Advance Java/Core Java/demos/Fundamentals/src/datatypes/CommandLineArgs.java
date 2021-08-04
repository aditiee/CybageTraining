package datatypes;



public class CommandLineArgs {
	
	
	public static void main(String[] args) {
		
		CommandLineArgs.main();
		
		boolean first = false ;
		System.out.println("Hello: "+args[0]);
		System.out.println((Integer.SIZE/8)+" bytes");
		System.out.println((Float.SIZE/8)+ "bytes");
		System.out.println((Short.SIZE/8)+ "bytes");
		System.out.println((Long.SIZE/8)+ "bytes");
		System.out.println((Double.SIZE/8)+ "bytes");
		if(true) {
			System.out.println("True");
		}
		
	}
	
	public static void main() {
		System.out.println("im in differebt main()...");
		
	}

}
