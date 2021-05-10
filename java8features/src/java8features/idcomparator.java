package java8features;

import java.util.Comparator;

public class idcomparator implements Comparator<patient>{

	@Override
	public int compare(patient p4, patient p5) {
		// TODO Auto-generated method stub
		if(p4.getId()==p5.getId())
			 return 0;
		else if(p4.getId()>p5.getId())
			 return 1;
		else return -1;
	}

}