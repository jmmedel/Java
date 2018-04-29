package LinkedHasMap;

import java.util.*;
import java.util.Map.Entry;
public class LinkedHashMapDemo {

   public static void main(String args[]) {
      // Create a hash map
      LinkedHashMap<String, Double> lhm = new LinkedHashMap<String, Double>();
      
      // Put elements to the map
      lhm.put("Zara", (3434.34));
      lhm.put("Mahnaz", (123.22));
      lhm.put("Ayan", (1378.00));
      lhm.put("Daisy", (99.22));
      lhm.put("Qadir", (-19.08));
      
      // Get a set of the entries
      Set<Entry<String, Double>> set = lhm.entrySet();
      
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
      double balance = lhm.get("Zara").doubleValue();
      lhm.put("Zara", (balance + 1000));
      System.out.println("Zara's new balance: " + lhm.get("Zara"));
   }
}