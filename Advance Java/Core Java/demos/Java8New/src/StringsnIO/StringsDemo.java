package StringsnIO;

import java.util.StringJoiner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StringsDemo {

	public static void main(String[] args) {
	
	/* I am using JAVA*/
		Stream<Integer> numStream=Stream.of(10,20,30);
		numStream.map(n->n+10).forEach(s->System.out.println(s));
		//numStream2.peek(s->System.out.println(s));
		//numStream.forEach(s->System.out.println(s));
		
		StringJoiner sj=new StringJoiner(" , ","{ "," }");
		sj.add("One").add(" Two").add("Three");
		System.out.println(sj);
		String s1=sj.toString();
		System.out.println(s1);
		
		//joining the String
		String sn=String.join(" ,","One","two","three","four"); //no prefix n postfix available use StringJoiner
	
		System.out.println(sn);
		
		//Streaming the string using chars() method
		//"hey duke".chars().forEach(x->System.out.println((char)x));*/
}
}
