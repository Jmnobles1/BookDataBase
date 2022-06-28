
public class Author 
{

	String firstName;
	String lastName;
	
	
	public Author()
	{
		firstName = "None";
		lastName = "None";
	}
	
	Author(String firstName, String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	
	public String getFirst()
	{
		return firstName;
	}
	
	public String getLast()
	{
		return lastName;
	}
	
	public void setFirst(String firstName)
	{
		this.firstName = firstName;
	}
	
	public void setLast(String lastName)
	{
		this.lastName = lastName;
	}
	
	public String toString()
	{
		return firstName + " " + lastName;
		
	}

}
