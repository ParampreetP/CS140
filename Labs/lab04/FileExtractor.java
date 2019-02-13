package lab04;

import java.util.List;
import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;
import java.util.Arrays;
import java.io.FileNotFoundException;
import java.util.Iterator;

public class FileExtractor {
	private int[] array;
	private List<Integer> list = new ArrayList<>();

	public FileExtractor(String fileName) {
		list = new ArrayList<Integer>();
		
		
		try (Scanner sc = new Scanner(new File(fileName))) {
			while(sc.hasNext()) {
			list.add(sc.nextInt());
			}
			array = new int[list.size()];
			for (int i = 0; i < list.size(); i++) {
				array[i] = list.get(i);
			}
		}
		catch(FileNotFoundException e) {
				array = new int[0];
				System.out.println("File '" + fileName + "' not found, initializing both 'list' and 'array' to be empty\n");
			}
		catch (Exception e) {
			 System.out.println("Error occurred while extracting data:\n");
			 e.printStackTrace();
		}
	}
	
	public int[] getArray() {
		return array;
	}
	public List<Integer> getList(){
		return list;
	}
	public void removeOddElements() {
		int counter = 0;
		int[] temp;
		int index = 0;
		for (int i : array) {
			if (i % 2==0) {
				counter +=1;
			}
		}
		temp = new int[counter];
		for (int k: array){
			if (k % 2==0){
				temp[index] = k;
				index +=1;
			}
		array = temp;
		}
	}
	public void removeEvenElements() {
		Iterator<Integer> iter = list.iterator();
		while(iter.hasNext()){
			Integer i = iter.next();
			if(i % 2 == 0) iter.remove();
		}
	}
	public String toString(){
		return "array: " + Arrays.toString(array) + "\nlist: " + list.toString();

	}
}
