package assignment02;

public class OneChange {
		private int array[];
		
public OneChange(int aArray[]) {
		this.array=aArray;
}

public int smallestAfter(int start) {
	int smallest = start; 
	for (int i = start; i < array.length; i++) {
		if (array[i] < array[smallest] ){
			smallest = i;
}		
	}
return smallest;
}
public int[] modify(int start) {
	 int temp[] = new int[array.length];
	 int k = smallestAfter(start);
	 for (int j = 0; j < start; j++) {
		 temp[j] = array[j];
		
		 
	 }
	 temp[start] = array[k];
	 for (int j = start; j < k; j++) {
		 temp[j+1]=array[j];
	 }
	 for (int j = k +1; j < array.length; j++) {
		 temp[j] = array[j];
	 }
return temp;
}



}