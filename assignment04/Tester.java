package assignment04;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import static assignment04.NumberReader.*;
import static assignment04.NumberReader2.*;
public class Tester{

public static void main(String[] args) throws FileNotFoundException{
		String file = "test.txt";
		String file1 = "test1.txt"; 
		String file2 = "test2.txt"; 
		String file3 = "test3.txt";
		int[][] array = readArray(file); 
		
		System.out.println("Expected readArray: [[1, 4, 2, 18, 12], [], [2], [1, 5, 23, -10, 6, 8], [7, -100], [34, 6, 0]]");
		System.out.println("\n");
		System.out.println(Arrays.deepToString(array));
		System.out.println("\n");
		
		List<List<Integer>> list = new ArrayList<>();
		list = readList2(file);
		System.out.println("Expected readList: [[1, 4, 2, 18, 12], [], [2], [1, 5, 23, -10, 6, 8], [7, -100], [34, 6, 0]]");
		System.out.println("\n");
		System.out.println(list);
		System.out.println("\n");


		int[][] array1 = null;
		int[] array2;
		array1 = readArray(file); 
		array2 = flatten(array1);
		System.out.println("Expected Flattened Array: ");
		System.out.println("[1, 4, 2, 18, 12, 2, 1, 5, 23, -10, 6, 8, 7, -100, 34, 6, 0]");
		System.out.println("Array: ");
		System.out.println(Arrays.toString(array2));
		System.out.println("\n");
		


		List<List<Integer>> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		list1 = readList2(file);
		list2 = flatten2(list1);
		System.out.println("Expected Flattened List: ");
		System.out.println("[1, 4, 2, 18, 12, 2, 1, 5, 23, -10, 6, 8, 7, -100, 34, 6, 0]");
		System.out.println("List: ");
		System.out.println(list2);
		System.out.println("\n");


		int[][] array4 = null;
		array4 = readArray(file); 
	
		System.out.println(compare(array4, file) + " Original File" + "\n"); 
		System.out.println(compare(array4, file1) + " Removed Element File" + "\n"); 
		System.out.println(compare(array4, file2) + " Added Element File" + "\n");
		System.out.println(compare(array4, file3) + " Changed Element File" + "\n"); 
		
		List<List<Integer>> list4 = new ArrayList<>();
		list4 = readList2(file);
		System.out.println(compare(list4, file) + " Original File" + "\n"); 
		System.out.println(compare(list4, file1) + " (test1.txt)" + "\n"); 
		System.out.println(compare(list4, file2) + " (test2.txt)" + "\n");
		System.out.println(compare(list4, file3) + " (test3.txt)" + "\n"); 
		System.out.println("--------------------------------------------------------------"); 

		Student s = new Student("Parampreet");
		Set<Courses> needed = s.needToTakeBefore(Courses.CS140);
		System.out.println("Needed courses: " + needed + "\n");
		
		s.addCourse(Courses.CS110);
		needed = s.needToTakeBefore(Courses.CS140);
		System.out.println("Needed courses after course added: " + needed + "\n");

}
}
