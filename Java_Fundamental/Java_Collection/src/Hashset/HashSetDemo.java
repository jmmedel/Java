package Hashset;

import java.util.*;
public class HashSetDemo {

   public static void main(String args[]) {
      // create a hash set
      HashSet<String> hs = new HashSet<String>();
      
      // add elements to the hash set
      hs.add("B");
      hs.add("A");
      hs.add("D");
      hs.add("E");
      hs.add("C");
      hs.add("F");
      System.out.println(hs);
      Iterator<String> itr=hs.iterator();  
      while(itr.hasNext()){  
       System.out.print(itr.next());  
   }
   }
}