package jdk8features;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Greet greet=new Greet();
		
		Greeting englishGreeting=(m)->{return "Hello"+m; };
		
		System.out.println("Greeting in english: "+greet.greeting((message)->"Hello"+message, " John"));
		
		
		Greeting hindiGreeting=(m)-> "Namaste"+m;
		System.out.println("Greeting in hindi : "+greet.greeting(hindiGreeting, " John"));
		
		
//		System.out.println("Greeting in hindi: "+hindiGreeting.toGreet());
//		
//		Greeting marathiGreeting=()-> "Namaskar";
//		System.out.println("Greeting in marathi: "+marathiGreeting.toGreet());
		
	}

}
