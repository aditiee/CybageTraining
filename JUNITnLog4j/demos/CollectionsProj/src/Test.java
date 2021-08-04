import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;



public class Test {

	public static void main(String[] args) {
		
		List<Employee> listOfEmployee=Arrays.asList(new Employee(101, "Jeff",78666),
				new Employee(103, "Rodson",76666),
				new Employee(106, "John",98666),
				new Employee(111, "Harry",88666),
				new Employee(102, "Sam",95666));
		
		
		long totalEmp=listOfEmployee.stream()
		.filter((e)-> e.getSalary() >90000)
		.count();
		
		System.out.println("Count of employee with salary > 90k is: "+totalEmp);
		
		//emp names list
		List<String> emplNames=listOfEmployee.stream()
				.map(Employee::getEname)
				.collect(Collectors.toList());
		
		emplNames.stream().forEach(System.out::println);
		
		DoubleSummaryStatistics totalSal=listOfEmployee.stream()
		.collect(Collectors.summarizingDouble(Employee::getSalary));
		
		System.out.println("Minimum salary: "+totalSal.getMin());
		System.out.println("Max salary: "+totalSal.getMax());
		System.out.println("Minimum salary: "+totalSal.getMin());
		System.out.println("Minimum salary: "+totalSal.getMin());
		
		//method1
		List<Employee> sortedBySal= listOfEmployee.stream()
		.sorted(Comparator.comparingDouble(Employee::getSalary))
		.collect(Collectors.toList());
		
		//method2
		Collections.sort(listOfEmployee, Comparator.comparingDouble(Employee::getSalary));
		
		//Collections copy,reverse,shuffle
		//Collections.reve
		
		listOfEmployee.forEach(System.out::println);
		
		//partitionBy
		
		Map<Boolean, List<Employee>> myMap=listOfEmployee.stream()
		.collect(Collectors.partitioningBy((e)->e.getSalary() >80000 ));
		
		Map<Boolean,Long> myMapCount=listOfEmployee.stream()
				.collect(Collectors.partitioningBy((e)->{ return e.getSalary() > 80000 ;},Collectors.counting()));
				
		myMap.forEach((k,v)->System.out.println(k+" "+v));
		
		myMapCount.forEach((k,v)->System.out.println(k+" Count: "+v));
		
	}
}
