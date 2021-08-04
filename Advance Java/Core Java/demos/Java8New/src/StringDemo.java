import java.text.DateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.*;

import javax.swing.text.DateFormatter;


interface I{
	
	default void show(){
		System.out.println("Welcome");
	}
	
}

interface J{
	default void show(){
		
	};
}
interface show
{
	 void showr(int i);
}

public class StringDemo implements I,J {
	public void show()
	{
		
	}
	
public static void main(String[] args) {
	
	/*show s=new show(){//anonymous class
		
		public void showr(int i){
			System.out.println("Hello : "+i);
		}
	};*/
	I s = null;
	s.show();
	List<Integer> array=new ArrayList<>();
	array.add(23);
	array.add(3);
	array.add(2);
	array.add(33);
	array.add(13);
	
	array.forEach(i->System.out.println(i*3));
	
	show r=e->{System.out.println("Hello : "+e);}; //Lamda Expression
	
	r.showr(34);
	/*String joined = String.join("/","usr","local","bin");
	System.out.println(joined);
    
	String anotherDate = "04 Apr 2016";

	DateTimeFormatter df = DateTimeFormatter.ofPattern("dd MMM yyyy");
	LocalDate random = LocalDate.parse(anotherDate, df);
	System.out.println(LocalDate.now().lengthOfMonth());
	System.out.println(anotherDate + " parses as " + random);

	 
	String ids = String.join(", ", ZoneId.getAvailableZoneIds());
	System.out.println(ids);
*/
}//main
}//class
	 
