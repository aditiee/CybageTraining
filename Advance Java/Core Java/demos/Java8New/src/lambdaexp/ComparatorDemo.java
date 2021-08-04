package lambdaexp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;




public class ComparatorDemo{
public static void main(String[] args) {
	/*Comparator<String> comp=new Comparator<String>() {
		//Anonymous class
		@Override
		public int compare(String o1, String o2) {
		// TODO Auto-generated method stub return Integer.compare(o1.length(),o2.length());
		}
	};
	*/
	
	Comparator<String> comp1=(o1, o2) -> Integer.compare(o1.length(),o2.length());
	Comparator<String> comp2=(o1, o2) -> Integer.compare(o1.length(),o2.length());
	Comparator<String> comp3=(o1, o2) -> Integer.compare(o1.length(),o2.length());
	
	List<String> l=new ArrayList<String>();
	l.add("****");
	l.add("***");
	l.add("*****");
	l.add("***");
	l.add("**");
	
	Collections.sort(l,(o1, o2) -> Integer.compare(o1.length(),o2.length()));

	//l.forEach(System.out::println); //other way to write lamda exp
	
	for(String s:l)
	System.out.println(s);
}
}
