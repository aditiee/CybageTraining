package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamGenration {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(0,1,2,3,4,5);
		
		//method 1
		Stream<Integer> strint=list.stream();
		
		strint.forEach(System.out::println);
		
		//method 2
		Stream<String> str=Stream.of("one");
				str.forEach(System.out::println);
		
		//method 3
		Stream<String> str1=Stream.generate(()->"one");//generates values
		str1.limit(4).forEach(System.out::println); //limit it to 5		
		
				
		//method 4
		Stream<String> str2=Stream.iterate("+",p->p+"-");//iterates values
		str2.limit(4).forEach(System.out::println); //limit 
	}
}
