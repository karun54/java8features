package java8features;

//throws is used to postpone the handling of checked exception or to delegate the exception handling to the caller
//or to declare the exceptions that can occur in the statements present in the method.this method might throw 
//one of the listed type exceptions.
//throw is used to invoke exception explicitly.
public class TestInteTh1 extends Thread {
	public void run()
	{
		try
		{
			Thread.sleep(1000);
			System.out.println("task");
		}catch(InterruptedException e)
		{
			throw new RuntimeException("thread interupted:"+e);
		//exception is raised so normal flow of execution will be interupted so below sysout wont be executed
		//if exception is handled in this catch block only then below sysout will be executed but here in this case 
		//exception is again thrown in catch block.
		}
	System.out.println("threaD IS RUNNING");
	}

	public static void main(String[] args) {
		TestInteTh1 t1=new TestInteTh1();
		t1.start();
		try
		{
			t1.interrupt();
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
