package ZExample_Array;

import java.lang.reflect.Array;
import java.util.Arrays;
//How to sort an array and search an element inside it?
public class Arraysort {
	   
	   public static void main(String[] args) {
	      int arr[] = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 }; 
	      System.out.println("Array Before  Sort");
	      
	      for(int i = 0; i < arr.length; i++) {
	         System.out.print(arr[i] + " ");
	      } 
	      System.out.println();
	      Arrays.sort(arr);
	      System.out.println("Array After Bubble Sort");
	      
	      for(int i = 0; i < arr.length; i++) {
	         System.out.print(arr[i] + " ");
	      } 
	   }  
	}  
