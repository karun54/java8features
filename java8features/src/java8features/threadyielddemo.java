package java8features;

class mythread extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("child thread");
			//Thread.yield();//if a thread runs yield in its run() then it pauses its execution to give chance for many waiting threads which are having same priority
			//the thread which is yielded when he will get chance once again ?it depends on thread scheduler.
	 //here if child thread yielded it goes to the ready/runnable state,and main thread executes as it is having sam priority as child thread ,and after completion of main thread child thread 
 //starts its execution.
		}
			
	}
}


public class threadyielddemo {

	public static void main(String[] args) {
		
     mythread t=new mythread();
     t.start();
     for(int i=0;i<10;i++)
     {
    	 System.out.println("main thread");
     }
	}

}
