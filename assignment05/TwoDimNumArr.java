package assignment05;
import java.util.*;
import java.io.*;
import java.lang.*;
public class TwoDimNumArr{
	private int[][] array;
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
	public TwoDimNumArr(String fileName) throws FileNotFoundException{
		var count = 0;
		try(var scan = new Scanner(new File(fileName))) {
			while (scan.hasNextLine()){
				count++;
				scan.nextLine();
			}
		}
		array = new int[count][];
		try(var scan = new Scanner(new File(fileName))) {
			for (int i=0; i < count; i++){
			array[i] = readString(scan.nextLine());
			}
		}
	
		}
		

	
public String toString() {
	StringBuilder sb = new StringBuilder();
	for(var row : array) {
        for(var num : row) {
		sb.append(num + " ");
            //look up the append method of StringBuffer to append (num + " ") to sb
        }
	    sb.setLength(sb.length() -1); // set the length of sb to sb.length()-1 to get rid of last space on the line
	    sb.append("\n");// append a new line character "\n"
	}
	return sb.toString();
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
public boolean compare(String filename) throws FileNotFoundException{
		var flat = flatten(array);
		try (var scan = new Scanner(new File(filename))) {
			while (scan.hasNextInt()) {
				for(int i = 0; i < flat.length; i++) {
					int tempArrayInt = flat[i];
					int tempFileInt = scan.nextInt();
				
					if(tempArrayInt != tempFileInt) { 
						System.out.println("Element changed");
						return false;
					}	
					
					if(scan.hasNextInt() == false && i != flat.length - 1) { 
						System.out.println("Removed changed");
						return false;
					}
					
					if(i == flat.length - 1 && scan.hasNextInt() == true) { 
						System.out.println("removed element");
						return false;
					}
				
				}
			}
			return true;
			

}}
public int compareTo(TwoDimNumArr other){
	return Arrays.compare(flatten(this.array), flatten(other.array));


}






}
