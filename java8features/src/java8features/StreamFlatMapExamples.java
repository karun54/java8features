package java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/* 
– Both map() & flatMap() is an intermediate operation.
– Stream map() function is used to transform an input stream to a new output stream by applying a mapper function on each element.
-> What is a difference point with Stream flatMap() function?

<R> Stream<R> flatMap(Function<? super T, ? extends Stream<? extends R>> mapper);
The flatMap() function will do 2 things:
– Apply mapper function to transform each element of input stream.
– Then flattens the result to a new output stream. (Not with Java 8 Stream map() function) */

// List<List<Integer>> -> Stream -> FlatMap -> Stream -> Collectors.toList() -> List<Integer>
//below is implementation code 
public class StreamFlatMapExamples {
	  
	  public static void main(String[] args) {
	    List<List<Integer>> listOfList = Arrays.asList(
	          Arrays.asList(1, 2, 3, 4),
	          Arrays.asList(5, 6, 7, 8),
	          Arrays.asList(9, 10, 11, 12)
	        );  
	    
	    System.out.println(listOfList);
	    // [[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12]]
	    
	    List<Integer> results = listOfList.stream()
	          .flatMap(intList -> intList.stream())
	          .collect(Collectors.toList());
	    
	    System.out.println(results);
	    // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]
	    
	   //Combine flatMap() with map() 
	  //  List<List<Integer>> -> Stream -> FlatMap (using Map) -> Stream -> Collectors.toList() -> List<Integer>
	    
	    List<List<Integer>> arraylist = Arrays.asList(
	    	      Arrays.asList(1, 2, 3, 4),
	    	      Arrays.asList(5, 6, 7, 8),
	    	      Arrays.asList(9, 10, 11, 12)
	    	    );  
	    	 
	    	System.out.println(arraylist);
	    	// [[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12]]
	    	 
	    	List<Integer> results1 = arraylist.stream()
	    	      .flatMap(intList -> intList.stream().map(i -> i*2))
	    	      .collect(Collectors.toList());
	    	 
	    	System.out.println(results1);
	    	// [2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24]
	    	
	    	//Combine flatMap() with reduce()
	    	//List<List<Integer>> -> Stream -> FlatMap -> Stream -> Reduce -> Int
	    	
	    	List<List<Integer>> listOfList1 = Arrays.asList(
	    		      Arrays.asList(1, 2, 3, 4),
	    		      Arrays.asList(5, 6, 7, 8),
	    		      Arrays.asList(9, 10, 11, 12)
	    		    );  
	    		 
	    		System.out.println(listOfList1);
	    		// [[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12]]
	    		 
	    		int sum = listOfList1.stream()
	    		      .flatMap(intList -> intList.stream())
	    		      .reduce(0, (i1, i2) -> i1 + i2);
	    		 
	    		System.out.println(sum);
	    		// 78
	    //Combine flatMap() with filter()
	    //List<List<Integer>> -> Stream -> FlatMap ->  Filter -> Stream -> List<Integer>

	    		List<List<Integer>> listOfList2 = Arrays.asList(
	    			      Arrays.asList(1, 2, 3, 4),
	    			      Arrays.asList(5, 6, 7, 8),
	    			      Arrays.asList(9, 10, 11, 12)
	    			    );  
	    			 
	    			System.out.println(listOfList2);
	    			// [[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12]]
	    			 
	    			List<Integer> results2 = listOfList2.stream()
	    			      .flatMap(intList -> intList.stream())
	    			      .filter( i-> i%2==0).collect(Collectors.toList());
	    			 
	    			System.out.println(results2);
	    			// [2, 4, 6, 8, 10, 12]
//Stream FlatMap String List Example
//List<List<String>> -> Stream -> flatMap() -> filter() -> Stream -> Collectors.toList() -> List<String>

	    			List<List<String>> listOfList3 = Arrays.asList(
	    				      Arrays.asList("Java", "Django", "Vue", "Spring Cloud"),
	    				      Arrays.asList("Python", "Spring Boot", "React"),
	    				      Arrays.asList("Angular", "JQuery", "Spring JPA")
	    				    );  
	    				 
	    				System.out.println(listOfList3);
	    				// [[Java, Django, Vue, Spring Cloud], [Python, Spring Boot, React], [Angular, JQuery, Spring JPA]]
	    				 
	    				List<String> results3 = listOfList3.stream().flatMap(strList -> strList.stream()).filter(str -> str.contains("Spring")).collect(Collectors.toList());
	    				 
	    				System.out.println(results3);
	    				// [Spring Cloud, Spring Boot, Spring JPA]
	    				
	   //Stream FlatMap Custom Object List Example
	   //List<Developer> -> Stream<Developer> -> FlatMap -> Stream<String> -> Distinct -> Stream<String> -> Collectors.toSet() -> Set<String>



	  }
	}
