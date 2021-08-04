package lambdaexp;

public class MyImpl1  {

	void show(MyInterface i){
		System.out.println("Addition: "+i.sum(23, 56));
	}
	public static void main(String[] args) {
		
		
		MyInterface m1=(num1,num2)->{return num1+num2;};
		
		//MyInterface impl1=(e,t)-> return e+t;
		
		MyInterface m2=(num1,num2)->{return num1-num2;};
		System.out.println("Result:  "+m1.sum(23,33));
		MyImpl1 obj1=new MyImpl1();
		//obj1.show(m1);
	}

}
