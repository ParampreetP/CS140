package assignment04;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.io.*;
import java.util.*;
public class NumberReader2{
	private static List<Integer> readString2(String line){
		var retVal = new ArrayList<Integer>();
		try(var lineScan = new Scanner(line)){ // this is "try with resources"
						// the Scanner will be closed automatically
						// if anything goes wrong
		while(lineScan.hasNextInt()) {
			retVal.add(lineScan.nextInt());
			
			}
		}
		return retVal;

	}


	public static List<List<Integer>> readList2(String fileName) throws FileNotFoundException {
		List<List<Integer>> retVal = new ArrayList<>();
		try(var scan = new Scanner(new File(fileName))) {
			while (scan.hasNextLine()){
				retVal.add(readString2(scan.nextLine()));
			}
		}
		return retVal;




	}

public static List<Integer> flatten2(List<List<Integer>> list){
		List<Integer> array = new ArrayList();
		int k = 0;
		for(List<Integer> i : list) {
			for(int j = 0; j < i.size(); j++) {
				array.add(k++, i.get(j));
			}
		}
		return array;
		
	}
public static boolean compare(List<List<Integer>> list, String filename) throws FileNotFoundException{
		var flat = flatten2(list);
		try (var scan = new Scanner(new File(filename))) {
			while (scan.hasNextInt()) {
				for(int i = 0; i < flat.size(); i++) {
					int tempListInt = flat.get(i);
					int tempFileInt = scan.nextInt();
				
					if(tempListInt != tempFileInt) { 
						System.out.println("element changed");
						return false;
					}	
					
					if(scan.hasNextInt() == false && i != flat.size() - 1) { 
						System.out.println("removed element");
						return false;
					}
					
					if(i == flat.size() - 1 && scan.hasNextInt() == true) { 
						System.out.println("added element");
						return false;
					}
				
				}
			}
			return true;



}




}

}
