package assignment04;

import java.util.List;
import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Iterator;
import java.io.*;
import java.util.*;
public class NumberReader {

private static int[] readString(String line) {
	// first count how many integers are in the line
	var count = 0; // in Java 10 we can use "var" and Java infers the type.
	try(var lineScan = new Scanner(line)){ // this is "try with resources"
						// the Scanner will be closed automatically
						// if anything goes wrong
		while(lineScan.hasNextInt()) {
			count++;// increase count
			lineScan.nextInt();// use nextInt() to move to the next integer
		}
	}

	var retVal = new int[count];
	try(var lineScan = new Scanner(line)){ // open the scanner again from the start
		for (int i =0; i < count; i++){
		retVal[i] = lineScan.nextInt();
		} // in a for loop with i from 0 up to but not including count
		// set retVal[i] = lineScan.nextInt();
	}		
	return retVal;
}
public static int[][] readArray(String fileName) throws FileNotFoundException{
		var count = 0;
		try(var scan = new Scanner(new File(fileName))) {
			while (scan.hasNextLine()){
				count++;
				scan.nextLine();
			}
		}
		var retVal = new int[count][];
		try(var scan = new Scanner(new File(fileName))) {
			for (int i=0; i < count; i++){
			retVal[i] = readString(scan.nextLine());
			}
		}
		return retVal;
		}
public static int[] flatten(int[][] arrays){
		int counter = 0;
		for (int i = 0; i < arrays.length; i++) {
			for (int j = 0; j < arrays[i].length; j++) {
				counter++;
			}
		}

		int[] temp = new int[counter];
		int k = 0;
		for (int i = 0; i < arrays.length; i++) {
			for (int j = 0; j < arrays[i].length; j++) {
				temp[k++] = arrays[i][j];

			}
		}
		return temp;


		}
public static boolean compare(int[][] arrays, String filename) throws FileNotFoundException{
		var flat = flatten(arrays);
		try (var scan = new Scanner(new File(filename))) {
			while (scan.hasNextInt()) {
				for(int i = 0; i < flat.length; i++) {
					int tempArrayInt = flat[i];
					int tempFileInt = scan.nextInt();
				
					if(tempArrayInt != tempFileInt) { 
						System.out.println("element changed");
						return false;
					}	
					
					if(scan.hasNextInt() == false && i != flat.length - 1) { 
						System.out.println("REmoved changed");
						return false;
					}
					
					if(i == flat.length - 1 && scan.hasNextInt() == true) { 
						System.out.println("removed element");
						return false;
					}
				
				}
			}
			return true;



}
}}



