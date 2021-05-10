package java8features;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {  
	   public static void main(String args[]) {  
	   // create and populate hash map  And insertion order is not preserved
	   HashMap<Integer, String> map = new HashMap<Integer, String>();           
	   map.put(101,"Let us C");  
	   map.put(102, "Operating System");  
	   map.put(103, "Data Communication and Networking"); 
	   map.put(103, "hi how r u");
	   map.put(103, "hi how r u");
	   map.put(103, "hi u");
	   map.put(106, "hi u");
	   map.put(null,"kafi");
	   map.put(null,"ramanji");//it allows only one null key ,if another one is there it will replace null key with new value.in the example 
	   //null with kafi is replaced with new value ramanji.
	   map.put(109,"" );
	   map.put(110,"");
	   String str=map.get(null);
	   System.out.println(str);
	   System.out.println("Values before remove: "+ map);  
	   System.out.println("set view of mapping:"+map.entrySet());
	   // Remove value for key 102  
	  // String s= map.remove(102);  
	  // System.out.println("Values after remove: "+ map);  
	  // System.out.println(" removed value: "+ s);  
	  Map m2=Collections.synchronizedMap(map);
	  Set<Map.Entry> s=m2.entrySet();
	  synchronized(m2)
	   {
	   for(Map.Entry m1:s)
	   {
		//   int key=m1.getKey();  
	     //  System.out.println(key);  
		   System.out.println(m1);
	   }
	   }
	   }
	}  
