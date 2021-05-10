package java8features;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Reversecomparator1 {

	public static void main(String[] args) 
    { 
  
        // Creating a list of integers 
        List<Integer> list = Arrays.asList(-9, -18, 0, 25, 4); 
  
        System.out.println("The sorted stream is : "); 
           //Comparator.reverseorder() is a static method which is already implemented 
        //where as comparator.reversed() is a instance method 
        //https://github.com/frohoff/jdk8u-jdk/blob/master/src/share/classes/java/util/Comparator.java
        // displaying the stream with elements 
        // sorted in natural order 
        list.stream().sorted((c1,c2)->c2.compareTo(c1)).forEach(System.out::println); 
    } 

}
