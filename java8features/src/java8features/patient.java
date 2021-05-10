package java8features;

public class patient implements Comparable<patient> {
int id;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
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
String name;
int age;
public patient(int id,String name,int age)
{
	this.id=id;
	this.name=name;
	this.age=age;
}
public int compareTo(patient p1) {
	// TODO Auto-generated method stub
	if(age==p1.age)
		return 0;
	else if(age>p1.age)
		   return 1;
	else 
		return -1;
}
}
