package assignment02;
import java.util.Arrays;
public class BookTester {

	public static double avgPagesInLibrary(Book[] books) {
		int sum = 0;
	    double average = 0;
	    int counter = 0;

	    for(int i=0; i < books.length; i++){
	        sum = sum + books[i].getNumPages();
	        counter++;
	    }
	    
	    
	    average = sum/counter;
	    return average;
	}
	
	
	public static void main(String[] args) {
		Book[] test1 = {
				new Book("Book A", 3), 
				new Book("Book B", 7),
				new Book("Book C", 9),
				new Book("Book D", 10),
				new Book("Book E", 2),
				new Book("Book F", 6),
				new Book("Book G", 3),
				new Book("Book H", 1)
			};
		
		Book[] test2 = {
				new Book("Book A", 100),
				new Book("Book B", 176),
				new Book("Book C", 150),
				new Book("Book D", 209),
		};
			
			WeirdSorterBook ws2 = new WeirdSorterBook(test1);
			System.out.println(Arrays.toString(ws2.sorted()));
			
			System.out.print("Average for these books are: ");
			System.out.println(avgPagesInLibrary(test1));
			
			
			double average = avgPagesInLibrary(test2);
			System.out.println(average + " is the avg for the four books");
	}
	
}
