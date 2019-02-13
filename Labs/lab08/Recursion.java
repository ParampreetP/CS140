package lab08;
import java.util.*;
public class Recursion {
	private static final double DELTA = 1e-6;
	
	public static int factorial(int n) {
		if (n < 0) {
			throw new IllegalArgumentException("Number should be non-negative");
		}
		if (n == 0) {
			return 0;
		}
		if ( n==1) {
			return 1;
		}
		else {
			return n * factorial(n-1);
		}
		
	}
	public static double squareRoot(double n) {
		return squareRootHelper(n, n-1);
	}
	private static double squareRootHelper(double n, double approx) {
		if (n < 0)
			throw new IllegalArgumentException("Non-negative inputs are expected");

		if (n == 0)
			return 0;

		if (Math.abs(n - approx*approx) < DELTA)
			return approx;

		return squareRootHelper(n, (approx + n/approx)/2);
	}
	public static int sum(List<Integer> nums) {
		return sumHelper(nums,0);
	}
	
	private static int sumHelper(List<Integer> nums, int index){
			
		if (nums == null) {
			return 0;
		} else if (index == nums.size()) {
			return 0;
		} else {
			int temp = nums.get(index);
			return sumHelper(nums, index + 1) + temp;
		}
		
	}
	public static int sum(int[] nums) {
		return sumHelper(nums,0);
	}
	private static int sumHelper(int[] nums, int index) {
		
		if (nums.length== 0) {
			return 0;
		}
		if (index == nums.length) {
			return 0;
		}
		else {
		int temp = nums[index];
		return sumHelper(nums, index +1) + temp;
	}
	}
	public static int binomialCoefficient(int n, int k) { 
	      
	        
		 if (k == 0 || k == n) {
	            return 1;
		 }
		 else{
	        return binomialCoefficient(n - 1, k - 1) +  binomialCoefficient(n - 1, k); 
		 }
	    } 

	public static void printPascalsTriangle(int limit) {
		printPascalsHelper(limit, 0, 0);
	}
	
	private static void printPascalsHelper(int limit, int n, int k) {
		
        if(n + 1 > limit)
            return;
        
        if(n > k) {
            System.out.print(binomialCoefficient(n, k) + " ");
            printPascalsHelper(limit, n, k+1);
        }
        
        else if(n == k) {
            System.out.println(binomialCoefficient(n, k));
            printPascalsHelper(limit, n+1, 0);
        }
	
	}
	  public static void main(String args[]) {
	        printPascalsTriangle(5);
	    }
	
	
}
