package java8features;

import java.util.Comparator;
@FunctionalInterface
interface draw2
{
	public void draw12();
	
}
public class agecomparator implements Comparator<patient>{

	@Override
	public int compare(patient p2, patient p3) {
		// TODO Auto-generated method stub
	if(p2.getAge()==p3.getAge())
			return 0;
		else if (p2.getAge()>p3.getAge())
			return 1;
		else return -1;
	//return p2.getAge().compareTo(p3.getAge());//error showing can not invoke compareTO()on primitive type
	}

}
