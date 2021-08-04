package functionalintf;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;


public class BiFunctionDemo {

	public static void main(String[] args) {
		
		 Map<Integer,String> map = new HashMap<>();
	       map.put(1, "John");
	       map.put(2, "Rebecca");
	       map.put(3, "Samuel");
	       
        BiFunction<Integer, String, String> biFunction =      		
        (num1, num2) -> "One record Employee Name: " + num2+" Employee id: "+num1;
        		
        BiConsumer<Integer, String> biconsumer=(t,u)->{
        	System.out.println(biFunction.apply(t, u));	};
        	
        map.forEach(biconsumer);
        
        		
        //System.out.println(biFunction.apply(20,25));
    }    
} 
