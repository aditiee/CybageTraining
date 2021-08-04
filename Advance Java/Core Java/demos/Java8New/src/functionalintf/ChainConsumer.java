package functionalintf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class ChainConsumer {
	
	private ChainConsumer() {
	}
	public static void main(String[] args) {
		List<String> l=Arrays.asList("one","two","three","four","five");
		List<String> l2=new ArrayList<>();
		l2.add("Welcome");
		
Consumer<String> c1=System.out::println;
Consumer<String> c2=l2::add;
		
	
	//l.forEach(c1);
	l.forEach(c1.andThen(c2));
	System.out.println("List 2: ");	
	l2.forEach(c1);
		
//		System.out.println("Display list 2..");
//		l2.forEach(c1);
//		
//	
//	  Consumer < String > consumer1 = (arg) -> {
//          System.out.println(arg + "OK");
//      };
//      consumer1.accept("TestConsumerAccept - ");
//      Consumer < String > consumer2 = (x) -> {
//          System.out.println(x + "OK!!!");
//      };
//     /*Consumer<String> c3= consumer1.andThen(consumer2);
//     c3.accept("TestConsumerAfterThen - ");
//	*/
//	consumer2
//	.andThen(consumer1)
//	.accept("Testing ->");
//	
	}

}
