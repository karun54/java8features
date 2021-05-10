package java8features;

import java.io.IOException;

class sample3
{
	void m()throws IOException
	{
		throw new IOException("device error");
	}
}
public class exception2 {
//Java throws keyword
//	The Java throws keyword is used to declare an exception. It gives an information to the programmer that
//there may occur an exception so it is better for the programmer to provide the exception handling code so that normal flow can be maintained.
//	Exception Handling is mainly used to handle the checked exceptions. If there occurs any unchecked exception
//such as NullPointerException, it is programmers fault that he is not performing check up before the code being used.
//Advantage of Java throws keyword
	//Now Checked Exception can be propagated (forwarded in call stack).
	//It provides information to the caller of the method about the exception.
	public static void main(String[] args) {//throws IOException{but in this case main() method declares
//in its signature "throws IOException which means that this exception will be thrown up the call stack
//for the next higher level method to handle ,in this case the next higher level method of ,main() is
//the JVM,which simply terminates the program and prints the stacktrace.it is not going to handle like try catch is handling  .
// so JVM is not going to handle but it abnormaly terminates the program and prints the stacktrace.
		
		sample3 k=new sample3();
		try{
		k.m();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("normal flow");
	}

}
