package java8features;

//Same example of static synchronization by annonymous class
//Static synchronization
//If you make any static method as synchronized, the lock will be on the class not on object. 
class Table1{  
	  
	 synchronized static  void printTable(int n){  
	   for(int i=1;i<=10;i++){  
	     System.out.println(n*i);  
	     try{  
	       Thread.sleep(400);  
	     }catch(Exception e){}  
	   }  
	 }  
	}  
	  
	public class TestSynchronization5 {  
	public static void main(String[] args) {  
	      
	    Thread t1=new Thread(){  
	        public void run(){  
	            Table1.printTable(1);  
	        }  
	    };  
	      
	    Thread t2=new Thread(){  
	        public void run(){  
	            Table1.printTable(10);  
	        }  
	    };  
	      
	   
	    t1.start();  
	    t2.start();  
	     
	      
	}  
	}  
