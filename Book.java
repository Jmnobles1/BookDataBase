
public class Book {
	
	Author author;
	String title;
	int year;
	String publisher;
	String genre;
	double rating;
	double price;
	
	public Book()
	{
		author = null;
		title = "None";
		year = 0;
		publisher = "None";
		genre = "None";
		rating = 0.0;
		price = 0.0;
	}
	
	Book(Author author, String title, int year, String publisher, String genre, double rating, double price)
	{
		this.author = author;
		this.title = title;
		this.year = year;
		this.publisher = publisher;
		this.genre = genre;
		this.rating = rating;
		this.price = price;
		
	}
	
	public void setprice(double price)
	{
		this.price = price;
	}
	
	public void setauhtor(Author author)
	{
		this.author = author;
	}
	public void setgenre(String genre)
	{
		this.genre = genre;
	}
	
	public void setpublisher(String publisher)
	{
		this.publisher = publisher;
	}
	public void settitle(String title)
	{
		this.title = title;
	}
	
	public void setrating(double rating)
	{
		this.rating = rating;
	}
	public void setyear(int year)
	{
		this.year = year;
	}
	
	
	public String gettitle()
	{
		return title;
	}
	
	public String getpublisher()
	{
		return publisher;
	}
	public String getgenre()
	{
		return genre;
	}
	
	public double getrating()
	{
		return rating;
	}
	
	public double getprice()
	{
		return price;
	}
	
	public int getyear()
	{
		return year;
	}
	
	public Author getauthor()
	{
		return author;
	}
	
	public String toString()
	{
		return ("Author: " + author.toString() + "    Title: (" + title + ")    Year: " + year + "    Genre: " + genre + "    Publisher: " + publisher + "    Book Rating: " + rating + "    Book Price: " + price);
		
	}


}
