package functionalintf;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import sun.nio.cs.ext.Big5_Solaris;



public class BiConsumerDemo {
   public static void main(String[] args) {
       
	   Map<Integer,String> map = new HashMap<>();
       map.put(1, "John");
       map.put(2, "Rebecca");
       map.put(3, "Samuel");
       
       BiConsumer<Integer,String> print=(empid,empname)->
       System.out.println("Empl Id: "+empid+" Emp Name: "+empname);  
    
       map.forEach(print);
       
       }
   }
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
        
                       
//                      
//      BiConsumer<Integer, String> biconsumer=(x,y)->System.out.println("EmpId: "+x+"employee Name: "+y);
//      BiConsumer<Integer, String> secondBiconsumer=(x,y)->System.out.println("Id: "+x+"Person Name: "+y);
//      
//      
//    map.forEach(biconsumer.andThen(secondBiconsumer));
//  
//    
//  
//  
//  List<String> names=new ArrayList<String>();
//  
//  names.add("John");names.add("Samuel");
//  
//  names.forEach((name)->System.out.println(name));
//  
  
  
  
  
//  BiConsumer<Integer,String> biconsumer2=(x,y)->System.out.println("Emp Name: "+y);
//   
//  map.forEach(biconsumer2.andThen(biconsumer));
  
  
// map.forEach( biconsumer.andThen((x,y)->System.out.println(x)));
       
       
      
       
       
       
       
       
       
       
       
       
          
       
       
       
       
       
      
/*BiConsumer biConsumer1 = (k,v)-> System.out.println("Key: "+k+" Value: "+v);
BiConsumer biConsumer2 = (x,y)->{System.out.print("Length of name: "+((String) y).length());};
            BiConsumer b3=biConsumer1.andThen(biConsumer2);
  map.forEach(b3);*/
  
  
  
       

