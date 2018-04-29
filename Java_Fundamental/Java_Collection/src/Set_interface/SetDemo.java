package Set_interface;

import java.util.*;
public class SetDemo {

  public static void main(String args[]) { 
     // int count[] = {34, 22,10,60,30,22,};
      String count[] = {"CATY","JAMES","Adam","Brose"};
     // Set<Integer> set = new HashSet<Integer>();
      Set<String> set = new HashSet<String>();
      try {
         for(int i = 0; i < count.length; i++) {
            set.add(count[i]);
         }
         System.out.println(set);

        // TreeSet<Integer> sortedSet = new TreeSet<Integer>(set);
         TreeSet<String> sortedSet = new TreeSet<String>(set);
         System.out.println("The sorted list is:");
         System.out.println(sortedSet);

         //System.out.println("The First element of the set is: "+ (Integer)sortedSet.first());
         //System.out.println("The last element of the set is: "+ (Integer)sortedSet.last());
         System.out.println("The First element of the set is: "+ (String)sortedSet.first());
         System.out.println("The last element of the set is: "+ (String)sortedSet.last());
      }
      catch(Exception e) {}
   }
} 
