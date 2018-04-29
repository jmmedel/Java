package Map.Entry_Interface;

import java.util.*;
import java.util.Map.Entry;
public class HashMapDemo {

   public static void main(String args[]) {
      // Create a hash map
      HashMap<String, Double> hm = new HashMap<String, Double>();
      // Put elements to the map
     
      hm.put("Zara", 3434.34);
      hm.put("Mahnaz", 123.22);
      hm.put("Ayan", 1378.00);
      hm.put("Daisy", 99.22);
      hm.put("Qadir", -19.08);
      
      // Get a set of the entries
      Set<Entry<String, Double>> set = hm.entrySet();
      
      // Get an iterator
      Iterator<Entry<String, Double>> i = set.iterator();
     
      // Display elements 
      while(i.hasNext()) {
         Map.Entry me = (Map.Entry)i.next();
         System.out.print(me.getKey() + ": ");
         System.out.println(me.getValue());
      }
      
      System.out.println();
     
      // Deposit 1000 into Zara's account
      double balance = hm.get("Zara").doubleValue();
      hm.put("Zara", (balance + 1000));
      System.out.println("Zara's new balance: " + hm.get("Zara"));
   }
}