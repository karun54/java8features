package java8features;

@FunctionalInterface 
interface drawable{
	public void draw(int width);
	//FI is an interface which contains one and only one abstract method 
	//and it may contain any number of default methods.
		default void draw2()
		{
			System.out.println("this is default method");
		}
}
	public class functionalinterface1 {

     private int j=20;
	public static void main(String[] args) {
		int width=10;
		functionalinterface1 f3=new functionalinterface1();
		//with lambda expression which is eliminating annonymous class
		//drawable d=()->{ System.out.println("drawing:"+width);};
		//d.draw();
        //with method reference eliminaTING LAMDA EXPRESSION
		//following is the annonymous class which is enclosed by functionalinterface1
		//class so it can access private members of the enclosing class
		drawable d2=new drawable(){
			                         public void draw(int width)
					                 {
				                           System.out.println("width is "+width);
				                           System.out.println("j value is "+f3.j);
				                    }
		                          };
		drawable d1= System.out::println;
		d1.draw(10);
		d1.draw2();
	}

}
