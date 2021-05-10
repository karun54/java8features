package java8features;

import java.util.HashMap;

public class computeifputifabscent {
	//Difference #1
//computeIfAbsent takes a mapping function, that is called to obtain the value if the key is missing.
//putIfAbsent takes the value directly.
	//Difference #2
//computeIfAbsent returns "the current (existing or computed) value associated with the specified key, or null if the computed value is null".
//putIfAbsent returns "the previous value associated with the specified key, or null if there was no mapping for the key".
//So, if the key already exists, they return the same thing, but if the key is missing, computeIfAbsent returns the computed value, while putIfAbsent return null.
	
	public static int getvalue()
	{
		int i=30;
		System.out.println("called");
		return i;
	}

	public static void main(String[] args) {
 HashMap<Integer,Integer> map1=new HashMap<Integer,Integer>();
 map1.putIfAbsent(2, 1);		
 Integer value1=map1.putIfAbsent(3, getvalue());//here it takes the value directly by calling the getValue() it takes this value means compulsory it will call this getValue() method for value.
 Integer value2=map1.computeIfAbsent(4, key->getvalue1(key));//here it takes the mappingFunction directly
 System.out.println("value1"+value1);
 System.out.println("value2"+value2);
 map1.forEach((k,v)->System.out.println("key:"+k+"value:"+v));
 //https://stackoverflow.com/questions/48183999/what-is-the-difference-between-putifabsent-and-computeifabsent-in-java-8-map
		
	}

	private static int getvalue1(Integer key) {
		int j=33;
		System.out.println("called1");
		return j;
	}

}
