package java8features;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class transientexample implements Serializable{

	 // Normal variables 
    int i = 10, j = 20; 
  //serialization is the process of converting state of an object into byte stream.
    //the reverse process is called deserialization where byte-stream is converted into object .
    //a class should implement serializable interface inorder to get his objects serialized.
    //serializable is a marker interface (which has no datamembers and methods to implement.)
    // Transient variables 
    transient int k = 30; //these variables are not serialized bcz these are transient variables
    transient String a="ram";////these variables are not serialized bcz these are transient variables
  
    // Use of transient has no impact here //transient will not work for class variables and final variables.
    transient static int l = 40; 
    transient final int m = 50; 
  
    public static void main(String[] args) throws Exception 
    { 
    	transientexample input = new transientexample(); 
  
        // serialization 
        FileOutputStream fos = new FileOutputStream("abc.txt"); 
        ObjectOutputStream oos = new ObjectOutputStream(fos); 
        oos.writeObject(input); 
        
        // de-serialization 
        FileInputStream fis = new FileInputStream("abc.txt"); 
        ObjectInputStream ois = new ObjectInputStream(fis); 
        transientexample output = (transientexample)ois.readObject(); 
       
        System.out.println("i = " + output.i); 
        
        System.out.println("j = " + output.j); 
        System.out.println("the variables k and a are transient variables and they are intialized with default values");
        System.out.println("k = " + output.k); //this variable is intialized with default value during deserialization for int it is 0;
        System.out.println("l = " + output.l);   
        System.out.println("m = " + output.m); 
        System.out.println("a = " + output.a); //this variable is intialized with the default value during deserialization for string it is Null.,and also for object it is null.

}
}
