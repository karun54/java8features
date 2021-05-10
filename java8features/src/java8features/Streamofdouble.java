package java8features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streamofdouble {

	public static void main(String[] args) {
		
		Stream.of(1.0, 2.0, 3.0).mapToInt((Double d)->d.intValue()).mapToObj(i -> "a" + i).forEach(System.out::println);
		String str="strings";
		StringBuilder str1=new StringBuilder();
		str.chars().distinct().forEach(c->str1.append((char)c));
		System.out.println("after removing duplicates:"+str1);
		 char s[] = { 'g', 'e', 'e', 'k', 
                 's', 'f', 'o', 'r', 
                 'g', 'e', 'e', 'k', 's' }; 
		 String string = String.valueOf(s);//to convert char array to string use String.valueOf(char[])
		 System.out.println(string);
		 
		 Stream<Integer> stream 
         = Stream.of(5, 13, 4, 
                     21, 13, 27, 
                     2, 59, 59, 34); 
		 Set<Integer> items = new HashSet<>(); 
		 Set<Integer> items1=stream 
		  
         // Set.add() returns false 
         // if the element was 
         // already present in the set. 
         // Hence filter such elements 
         .filter(n -> !items.add(n)) 

         // Collect duplicate elements 
         // in the set 
         .collect(Collectors.toSet());
		 System.out.println(items1);
		 //https://grokonez.com/java/java-8/how-to-use-java-8-stream-flatmap-examples-with-list-array
		 //flatmap vs map
		 List<String> list = Arrays.asList("Geeks", "GFG","GeeksforGeeks", "gfg"); 
		 System.out.println("following flatterns stream of streams to stream and pritns elements in this stream mapping+flatterns  ");
		 //The flatMap() method first flattens the input Stream of Streams to a Stream of Strings and prints stream of strings using forEach()
		 list.stream().flatMap(str2 ->  Stream.of(str2.charAt(2))).forEach(System.out::println); 
		 System.out.println("following prints stream of streams");
		 //the map() doesnt flatterns the  stream of streams directly printd the stream of streams using forEach()
		 list.stream().map(str3 -> Stream.of(str3.charAt(1))).forEach(System.out::println);
		 String A = "abc"; 
		 String B=Arrays.asList(A).stream().map(str3 -> new StringBuilder(str3).reverse().toString()).collect(Collectors.toList()).get(0);

	        if (A.equals(B))
	            System.out.println("YES");
	            else 
	            System.out.println("No");
	       //write a java program to capitalize the first letter of each word in a sentence. 
	        String upper="hello how are you";
	        String[] charArray = upper.split(" ");
           List<String>string5= Arrays.asList(charArray).stream().map(word->{
            	                                          String upper_case_line = "";
            	                                          upper_case_line += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
            return   upper_case_line.trim();                                           
            }).collect(Collectors.toList());
           String string6 = String.join(" ", string5);
           System.out.println(string6);
           int size=3;
           String text = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
           List<String> parts = new ArrayList<>();
            int length = text.length();
           for (int i = 0; i < length; i += size) {
               parts.add(text.substring(i, Math.min(length, i + size)));
                   }
           System.out.println(parts);
	}

}
