import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/*class Do extends PractiveOCA8{
	Do()
	{
		System.out.println("Default constructor");
	}
	Do(int i){System.out.println("Parameterized");}
	public void show(){System.out.println("Show in child");}
}*/
public class PractiveOCA8 {

	public PractiveOCA8() {
	System.out.println("In parent const");
	}
	PractiveOCA8(int i){
		System.out.println("in parent para const");
	}
	public static void main(String[] args) {
		
		//PractiveOCA8 p=new Do(3);
	
	//	p.show();
/*	String s1 = "Java";
	String s2 = "Java";
	StringBuilder sb1 = new StringBuilder();
	sb1.append("Ja").append("va");
	System.out.println(s1 == s2);
	System.out.println(s1.equals(s2));
	System.out.println(sb1.toString() == s1);
	System.out.println(sb1.toString().equals(s1));*/
		
		
		
		/*boolean keepGoing = true;
		 int count = 0;
		 int x = 3;
		 while(count++ < 3) {
			 System.out.println(count);
		 int y = (1 + 2 * count) % 3;
		 System.out.println(y);
		 switch(y) {
		 default:
		 case 0: x -= 1; break;
		 case 1: x += 5;
		 }
		 }
		 System.out.println(x);
		 }*/
		
		
		/*try{
			throw new IllegalArgumentException();
		}catch(RuntimeException e){System.out.println(e);}
			finally{System.out.println("Finally");}
	System.out.println("Welxcome");
	*/
		
		
		/*int a[]={6,7,8};
		List l=new ArrayList<Integer>();
		
		l.add(a[0]);
		System.out.println(l);*/
		
		
		/*int x = 5, j = 0;
		 OUTER: for(int i=0; i<3; )
		 INNER: do {
		 i++; x++;
		 if(x > 10) break INNER;
		 x += 4;
		 j++;
		 } while(j <= 2);
		 System.out.println(x);
		*/
		System.out.println(test((i)-> {return i==5;}));
		
	}
	
	private static boolean test(Predicate<Integer> p) {
		 return p.test(5);
	}
}
