package java8features;



@FunctionalInterface
interface employeefactory{
	 public employee getEmployee(String name,int age);
}
class employee
{
	String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	int age;
	public employee(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public String toString()
	{
		return "employee name is:"+name+" age is:"+age;
		
	}
}
	
public class methodreference1 {
	
	public static void main(String[] args) {
		//by using lambda expression
		employeefactory ef=(name,age)->new employee(name,age);
		employee e=ef.getEmployee("ravi",20);
        System.out.println(e);
        //by using constructor reference and method reference concept 
        //you can assign a constructor reference to any functional interface which has a 
        //method compatable with the constructor.
        employeefactory ef1=employee::new;
        employee e2=ef1.getEmployee("godmustbe",30);
        System.out.println(e2);
	}

}
