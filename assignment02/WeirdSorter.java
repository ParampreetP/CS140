package assignment02;

public class WeirdSorter {
		private int[] array;
	public WeirdSorter(int[] aarray) {
		array = aarray;
	}
	public int[] sorted() {
		for (int i = 0; i < (array.length - 1); i++) {
			OneChange onechange = new OneChange(array);
			array = onechange.modify(i);
		}
		
		return array;
	}
	
}
