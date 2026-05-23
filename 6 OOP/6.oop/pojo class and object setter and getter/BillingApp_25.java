/* Q25. Suppose consider we are working on billing Application and we have following types of classes 
1. Product with field id,name and price and it is POJO class 
2. Customer with field id, name address,email , contact and it is POJO class
3. Shop with following methods 
void storeProducts(Customer c,Product …p): this method can accept infinite product list
void calBill(): this method can calculate bill with grand total and your output should be  */

//product.java

public class Product
{
	private int id;
	private String name;
	private float price;
	
	public Product(int id, String name, float price)
	//parametarized constructor not a setter
	{
		this.id = id; //.this refernce variale make it public in whole method
		this.name = name;
		this.price = price;
	}
	
	public int getId(){ return id;}
	public String getName(){ return name;}
	public float getPrice(){ return price;}
	
}

//customer

public class Customer
{
	private int id;
	private String name;
	private String address;
	private String email;
	private String contact;
	
	public Customer(int id,String name, String address,String email, String contact)
	{
		this.id = id;
		this.name = name;
		this.address = address;
		this.email = email;
		this.contact = contact;
	}
	
	public int getId(){ return id;}
	public String getName(){ return name;}
	public String getAddress(){return address;}
	public String getEmail(){return email;}
	public String getContact(){return contact;}
}



//shop
public class Shop
{
	private Customer customer;
	private Product[] products;
	
	//store customer + unlimited products
	public void storeProducts(Customer c, Product... p)
	{
		this.customer = c;
		this.products = p;
	}
	//calculate and print bill
	public void calBill()
	{
		if (customer == null && products == null)
		{
			System.out.println("no customer or no product found!");
			return;
		}
		else
		{
			System.out.println("===== BILL SUMMAEY ======");
			
			System.out.println("Customer ID :"+customer.getId());
			System.out.println("Name :"+ customer.getName());
			System.out.println("Address :"+customer.getAddress());
			System.out.println("Email :"+customer.getEmail());
			System.out.println("Contact :"+customer.getContact());
			
			System.out.println("----------------------");
			
			float grandTotal = 0;
			
			System.out.println("Purchased Products:");
			/* for(Product p : products) */
			for(int i=0; i< products.length; i++)
			{
				Product p = products[i];
				
				System.out.println(p.getId() +" " +p.getName() +" RS."+ p.getPrice());
				
				grandTotal += p.getPrice();
			}
			
			System.out.println("-----------------------");
			
			System.out.println("GRAND TOTAL : RS."+grandTotal);
			
			System.out.println("========================");
		}
		
	}
}


//main method 
public class BillingApp_25
{
	public static void main(String x[])
	{
		//sample product 
		Product p1 = new Product(101, "Laptop",55000);
		Product p2 = new Product(102, "Mouse",500);
		Product p3 = new Product(103,"Keyborad",800);
		
		//customer details
		Customer c = new Customer(1, "Harshad Rakshe","pune","harshadrakshe28@gmail.com","8459997443");
		
		//shop object
		Shop shop = new Shop();
		
		//shop customer + product using var-args(...)
		shop.storeProducts(c,p1,p2,p3);
		
		//print bill
		shop.calBill();
	}
}


/* 
>java BillingApp_25.java
===== BILL SUMMAEY ======
Customer ID :1
Name :Harshad Rakshe
Address :pune
Email :harshadrakshe28@gmail.com
Contact :8459997443
----------------------
Purchased Products:
101 Laptop RS.55000.0
102 Mouse RS.500.0
103 Keyborad RS.800.0
-----------------------
GRAND TOTAL : RS.56300.0
========================

>
*/
/* 
| Feature          | Setter Method               | Parameterized Constructor      |
| ---------------- | --------------------------- | ------------------------------ |
| When used?       | After object creation       | During object creation         |
| Use case         | Update/change one field     | Initialize all fields          |
| Calls            | Manual call (`p.setName()`) | Automatic (`new Product(...)`) |
| Number of fields | Usually one per method      | Can set all fields             |
| Object state     | Can exist without values    | Values given at creation       |
 */