/* Q21. WAP to create POJO class name as Book with field id,name and price and we have to
create one more class name as Library and Library class contain two methods
void setBook(Book book)
void showBook() */

//pojo
 public class Book
{
    private int id;
    private String name;
    private float price;

    // Setters
    public void setId(int id) 
	{
        this.id = id;
    }

    public void setName(String name) 
	{
        this.name = name;
    }

    public void setPrice(float price) 
	{
        this.price = price;
    }

    // Getters
    public int getId() 
	{
        return id;
    }

    public String getName() 
	{
        return name;
    }

    public float getPrice() 
	{
        return price;
    }
}


//library

public class Library
{
    private Book book;   // Reference to Book object

    public void setBook(Book book)
    {
        this.book = book;
    }

    public void showBook()
    {
        if(book != null)
        {
            System.out.println("Book Details:");
            System.out.println("ID: " + book.getId());
            System.out.println("Name: " + book.getName());
            System.out.println("Price: " + book.getPrice());
        }
        else
        {
            System.out.println("No Book Found!");
        }
    }
}


public class library_21
{
    public static void main(String x[] )
    {
        Book b = new Book();
		
        b.setId(101);
        b.setName("Java Programming");
        b.setPrice(499.50f);

        Library lib = new Library();
		
        lib.setBook(b);
        lib.showBook();
    }
} 

/* java library_21.java
Book Details:
ID: 101
Name: Java Programming
Price: 499.5
 */
