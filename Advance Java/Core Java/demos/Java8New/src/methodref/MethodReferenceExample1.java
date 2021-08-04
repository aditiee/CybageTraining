package methodref;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

class EvenOddCheck {
	
	   public static boolean isEven(int n) {
	      return n % 2 == 0;
	   }
	   public boolean isOdd(){
		  return false; 
	   }
	}

	public class MethodReferenceExample1 {

	   public static void main(String[] args) {
		  // EvenOddCheck eodd=new EvenOddCheck() ;
		   
	      // Using lambda expression
	      Predicate<Integer> predicate1 = (n) -> EvenOddCheck.isEven(n);
	      System.out.println(predicate1.test(20));

	      // Using method reference
	      Predicate<Integer> predicate2 = EvenOddCheck::isEven;
	      System.out.println(predicate2.test(25));
	            
	      
	      String[] stringArray = { "Steve", "Rick", "Aditya", "Negan", "Lucy", "Sansa", "Jon"};
	  	
	      List<String> languages=Arrays.asList("Java","PHP","Phyton");
	      /* Method reference to an instance method of an arbitrary 
	  	 * object of a particular type
	  	 */
	      //Comparator<String> ignoreCase=(s,s2)-> s.compareToIgnoreCase(s2);
	      
	  	Arrays.sort(stringArray, String::compareToIgnoreCase);
//	  	Consumer<String> consumer=;
	  	
	  	languages.forEach(System.out::println);
	      for(String s:stringArray)System.out.println(s);
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      List<Integer> numbers = Arrays.asList(20, 10, 15, 24, 55, 47, 16, 87, 88);

	      // Print even numbers using lambda expression
	      numbers.stream().map((n) -> EvenOddCheck.isEven(n))
	          .forEach((n) -> System.out.println(n));
	      
	      // Print even numbers using method references
	      numbers.stream().map(EvenOddCheck::isEven)
	         .forEach(System.out::println);
	      
	   }
	}
