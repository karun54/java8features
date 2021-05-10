package java8features;

import java.util.Scanner;

public class getSmallestAndLargest {

 public static String getSmallestAndLargest(String s, int k) 
    { 
        // Initialize min and max as first substring of size k 
        String currStr = s.substring(0, k); 
        String lexMin = currStr; 
        String lexMax = currStr; 
   
        // Consider all remaining substrings. We consider 
        // every substring ending with index i. 
        for (int i = k; i < s.length(); i++) { 
            currStr = currStr.substring(1, k) + s.charAt(i); 
            if (lexMax.compareTo(currStr) < 0)      
                 lexMax = currStr; 
            if (lexMin.compareTo(currStr) > 0) 
                 lexMin = currStr;             
        } 
             
        // Print result. 
       // System.out.println(lexMin); 
       // System.out.println(lexMax); 
       return lexMin + "\n" + lexMax;
    } 
    
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        int n = scan.nextInt();
        scan.close();
          System.out.println(getSmallestAndLargest(s, k));
          for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", n, i, n*i);
        }
        
    String input="i am lazy i am lazy";
    String words[] =input.split(" ");
    
     }
}