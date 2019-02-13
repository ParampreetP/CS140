package exam01;//EXAM SPRING 2017
import java.util.*;
public class Ques1 {
	private int n;
	public Ques1(int n1) {
		if (n < 0) {
			this.n = -n1;
		}
		else {this.n= n1;}
		}
	public int smallestNumber() {
			if (n == 1 || n == 0) {
				return n;
			}
			for (int i = 2; i < n;i++) {
				if (n % i == 0)  {
					return i;
				}
			
				
			}
			return n;
		
		}
	public ArrayList<Integer> factorize(){

			
			int x;
			int temp = n;
			ArrayList<Integer> arr = new ArrayList<Integer>();
			if (n == 1 || n == 0) {
				return arr;
			}
			while (n > 1) {
				x = smallestNumber();
				arr.add(x);
				n = n/x;
			}
			n = temp;
			return arr;
		}
@Override
public String toString() {
	return (n + " = " + factorize() + " is ");
	
}
	
public static void main(String[] args) {
for(int i = 18; i < 23; i++) {
System.out.println(new Ques1(i));
}
}
}
