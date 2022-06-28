import java.util.ArrayList;
public class BookDataBase {


	private ArrayList<Book> books;
	
	public BookDataBase()
	{
		books = null;
	}
	
	BookDataBase(ArrayList<Book> books)
	{
		this.books = books;
	
	}
	
	
	public void setbooks(ArrayList<Book> books)
	{
		this.books = books;
	}
	
	
	public ArrayList <Book> getbooks(ArrayList<Book> books)
	{
		return books;
	}
	
	
	public void addBook(Book Book)
	{
		books.add(Book);
	}
	
	
	public void removeBook(Book Book)
	{
		books.remove(Book);
	}
	
	
	public ArrayList<Book> searchauthor(Author author)
	{
		for(int i = 0; i < books.size(); i++)
		{
			if(books.get(i).author.firstName.toString().equals(author.firstName.toString()) && 
					books.get(i).author.lastName.toString().equals(author.lastName.toString()))
			{
				System.out.println(books.get(i));
				break;
			}
		}
		return books;
	}
	
	
	public ArrayList<Book> searchyear(int startyear, int endyear)
	{
		for(int i = 0; i < books.size(); i++)
		{
			for (int y = startyear; y <= endyear; y++)
			{
				if (books.get(i).toString().contains("Year: " + Integer.toString(y)))
				{
					System.out.println(books.get(i));
					break;
				}
			}
		}
		
		return books;
		
	}
	
	public  ArrayList<Book> searchgenre(String genre)
	{
		for(int i = 0; i < books.size(); i++)
		{
			if(books.get(i).genre.toString().equals(genre.toString()))
			{
				System.out.println(books.get(i));
			}
		}
		return books;
		
	}
	
	
	public String toString()
	{
		return books.toString();
		
	}
	
}
