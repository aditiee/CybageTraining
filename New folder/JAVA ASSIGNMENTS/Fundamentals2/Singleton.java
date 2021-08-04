package Fundamentals2;

public class Singleton {

	private static Singleton singleObj;
	
	private Singleton()
	{
		System.out.println("SINGLETON CLASS CONSTRUCTOR CALLED! ");
	}
	
	public static Singleton getInstance()
	{
		if(singleObj == null)
			singleObj = new Singleton();
		return singleObj;
	}
	
}
