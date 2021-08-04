package functionalintf;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateExample {

	static public String maxLength(List<String> l,BiPredicate<String,Integer> maxL){
		String s="";int max=0;
		for(String s1:l){
			if(maxL.test(s1,max)){
				max=s1.length();
				s=s1;
			}
		
	}
		return s;
	}
	
	
	
	public static void main(String[] args) {
		
		
List<String> languages =Arrays.asList("Java","JQuery", "Scala", "C++", "Haskell", "Lisp");
	

System.out.println("Languages which starts with J :");
		
Predicate<String> startWithJ=(s)-> s.startsWith("J");
Predicate<String> endsWithJ=(s)-> s.endsWith("a");

startWithJ.and(endsWithJ);
//Predicate<String> newP=startWithJ.and(endsWithJ);

languages.forEach((name)->{
	if(endsWithJ.test(name))
	System.out.println(name);
});

//for(String name:languages){
//if(startWithJ.test(name))
//	System.out.println(name);
//}

//				BiPredicate<String,Integer> maxL=(s,l)->s.length()>l;
//				System.out.println("Maximum Length: "+maxLength(languages,maxL));
//		
//				
//				
//				
//				
//				
//				
//				
//				
//				
//				
//				
//				
//				
//				
//				
//				
//				
//				
//				
//				
//				
//				
//				
//		Predicate<String> p1=(n) -> n.startsWith("J");
//		Predicate<String> p2=(n) -> n.length()<5;
//		Predicate<String> p3=p1.and(p2);
//		Predicate<String> p4=p1.or(p2);
//		for(String x:languages){
//			if(p2.test(x))
//				System.out.println(x);
//		}
//		
//		//filter(languages,startJ);
//		
//		/*Predicate< String> lengthC=(x)-> x.length()>4;
//		
//		filter(languages, startJ.and(lengthC));
//		
//		Predicate<String> combination=startJ.and(lengthC);
//		
//		
//		
//		Predicate<String> p3and=startJ.and(s-> s.equals("C++"));
//		Predicate <Integer> p=(x)-> x<12;
//		
//		
//		Predicate<String> p3n=startJ.negate();
//		//p3.and(p);
//		
//		
//		for(String x:languages){
//			if(startJ.test(x))
//				System.out.println(x);
//		}
//		
//		Predicate<String> endJ=(n) -> n.endsWith("J");
//		
//		filter(languages,endJ);
//		Predicate<String> length=(n) -> n.length()>5;
//		
//		filter(languages,length);
//		Predicate<String> p1=(str)->((String) str).startsWith("J");
//		filter(languages,p1);
//		Predicate<String> p2=(str)->((String) str).endsWith("a");
//		System.out.println("Languages which ends with a "); 
//		filter(languages, p2); 
//		Predicate<String> p3=p1.and(p2);
//		System.out.println("Languages starts with J and which ends with a "); 
//		filter(languages, p3); 
//		System.out.println("Print all languages :"); 
//		filter(languages, (str)->true); 
//		System.out.println("Print no language : "); 
//		filter(languages, (str)->false); 
//		System.out.println("Print language whose length greater than 4:"); 
//		filter(languages, (str)->((String) str).length() > 4);*/ 
//		}
//	public static void filter(List<String> names, Predicate<String> condition)
//	{ 
//		for(String name: names)
//		{ if(condition.test(name)) 
//		 System.out.println(name + " ");
//		} 
//		
//	}
	}
	
}
