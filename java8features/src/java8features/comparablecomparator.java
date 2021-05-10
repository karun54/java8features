package java8features;

import java.util.ArrayList;
import java.util.Collections;

public class comparablecomparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList<patient> al=new ArrayList<patient>();
       al.add(new patient(101,"ram",40));
       al.add(new patient(102,"raj",20));
       al.add(new patient(105,"raghu",10));
       Collections.sort(al);
	   al.forEach(p1->System.out.println(p1.getAge()+" "+p1.getName()+" "+p1.getId()));
	   Collections.sort(al, new agecomparator());
	   al.forEach(p1->System.out.println(p1.getAge()+" "+p1.getName()+" "+p1.getId()));
	   Collections.sort(al,new idcomparator());
	   al.forEach(p1->System.out.println(p1.getAge()+" "+p1.getName()+" "+p1.getId()));
	}

}

