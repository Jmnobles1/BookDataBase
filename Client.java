import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class Client {
	public static void main (String[] args) throws IOException {
		String[] list;
	      
	    Author author;
	    ArrayList <Book> list2;
	    String firstName;
	    String lastName;   
	  	String title;
	  	int year;
	  	String genre;
	  	String publisher;
	  	double rating;
	  	double price;
	  	BookDataBase bookdatabase;
	  	Book Book;
	  	Scanner scan;
	  	
	  	  
	  	
	  	FileInputStream sca = new FileInputStream("MP1.csv");
	  	scan = new Scanner(sca);
	    String first = scan.nextLine();
	      
	    while (scan.hasNextLine()) {
	    	
	    	list = scan.nextLine().split(",");
	        firstName = list[0];
	        lastName = list[1];
	          
	          
	        author = new Author(firstName, lastName);
	          
	        title = list[2];
            year = Integer.parseInt(list[3]);
	        genre = list[4];
	        publisher = list[5];
	        rating = Double.parseDouble(list[6]);
	        price = Double.parseDouble(list[7].substring(1, list[7].length()));
	          
	          
	        Book = new Book(author, title, year, publisher, genre, rating, price);
	        list2 = new ArrayList <Book>();
	        bookdatabase = new BookDataBase(list2);
	         
	      
	          
	        bookdatabase.addBook(Book);
	        bookdatabase.searchgenre("Travel");
	        bookdatabase.searchyear(2002, 2005);
	        Author author1 = new Author("Vincent", "Carretta");
	        bookdatabase.searchauthor(author1);
	          
	          
	    
	    }
	    sca.close();
	    scan.close();
	      
	      
}
}
