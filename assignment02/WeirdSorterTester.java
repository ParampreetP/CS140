package assignment02;
import java.util.Arrays;
public class WeirdSorterTester {

	public static void main(String[] args) {
		int[] test = {3,7,9,10,2,6,3,1,2};
		int[] test1 = {3,7,9,10,2,6,3,1,2};
		int[] test2 = {3,7,9,10,2,6,3,1,2};

		
		WeirdSorter ws = new WeirdSorter(test);
		OneChange1 one = new OneChange1(test1);
		WeirdSorter1 ws1 = new WeirdSorter1(test2);
		
		System.out.println(Arrays.toString(test));
		System.out.println(Arrays.toString(ws.sorted()));
		System.out.println("");
		System.out.println(Arrays.toString(test1));
		System.out.println(Arrays.toString(one.modify(4)));
		System.out.println("");
		System.out.println(Arrays.toString(test2));
		System.out.println(Arrays.toString(ws1.sorted1()));
	}

}
