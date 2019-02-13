package assignment02;

public class WeirdSorter1 {
	private int[] array;
	public WeirdSorter1(int[] aarray) {
		array = aarray;
	}
	public int[] sorted1() {
		int temp;
		for (int i = 0; i < array.length -1; i++) {
			for (int k = i +1; k <array.length; k++) {
				if (array[i] <array[k])
				{
					temp = array[i];
					array[i] = array[k];
					array[k] = temp;
				}
			}
		}
		
		return array;
	}
	
}
