package java8features;

class finalexample2
{
	 int i=10;// if u declare as final it will show error bcz final variables can not be changed (primitive variables )
	
}


public class finalexample1 {

	public static void main(String[] args) {
     final finalexample2 f2=new finalexample2();
     f2.i=20;//when final is used with non-primitive variabls (non primitive variables are always reference to objects)the members of the referenced object can be changed.
     //final for non-primitve variables just mean that they can not be changed to refer to any other object.means reference can not be changed)
	}

}