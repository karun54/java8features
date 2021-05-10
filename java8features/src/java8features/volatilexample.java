package java8features;

//here concept is declaring volatile variable means the value of the variable will never be 
//cached by thread locally all reads and writes go to main memory only means only one copy of them in main memory
//if you replace volatile with normal variable then printvolatilevar thread wont be entered into the if loop bcz always
//if(0!=0) will be executed.if you place  volatile keyword for this int variable then this thread printvolatilevar
//will enter into the if(0!=1) will be executed and s.o.p("print volatile var:"+volatile_var) will be executed.
//normal variable local cache will be there ,for volatile variable there is no local cache.
public class volatilexample {

 private static  volatile int volatile_var=0;
	public static void main(String[] args) {
 	Thread printvolatilevar=new Thread()
  {
			
			public void run()
  	{
  		 
				int x=volatile_var;
  	while(true)
  	{
  		
  		if(x!=volatile_var)
  		{
  			
  			System.out.println("print volatile var:"+volatile_var);
  			x=volatile_var;
  		}
  	}
  	}
  };
  Thread incrementvolatilevar=new Thread()
  {
  	
  	public void run()
  	{
  		int x=volatile_var;
  		while(true)
  		{
  			++volatile_var;
  			System.out.println("incremented volatile var:"+volatile_var);
  			try
  			{
  				Thread.sleep(1000);
  			}catch(InterruptedException e )
  			{
  				e.printStackTrace();
  			}
  		}
  	}
  };
  incrementvolatilevar.start();
  printvolatilevar.start();


	}

}
