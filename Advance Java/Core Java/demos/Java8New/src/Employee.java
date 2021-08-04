import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Employee{
	
	   private Integer id;
	    private String firstName;
	    private String lastName;
	    private Integer age;
	    
	     
	    public Employee(Integer id, String firstName, String lastName, Integer age){
	        this.id = id;
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.age = age;
	    }
	     
	    //Other getter and setter methods
	     
	    @Override
	    public String toString() {
	        return "\n["+this.id+","+this.firstName+","+this.lastName+","+this.age+"]"; 
	    }
	    private static  List<Employee> getEmployees(){
	        List<Employee> employees  = new ArrayList<>();
	        employees.add(new Employee(1,"Lokesh", "Gupta", 32));
	        employees.add(new Employee(2,"Aman", "Sharma", 28));
	        employees.add(new Employee(3,"Aakash", "Yaadav", 52));
	        employees.add(new Employee(4,"James", "Hedge", 72));
	        employees.add(new Employee(5,"David", "Kameron", 19));
	        employees.add(new Employee(6,"Yash", "Chopra", 25));
	        employees.add(new Employee(7,"Karan", "Johar", 59));
	        employees.add(new Employee(8,"Balaji", "Subbu", 88));
	        employees.add(new Employee(9,"Vishu", "Bissi", 33));
	        employees.add(new Employee(10,"Lokesh", "Ramachandran", 60));
	        return employees;
	    }
	    
	    
	    public static void main(String[] args) {
	    	List<Employee> employees  = getEmployees();
	        
	    //Sort all employees by first name; And then reversed
	    //    Comparator<Object> comparator = Comparator.comparing(e -> ((Employee) e).getFirstName());
	    //    employees.sort(comparator.reversed());
	         
	    //    Let's print the sorted list
	       System.out.println(employees);
		}
}