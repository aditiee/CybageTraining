package streamapi;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Stream;

public class FlatMapDemo {

	public static void main(String[] args) {
		
		//Map<String,Map<String,Integer>> dictonary=
		  String[][] data = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};
		 
		Stream<String> stream = Arrays.stream(data)
        .flatMap(x -> Arrays.stream(x))
        .filter(x -> "a".equals(x.toString())); 
		
		stream.forEach(System.out::print);

	}
}
