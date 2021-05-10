package java8features;

import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

public class Hashtable1 {

	public static void main(String[] args) {
		 Hashtable<Integer,String> hm=new Hashtable<Integer,String>();  
		  //does not maintain insertion order or insertion order is not preserved
		  hm.put(100,"Amit");  
		  hm.put(102,"Ravi");  
		  hm.put(101,"Vijay");  
		  hm.put(103,"Rahul");  
		 //hm.put(null,"ramu");//here jvm throws NullPointerexception
		  //hm.put(121,null);//here hashtable class throws NullPointerException bcz in hashtable it 
		  //is going to check whether there is a null value which we are inserting ,if we insert null it throws null poinerexception
		  for(Map.Entry m:hm.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }  
		 }  
}