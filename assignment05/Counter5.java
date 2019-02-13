package assignment05;

import java.util.*;

public class Counter5 {
	
	public static int[] counter(String[] strings, char ch) {
	
		if (strings == null) {
			return null;
		} else {
			int[] retVal = new int[3];
			int nullCounter = 0;
			int emptyCounter = 0;
			int chCounter= 0;
			for (int i = 0; i < strings.length; i++) {
				if (strings[i] == null) { 
					nullCounter++;
					retVal[0] = nullCounter;
				} else if (strings[i].length() == 0) { 
					emptyCounter++;
					retVal[1] = emptyCounter;
				} else {
					for (int j = 0; j < strings[i].length(); j++) {
	
						if (strings[i].charAt(j) == Character.toUpperCase(ch) || strings[i].charAt(j) == Character.toLowerCase(ch)) {
							chCounter++;
							retVal[2] = chCounter;
						}
					}
				}
			}
			return retVal;
		}
	}
		
	public static List<Integer> counter(List<String> strings, char ch){
		if(strings == null){
			return null;
		}	
		else{
			int nullCounter = 0;
			int emptyCounter = 0;
			int chCounter= 0;
			List<Integer> retVal = new ArrayList<>(Arrays.asList(0,0,0));
			for(int i = 0; i < strings.size(); i++){			
				if(strings.get(i) == null){
					nullCounter++;
					retVal.set(0, nullCounter);
				}
				else if(strings.get(i).length() == 0){
					emptyCounter++;
					retVal.set(1, emptyCounter);
				}
				else{
					for(int j = 0; j < strings.get(i).length(); j++){
						if(strings.get(i).charAt(j) == Character.toUpperCase(ch) || strings.get(i).charAt(j) == Character.toLowerCase(ch)){
							chCounter++;
							retVal.set(2, chCounter);
						}
					}
				}
			}
			return retVal;
		}	
		
	}
	
	
	
	
}
