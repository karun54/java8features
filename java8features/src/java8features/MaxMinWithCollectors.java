package java8features;
//https://www.javabrahman.com/java-8/java-8-finding-maxmin-with-collectors-maxby-minby-methods-tutorial-with-examples/

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.text.DecimalFormat;

 
class MaxMinWithCollectors {
  static List<Employee11> employeeList
        = Arrays.asList(new Employee11("Tom Jones", 45, 15000.00),
          new Employee11("Tom Jones", 45, 7000.00),
          new Employee11("Ethan Hardy", 65, 8000.00),
          new Employee11("Nancy Smith", 22, 10000.00),
          new Employee11("Deborah Sprightly", 29, 9000.00));
 
  public static void main(String[] args) {
    Optional<Employee11> maxSalaryEmp =  employeeList.stream().collect(Collectors.maxBy(Comparator.comparing(Employee11::getSalary)));
    System.out.println("Employee with max salary:"+ (maxSalaryEmp.isPresent()? maxSalaryEmp.get():"Not Applicable"));
    Optional<Employee11> minAgeEmp = employeeList.stream().collect(Collectors.minBy(Comparator.comparing(Employee11::getAge)));
    System.out.println("Employee with min age:" + (minAgeEmp.isPresent()? minAgeEmp.get():"Not Applicable"));
  }
}
//Employee.java(POJO Class)
 class Employee11 {
  private String name;
  public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Integer getAge() {
	return age;
}

public void setAge(Integer age) {
	this.age = age;
}

public Double getSalary() {
	return salary;
}

public void setSalary(Double salary) {
	this.salary = salary;
}

private Integer age;
  private Double salary;
  
  public Employee11()
  {
	  
  }
 
  public Employee11(String name, Integer age, Double salary) {
    this.name = name;
    this.age = age;
    this.salary = salary;
  }
 
  //Getters and Setters of name, age & salary go here
 
  public String toString(){
    DecimalFormat dformat = new DecimalFormat(".##");
    return "Employee Name:"+this.name
        + "  Age:"+this.age
        + "  Salary:"+dformat.format(this.salary);
  }
  //Standard equals() and hashcode() implementations go here
}