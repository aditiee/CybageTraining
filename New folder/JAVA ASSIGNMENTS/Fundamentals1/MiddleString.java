package Fundamentals1;

public class MiddleString {
	
	 public String middle(String str)
	    {
	        int position;
	        int length;
	        if (str.length() % 2 == 0)
	        {
	            position = str.length() / 2 - 1;
	            length = 2;
	        }
	        else
	        {
	            position = str.length() / 2;
	            length = 1;
	        }
	        return str.substring(position, position + length);
	    }

}
