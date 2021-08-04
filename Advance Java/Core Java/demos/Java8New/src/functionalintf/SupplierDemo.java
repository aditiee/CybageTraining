package functionalintf;


	import java.util.ArrayList;
	import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;
	 
	
	public class SupplierDemo {
	    public static void main(String[] args) {
	 
	        System.out.println("E.g. #2 - Java8 Supplier Example\n");
	 
	        List<String> names = new ArrayList<String>();
	        names.add("Harry");
	        names.add("Daniel");
	        names.add("Lucifer");       
	        names.add("April O' Neil");
	 
	        Consumer<String> consumer=(item)-> {
	            printNames(()->item);
	        };
	        
	        names.forEach(consumer);
	    }
	 
	    private static void printNames(Supplier<String> supplier) {
	        System.out.println(supplier.get());
	    }
	}


