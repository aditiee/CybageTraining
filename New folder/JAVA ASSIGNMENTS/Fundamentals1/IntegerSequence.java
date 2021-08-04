package Fundamentals1;

public class IntegerSequence {
	
	void Display(int sequenceOfIntger)
	{ 

       
        String sequence = Integer.toString(sequenceOfIntger);
 
      
        for (int i = 0; i <  sequence.length(); i++) {
 
          
            System.out.print( sequence.charAt(i)+" ");
        }
    }
	

}
