package assignment02;

public class WeirdSorterBook {
	private Book[] array;
	public WeirdSorterBook(Book[] aarray) {
		array = aarray;
	}
	public Book[] sorted() {
		for (int i = 0; i < (array.length - 1); i++) {
			OneChangeBook onechange = new OneChangeBook(array);
			array = onechange.modify(i);
		}
		
		return array;
	}
}
