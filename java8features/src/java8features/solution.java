package java8features;

public class solution {
	
		  public void rotate(int[] nums, int k) {
		    // speed up the rotation
		    k %= nums.length;
		    int temp, previous;
		    for (int i = 0; i < k; i++) {
		      previous = nums[nums.length - 1];
		      for (int j = 0; j < nums.length; j++) {
		        temp = nums[j];
		        nums[j] = previous;
		        previous = temp;
		    
		    }
		  }
		}

public static void main(String args[])
{
	 int arr[] = {1,2,7,8,9};
	 int k=3;
	 solution sol=new solution();
	 sol.rotate(arr, k);
	 System.out.println("printing array");
	 for (int i = 0; i <5; i++) 
         System.out.print(arr[i] + " "); 
}
}
