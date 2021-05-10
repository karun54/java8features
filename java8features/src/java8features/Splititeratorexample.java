package java8features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Spliterator;
 
public class Splititeratorexample {
//https://learnjava.co.in/java-8-splititerator/
//https://www.quora.com/What-is-a-spliterator-in-Java-8
//It is a new interface added to java.util in Java 8, special kind of Iterator that can traverse a Collection. Also, new method is added to Collection called spliterator() that returns a Spliterator.
//It basically splits a Collection, partitioning off some of its elements as another Spliterator. It can be usefull for parallel programming.
//The additional benefit that SplitIterator provides over Iterator is that it can be used for parallel iteration. 
//It does this by splitting the iteration into two parts. I have written a detailed blog post on this. You can check it out here.
	    public static void main(String[] args) 
	    {
	        ArrayList<Integer> digits = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
	 
	        Spliterator<Integer> splitItr = digits.spliterator();

	        splitItr.tryAdvance( d -> System.out.println("hi" +d ) );
	        splitItr.tryAdvance( d -> System.out.println("hi" +d ) );
	        splitItr.tryAdvance( d -> System.out.println("hi" +d ) );
	        splitItr.forEachRemaining(System.out::println);
	        System.out.println("===========");

	        ArrayList<Integer> digits1 = new ArrayList<>(Arrays.asList(7,8,9,10,11,12));
	        Spliterator<Integer> splitItr1 = digits1.spliterator();
	        Spliterator<Integer> splitItr2 = splitItr1.trySplit();
	        System.out.println(splitItr1.getExactSizeIfKnown());         
	        splitItr1.forEachRemaining( d -> System.out.println( d ) );     
	         
	        System.out.println("===========");
	         
	        System.out.println(splitItr2.getExactSizeIfKnown());           
	        splitItr2.forEachRemaining( d -> System.out.println( d ) ); 
	        
	        //A Spliterator is a special type of Iterator to traverse and partition the elements
	        //of a source in Java. A source can be a collection, an IO channel or a generator function.
/* Main differences between Iterator and Spliterator are as follows:
 I. Spliterator can be used with Streams in Java 8. Where as, Iterator is just used with Collection.
II. Spliterator uses Internal Iteration to iterate Streams.
Iterator uses External Iteration to iterate Collections.
III. Spliterator can iterate Streams in Parallel as well as Sequential manner. Iterator only iterates in Sequential manner.
IV. Spliterator can traverse elements individually as well as in bulk. Iterator only iterates elements individually. */
	        
	    }
	
}