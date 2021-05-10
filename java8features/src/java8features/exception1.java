package java8features;

public class exception1 {

	public static void main(String[] args) throws InterruptedException,Exception{
		System.out.println("exception may occur");
		Thread.sleep(10000);//here it doesn't mean interupted exception occurs.compiler is simply telling that there is a possibility of interupted exception only it will show compiletime error //this is checked exception ,the exceptions which are checked by compiler for smooth execution of program at run time 
//these exceptions by default considered as checked exceptions ,the exceptions which are checked by the compiler and whether programmer
//is handling are not these things are checked by the compiler such type of exceptions are by default considered as checked exceptions.
//whether exception is checked or unchecked compulsory every exception will occurs at run time only.there is no chance of occuring exception at compile time .
//compile time you are getting some erors those are sytatical errors.at comiple time there is no chance of getting any exception.
//in case of checked exceptions if main method is not going to handle it and it will use throws then JVM which is caller of this main method will handle this checked exceptions 
//by using its default exception handler which may simply print the exception to standard output or JVM simply terminates the program and prints the stack trace.,
//throws keyword is used to delegate responsibility of  exception handling to the caller method  ,or postponing the exception handling to the caller method. 
		//for example throws IOException{ but in this case main() method declares
		//in its signature "throws IOException which means that this exception will be thrown up the call stack
		//for the next higher level method to handle ,in this case the next higher level method of ,main() is
		//the JVM,which simply terminates the program and prints the stacktrace.it is not going to handle like try catch is handling  .
		// so JVM is not going to handle but it abnormaly terminates the program and prints the stacktrace.	
		//https://www.geeksforgeeks.org/throw-throws-java/
		//The Java throws keyword is used to declare an exception
		System.out.println("after exception normal execution");
        String str=null;
        System.out.println("this will....");
        int x = str.length();//null pointer exception is unchecked exception
        System.out.println("this will not...");
        //below throws arithmetic exception is also one of unchecked exception
        System.out.println(10/0);//these exceptions which are not checked by the compiler at compile time  these are called unchecked exceptions.compiler won't check whether you are handling
//these type of exceptions so these are called unchecked exceptions.

//java is designed in such a way that most commonly raised exceptions will be checked by the compiler and rarely raised exceptions compiler won't check whether you are handling are not.
	}

}
