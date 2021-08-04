package Fundamentals2;

public class Array {
	
	public static void main(String args[])
	{
	int numbers[] = new int[]{3,5,7,9,2,4,23,87,1,6};
    int smallest = numbers[0];
    int biggest = numbers[0];
   
    for(int i=1; i< numbers.length; i++)
    {
            if(numbers[i] > biggest)
                    biggest = numbers[i];
            else if (numbers[i] < smallest)
                    smallest = numbers[i];
           
    }
   
    System.out.println("Largest Number is : " + biggest);
    System.out.println("Smallest Number is : " + smallest);
}

}
