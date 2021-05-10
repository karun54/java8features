package java8features;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="employee1")
public class Employee1 {

	private int id;	
private int age;

private String name;

private int salary;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public Employee1(int id, int age, String name, int salary) {
	super();
	this.id = id;
	this.age = age;
	this.name = name;
	this.salary = salary;
}
public Employee1()
{
	
}
}
