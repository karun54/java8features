package java8features;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
 interface Calculator {
   long calculate(long num1, long num2);
} 

public class MyNumber {
	private long firstNum;
    private long secondNum;
    public MyNumber(long firstNum, long secondNum) {
	   this.firstNum = firstNum;
	   this.secondNum = secondNum;
    }
    public long process(Calculator calc) {
       return calc.calculate(this.firstNum, this.secondNum);
    }
    
	public long getFirstNum() {
		return firstNum;
	}
	public void setFirstNum(long firstNum) {
		this.firstNum = firstNum;
	}
	public long getSecondNum() {
		return secondNum;
	}
	public void setSecondNum(long secondNum) {
		this.secondNum = secondNum;
	}
	public static void main(String[] args) {
		List<MyNumber> list = new ArrayList<>();
		list.add(new MyNumber(100, 40));
		list.add(new MyNumber(300, 60));
		list.add(new MyNumber(60, 20)); 
		Calculator calc = (n1, n2) -> n1 + n2;
		for(MyNumber myNumber: list) {
			   System.out.println(myNumber.process(/*here you can pass calc or directly (n1, n2) -> n1 + n2 */ (n1, n2) -> n1 + n2));
			} 
		
	}

}
