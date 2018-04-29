package ZExample_Array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

 public class LargesttoSmallerst {
	   public static void main(String[] args) {
	      int numbers[] = new int[]{99, 2, 7, 1, 4, 9, 500};
	      int smallest = numbers[0];
	      int largest =  numbers[0];
	      System.out.println(largest);
	      System.out.println(numbers.length);
	      for(int i = 0; i< numbers.length; i++) {
	         if(numbers[i] > largest){largest = numbers[i];}
	         else if (numbers[i] < smallest){smallest = numbers[i];}
	      } 
	      System.out.println("Largest Number is : " + largest);
	      System.out.println("Smallest Number is : " + smallest);
	   }
	}