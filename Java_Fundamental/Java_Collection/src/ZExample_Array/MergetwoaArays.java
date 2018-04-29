package ZExample_Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/*
 * 
 * How to merge two arrays ?
 * This example shows how to merge two arrays into a single 
 * array by the use of list.Addall(array1.asList(array2) method 
 * of List class and Arrays.toString () method of Array class.
 * 
 * */
public class MergetwoaArays {
   public static void main(String args[]) {
      String a[] = { "A", "E", "I" };
      String b[] = { "O", "U" };
      List<Object> list = new ArrayList<Object>();
      list.add(Arrays.asList(a));
      list.add(Arrays.asList(b));
      Object[] c = list.toArray();
      System.out.println(Arrays.toString(c));
   }
}