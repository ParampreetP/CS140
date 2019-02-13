package lab05;
import java.util.*;


public class FunWithStrings{

	public static void swapMaxes(List<String> list1, List<String> list2){
		if (list1 == null || list2 == null || list1.size() == 0 || list2.size() == 0){

			throw new IllegalArgumentException("cannot swap maxes of empty lists, nulllists, or lists with all null elements");

		}
		String x = "";
		String y = "";
		for (int i = 0; i < list1.size(); i++){
			if (x.length() < list1.get(i).length()){
				x = list1.get(i);
			}
		}
		for (int i = 0; i < list2.size(); i++){
			if (y.length() < list2.get(i).length()){
				y = list2.get(i);
			}
		}
		for (int i = 0; i < list1.size(); i++){
			if (list1.get(i) == x){
			list1.set(i, y);
			}
		}
		for (int i = 0; i < list2.size(); i++){
			if (list2.get(i) == y){
			list2.set(i, x);
			}
		}


		}

}
