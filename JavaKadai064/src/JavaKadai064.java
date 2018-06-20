import java.util.*;
public class JavaKadai064 {

	 static Scanner input = new Scanner (System.in);
	    public static void main (String[] args)
	    {
	    double i;
	    double sum = 0;
	    
	    System.out.println("Data_input");
	    while(input.hasNextDouble())
	    {
	        System.out.println("input");
	        i = input.nextDouble();
	        sum = sum + i;

	    }
	    System.out.println("sum is " + sum );
	   
	}
}
