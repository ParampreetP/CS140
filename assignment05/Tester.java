package assignment05;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import static assignment05.Counter5.*;
public class Tester{
	public static void main(String[] args) throws FileNotFoundException{
		var v1 = new TwoDimNumArr("test1.txt"); 
		var v2 = new TwoDimNumArr("test2.txt"); 
		var v3 = new TwoDimNumArr("test3.txt");
		var test = new TwoDimNumArr("input.txt");
		System.out.println(test.toString());
		System.out.println("------------------------------------------" + "\n");
		System.out.println(v1.compareTo(v2)); // prints a negative number
		System.out.println(v1.compareTo(v3)); // prints 0 but test1.txt and text2.txt have different numbers of rows

		//NOTE THIS WAS CHANGED, USED TO BE v3.compareTo(v2). You need to update this!
		System.out.println(v2.compareTo(v3)); // prints a positive number


		Locations location = new Locations();
		int[] nullArray = null; //set a array null
		int[] emptyArray = new int[0]; //set a empty array to 0
		int[] nonEmptyArray = {5, 10, 45, 56, 454, 2412, 12, 1, 2, 3, 4, 5, 6, 7, 7, 7, 7, 7, 7, 7, 7};
		System.out.println("\n" + "Testing lessEQ Method: " + "\n");
		System.out.println(location);
		System.out.println(Arrays.toString(location.lessEQ(nonEmptyArray)) + "\n");
		System.out.println("Non empty Array: " + Arrays.toString(nonEmptyArray) + "\n");
		System.out.println("Check null array: " + Arrays.toString(location.lessEQ(nullArray)));
		System.out.println("Check empty array: " + Arrays.toString(location.lessEQ(emptyArray)) + "\n");
		System.out.println(" Where locations is smaller than non-empty array: " + "\n" + Arrays.toString(location.lessEQ(nonEmptyArray)));
		System.out.println("------------------------------------------");
		
		System.out.println("\n" + "Testing LocalDateTime: " + "\n");
		var testDate = new DiaryEvent("Office Hours", 2018, 9, 18, 14, 30, 60);
		System.out.println(testDate + "\n");
		System.out.println("------------------------------------------" + "\n");
		
	
		
		
		
		System.out.println("\n" + "Testing monthBreakdown method: " + "\n");
		System.out.println("Expected DiaryEvent Method month: [9, 11, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0] ");
		DiaryEvent[] testDate1 = new DiaryEvent[] { new DiaryEvent("Office Hours 4", 2018, 9, 1, 14, 30, 60),
				new DiaryEvent("Office Hours 4", 2018, 11, 6, 14, 30, 60)};
		System.out.println("\t\t\t\t" + Arrays.toString(DiaryEvent.monthBreakdown(testDate1)) + "\n");
		List<DiaryEvent> testDate2 = new ArrayList<>(Arrays.asList( new DiaryEvent("Office Hours 8", 2018, 8, 1, 8, 30, 120)));
		System.out.println("The expected office hours that the earliest on list: Office Hours 8 at 2018-08-01T08:30, lasting 120 minutes.");
		System.out.println("The earliest Office hours: " + DiaryEvent.earliest(testDate2));
		System.out.println("------------------------------------------" + "\n");

		
		
		
		System.out.println("\n" + "Testing the counter method" + "\n");
		String[] str1 = { null, "", "", null, "", "Hello world"};
		System.out.println("Expected[]: [2, 3, 1]");
		System.out.println("[nullCount, emptyCount, diffCount]  ->   " + Arrays.toString(counter(str1, 'h')) + "\n");
		List<String> list1 = new ArrayList<>(Arrays.asList(null, "", "", null, "", "Hello world"));
		System.out.println("Expected (list): [2, 3, 1]");
		System.out.println("\t\t " + Counter5.counter(list1, 'h'));
		
		
		
		
		
	}

}	
