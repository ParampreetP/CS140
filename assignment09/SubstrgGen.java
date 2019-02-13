package assignment09;


import java.util.*;

public class SubstrgGen {
	public static Set<String> subStrs(String starter){
		Set<String> ss = new TreeSet<>();
		for(int j=0;j<starter.length(); j++){
		String sub = starter.substring(j);
		for(int i=0; i<sub.length(); i++){
		ss.add(sub.substring(0,i+1));
		}
		}
		ss.add("");
		return ss;
		}
		public static List<String> subStr1(String starter){
		List<String> list = new ArrayList<>();
		for(int j=0;j<starter.length(); j++){
		String sub = starter.substring(j);
		for(int i=0; i<sub.length(); i++){
		list.add(sub.substring(0,i+1));
		}
		}
		list.add("");
		return list;
		}

		
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String str = in.next();
		Set<String> sets = subStrs(str);
		System.out.println("By Using TreeSet: "+ sets);
		List<String> lists = subStr1(str);
		System.out.println("By Using ArrayList: "+ lists);
		}
}
