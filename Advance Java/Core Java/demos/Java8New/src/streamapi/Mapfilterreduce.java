package streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.*;

import com.sun.xml.internal.bind.v2.model.util.ArrayInfoUtil;

import sun.awt.PeerEvent;

public class Mapfilterreduce {
	public static void main(String[] args) {
		
		
		List<String> nams=Arrays.asList("Asim","John","Samuel");
		List<String> l;
		
		List<String> sortedNames=nams.stream()
		.filter((n)->n.startsWith("A"))
		.collect(Collectors.toList());
		
		
		sortedNames.forEach(System.out::println);
		
		
				
		List<Person> person=Arrays.asList(
					new Person("Sham",23,"Camp"),	
					new Person("Ram",34,"Sangli"),
					new Person("John",34,""),
					new Person("Chelsea",34,"US"),
					new Person("Alice",45,"SanFransico"),
					new Person("Brain",28,"Cambridge")
					);
				
		
		Stream<Person> myopertn=person.stream()
		.skip(2) 
		.limit(3)
		.filter((p)->(p.getAge()>40));
		
		myopertn.forEach(System.out::println);
		
		List<Person> personsList=myopertn.collect(Collectors.toList());
		
		personsList.forEach(System.out::println);
		
		
		
		
		int[] rollnos= {89,56,77,88,33,11,84};
		
		
		//max rollno
		//Integer maxRollno=rollnos.stream().max(Integer::compare).get();
		
		//System.out.println("Max rollno: "+maxRollno);
		System.out.println("Max rollno: "+Arrays.stream(rollnos).max());
		
		
		//min rollno
		
		//count of rollno
		
		//summing up all integer values.
		
		
		
		//select ranges
			
			//	System.out.println(person);
				
				
				
				
				
				
		Stream<Person> Pstream=person.stream();
		
		
		
		
		System.out.println("All match: "+Pstream.allMatch(p->p.getAge()>30));
		
	
		
		List<Person> listOfPerson=person.stream()
		.filter(p->p.getName().contains("a"))
		.collect(Collectors.toList());
		
		//System.out.println(listOfPerson);
		listOfPerson.forEach(System.out::println);
		
		//match reductions are terminal operations
		System.out.println("Any Match: "+person.stream().
		anyMatch(s->s.getAge()>30)); //anyMatch()  allMatch() noneMatch
		
		//findReduction
	//	Optional<Person> opt=person.stream().findFirst(p->p.getAge()>30);
	
			
	}

}
