package lab02;


public class Library{

public static void main(String[] args) {



Book[] library = new Book[3];
	library[0] = new Book("book1", 400);
	library[1] = new Book("book2", 1000);
	library[2] = new Book("book3", 200);


for (int i = 0; i < library.length; i++) {
    System.out.println(library[i].getTitle()); //prints the book titles
}
for (Book currentElement : library) {
    System.out.println(currentElement.getNumPages());
}
System.out.println(numPagesInLibrary(library));
System.out.println(mostPages(library));
}
public static int numPagesInLibrary(Book[] books){
	int bookpgtotal = 0;
	for (int i = 0; i < books.length; i++) {
	bookpgtotal = books[i].getNumPages() + bookpgtotal;

    }
	System.out.println(" Number of total pages are 1600");
	System.out.println("Total number of Pages: " +  bookpgtotal);
	return bookpgtotal;
}
public static int mostPages(Book[] books){
	int most = books[0].getNumPages();
	for (Book b : books) {
		if (b.getNumPages() > most){
			most = b.getNumPages();
}
	
	
		
}
System.out.println(" Most pages are 1000 from book2");
return most;
}
    

}

