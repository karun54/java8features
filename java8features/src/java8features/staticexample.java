package java8features;

public class staticexample {

	static int count=0; //will get memory only once and retain its value  o/p will be:  1    2    3
	//int count=0;// will get memory each time when object is created and o/p will be : 1    1    1
	staticexample()
	{
		count++;
		System.out.println(count);
	}
	public static void main(String args[])
	{
		staticexample s1=new staticexample();
		staticexample s2=new staticexample();
		staticexample s3=new staticexample();
	}
	
}

//Static methods vs Instance methods in Java 
//Instance method can access the instance methods and instance variables directly. 
//Instance method can access static variables and static methods directly.
//Static methods can access the static variables and static methods directly 
//but they can not access instance methods and instance variables-they must use an object reference.
//The static variable gets memory only once in the class area at the time of class loading.
//Static methods can not be overridden. But can be overloaded since they are resolved 
//using static binding by compiler at compile time.
