package assignment02;

public class OneChange1 {
	private int array[];
	
	public OneChange1(int aArray[]) {
			this.array=aArray;
	}

	public int largestAfter(int start) {
		int largest = start; 
		for (int i = start + 1; i < array.length; i++) {
			if (array[largest] < array[i] ){
				largest = i;
	}	
}
		return largest;
	}
	
	public int[] modify(int start) {
		 int temp[] = new int[array.length];
		 int k = largestAfter(start);
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