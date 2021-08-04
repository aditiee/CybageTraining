
@FunctionalInterface
interface operations{
	 int addition(int a,int b);
	 
	 default public void display() {
		 System.out.println("Inside defender method");
	 }
	
	 }


public class DefaultMethods implements operations  {

	public static void main(String[] args) {
		DefaultMethods dm=new DefaultMethods();
		
		
		operations o=(int a1,int b1) -> {return a1*2+b1*2;};
		System.out.println(o.addition(23, 34));
		System.out.println(o.addition(1, 3));
		System.out.println(o.addition(3, 4));
		System.out.println(o.addition(2, 4));
		o.display();
		
	}

	@Override
	public int addition(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}
}
