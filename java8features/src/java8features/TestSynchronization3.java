package java8features;

//Example of synchronized method by using annonymous class
//When a thread invokes a synchronized method, it automatically acquires the lock for 
//that object and releases it when the thread completes its task.
/*
I am just having hard time to understand concept behind putting wait() in object class For this questions sake consider as if wait() and notifyAll() are in thread class
In the Java language, you wait() on a particular instance of an Object – a monitor assigned to that object to be precise. If you want to send a signal to one thread that is waiting on that specific object instance then you call notify() on that object. If you want to send a signal to all threads that are waiting on that object instance, you use notifyAll() on that object.
If wait() and notify() were on the Thread instead then each thread would have to know the status of every other thread. How would thread1 know that thread2 was waiting for access to a particular resource? If thread1 needed to call thread2.notify() it would have to somehow find out that thread2 was waiting. There would need to be some mechanism for threads to register the resources or actions that they need so others could signal them when stuff was ready or available.
In Java, the object itself is the entity that is shared between threads which allows them to communicate with each other. The threads have no specific knowledge of each other and they can run asynchronously. They run and they lock, wait, and notify on the object that they want to get access to. They have no knowledge of other threads and don't need to know their status. They don't need to know that it is thread2 which is waiting for the resource – they just notify on the resource and whomever it is that is waiting (if anyone) will be notified.*/
class Table{  
	 synchronized void printTable(int n){//synchronized method  
	   for(int i=1;i<=5;i++){  
	     System.out.println(n*i);  
	     try{  
	      Thread.sleep(400);  
	     }catch(Exception e){System.out.println(e);}  
	   }  
	  
	 }  
	}  
	  
	public class TestSynchronization3{  
	public static void main(String args[]){  
	final Table obj = new Table();//only one object  
	  
	Thread t1=new Thread(){  
	public void run(){  
	obj.printTable(5);  
	}  
	};  
	Thread t2=new Thread(){  
	public void run(){  
	obj.printTable(100);  
	}  
	};  
	  
	t1.start();  
	t2.start();  
	}  
	}  
