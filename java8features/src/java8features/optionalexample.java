package java8features;
import java.util.Optional; 


public class optionalexample {

	   public static void main(String[] args) {    
	      String[] str = new String[10];     
	      Optional<String> isNull = Optional.ofNullable(str[9]);        
	      if(isNull.isPresent()){     
	         //Getting the substring           
	         String str2 = str[9].substring(2, 5);          
	         //Displaying substring           
	         System.out.print("Substring is: "+ str2);       
	      }     
	      else{      
	         System.out.println("Cannot get the substring from an empty string");     
	      }                
	      str[9] = "AgraIsCool";       
	      Optional<String> isNull2 = Optional.ofNullable(str[9]);       
	      if(isNull2.isPresent()){        
	         //Getting the substring            
	         String str2 = str[9].substring(2, 5);            
	         //Displaying substring           
	         System.out.print("Substring is: "+ str2);          
	      }         
	      else{         
	         System.out.println("Cannot get the substring from an empty string");         
	      } 

	      //Optional isPresent() vs ifPresent() methods
	      //Creating Optional object from a String
	      Optional<String> GOT = Optional.of("Game of Thrones");   
	         //Optional.empty() creates an empty Optional object        

	         Optional<String> nothing = Optional.empty();
	         /* isPresent() method: Checks whether the given Optional    //it returns boolean value    
	          * Object is empty or not.         
	          */      
	       if (GOT.isPresent()) {          
	           System.out.println("Watching Game of Thrones");       
	        } 
	        else {            
	           System.out.println("I am getting Bored");      
	        }
	       
	       
	       /* ifPresent() method: It executes only if the given Optional    // return type is void     
	          * object is non-empty.    */     
	                  
	         //This will print as the GOT is non-empty        
	         GOT.ifPresent(s -> System.out.println("Watching GOT is fun!"));                
	         //This will not print as the nothing is empty        
	         nothing.ifPresent(s -> System.out.println("I prefer getting bored"));
	   }  
       

}
