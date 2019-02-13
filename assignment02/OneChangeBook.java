package assignment02;

public class OneChangeBook {
	private Book[] array;

	public OneChangeBook(Book[] aArray) {
			this.array=aArray;
	}

	public int smallestAfter(int start) {
		int smallest = start;
		for (int i = start; i < array.length; i++) {
			if (array[i].getNumPages() < array[smallest].getNumPages()) {
				smallest = i;
			}
		}
		return smallest;
	}

	public Book[] modify(int start) {
		Book temp[] = new Book[array.length];
		int k = smallestAfter(start);
		for (int j = 0; j < start; j++) {
			temp[j] = array[j];

		}
		temp[start] = array[k];
		for (int j = start; j < k; j++) {
			temp[j + 1] = array[j];
		}
	 
	 for (int j = k +1; j < array.length; j++) {
		 temp[j] = array[j];
	 }
	return temp;
}
}