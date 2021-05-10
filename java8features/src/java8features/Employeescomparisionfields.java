package java8features;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Employeescomparisionfields {
     
	public static void main(String[] args) {
		List<Employee1> employees=new ArrayList<>(); 
	     employees.add(new Employee1(12,34,"jeevan",340));
	     employees.add(new Employee1(13,45,"karan",320));
	     employees.add(new Employee1(14,32,"akaran1",360));
	     employees.add(new Employee1(2,30,"bakaran5",310));
	     System.out.println("enter based on field to sort");
	     Scanner scanner=new Scanner(System.in);//reading a string from console line by line .
	     String fieldstring=scanner.nextLine();
	     System.out.println("in which order you want to sort");
	     String sortingOrder=scanner.nextLine();
	     Comparator<Employee1> sortComp=getSortComp(fieldstring);
	     if(sortingOrder.equals("desc"))
	     {
	    	 sortComp=sortComp.reversed();
	     }
	     List<Employee1> emps=employees.stream().sorted(sortComp).collect(Collectors.toList());
	     emps.forEach(p1->System.out.println(p1.getId()+" "+p1.getSalary()+" "+p1.getName()+" "+p1.getAge()));
 
	}
/*public static <T, U extends Comparable<? super U>> Comparator<T> comparing(Function<? super T, ? extends U> keyExtractor)
    {
        Objects.requireNonNull(keyExtractor);
        return (Comparator<T> & Serializable)
            (c1, c2) -> keyExtractor.apply(c1).compareTo(keyExtractor.apply(c2));
    }*/
	@SuppressWarnings("unchecked")
	private static Comparator<Employee1> getSortComp(String sortBy) {
		switch(sortBy)
		{
		case "empId":
			 return (Employee1 e1,Employee1 e2)-> ((Integer)e1.getId()).compareTo((Integer)e2.getId());//Comparator.comparing(Employee1::getId);//comparator.comparing(keyextractor)//this keyextractor is going to return the objects field  
		case "age":
			 return Comparator.comparing((Employee1 e1)->e1.getAge());
		case "name":
			 return Comparator.comparing(Employee1::getName);
		case "salary":
			 return Comparator.comparing(Employee1::getSalary);
		default: return Comparator.comparing(Employee1::getId);
		
		}
		
	}

}

