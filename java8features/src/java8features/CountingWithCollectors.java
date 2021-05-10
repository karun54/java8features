package java8features;
//https://www.javabrahman.com/java-8/java-8-finding-with-streams-findfirst-findany-methods-tutorial-examples/
	
	
	
	//https://www.javabrahman.com/java-8/java-8-counting-with-collectors-collectors-counting-method-tutorial-with-examples/

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class CountingWithCollectors {
  static List<Employee5> employeeList = Arrays.asList(new Employee5("Tom Jones", 45),
      new Employee5("Harry Major", 25),
      new Employee5("Ethan Hardy", 65),
      new Employee5("Nancy Smith", 22),
      new Employee5("Deborah Sprightly", 29));
 
  public static void main(String args[]){
    Long count=employeeList.stream().collect(Collectors.counting());
    System.out.println("Employee count: "+count);
  }
}
//Employee.java(POJO Class)
//package com.javabrahman.java8;
 class Employee5 {
  private String name;
  private Integer age;
 
  public Employee5(String name, Integer age) {
    this.name = name;
    this.age = age;
  }
 
  //Getters and Setters of name & age go here
  public String toString(){
    return "Employee Name:"+this.name
        +"  Age:"+this.age;
  }
  //Standard equals() and hashcode() implementations go here
}
