package collectors;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import static java.util.stream.Collectors.*;


public class StreamCollectors {
	public static void main(String[] args) {
		List<String> givenList = Arrays.asList("a", "bb", "ccc", "dd","bb","dd","a");
		List<Integer> numericList = Arrays.asList(101,2,56,46,78,330);
	
		//filter even and sum
		int evenTotal=numericList
				.stream()
				.filter(x->x%2==0)
				.collect(summingInt(x->x));
			System.out.println("Even total is: "+evenTotal);
			
			
			//filter odd and sum
			int oddTotal=numericList.stream().filter(x->x%2!=0).collect(summingInt(x->x));
				System.out.println("Odd total is: "+oddTotal);
				
		//Min Max value
		Optional<Integer> max = numericList.stream().collect(maxBy(Integer::compare));
		Optional<Integer> min = numericList.stream().collect(minBy(Integer::compare));
		System.out.println("Minimum value is: "+min);
		System.out.println("Maximum value is: "+max);
		
		
		
		//collect in list..
		List<String> resList=givenList.stream().collect(toList());
		System.out.println("List Result is: "+resList);
		
		
		
		//collect in set..
		Set<String> resSet=givenList.stream().collect(toSet());
		System.out.println("Set Result is: "+resSet);
		
		
		//Partitioning the list based on condition
		Map<Boolean,List<Integer>> result=numericList.stream().collect(partitioningBy(x->x>50));
		List<Integer> greaterThanFifty=result.get(true);
		List<Integer> lessThanFifty=result.get(false);
		System.out.println("Values less than 50 => "+lessThanFifty);
		System.out.println("Values greater than 50 => "+greaterThanFifty);
		
		
		//Summarizing the List
		IntSummaryStatistics r=numericList.stream().collect(summarizingInt(x -> x));
		System.out.println(r);
	}
}
