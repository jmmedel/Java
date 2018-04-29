package ZExample_Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Arrayreverse {
	   public static void main(String[] args) {
	      int[] numbers = { 10, 200, 31, 4, 5, 6, 7, 8, 9, 10,3 };
	      System.out.println("Array before reverse:");
	      Arrays.sort(numbers);
	      for(int x:numbers){
	    	  System.out.print(x+" ");
	    	  
	    	  
	      }
	      System.out.println();
	      System.out.println(numbers.length);
	      
	      for (int i = numbers.length -1; i >= 0; i--){
	    	    System.out.print(numbers[i] + " ");
	    	
	      }
	   }
}