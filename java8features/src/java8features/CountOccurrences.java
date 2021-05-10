package java8features;

public class CountOccurrences {
	public static void main(String[] args)

{String str = "JavaExamplesJavaCodeJavaProgram";
String substr = "Java";
int count = 0;
int fromIndex=0;

       while ((fromIndex = str.indexOf(substr , fromIndex)) != -1 ){


            count++;
            fromIndex++;
            
        }
        
        System.out.println("Total occurrences: " + count);
    }

}