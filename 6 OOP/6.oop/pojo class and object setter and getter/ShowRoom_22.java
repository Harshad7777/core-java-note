/* Q22. WAP to create POJO class name as Vehicle with field id, name and price and we have one
more class name as ShowRoom with two methods

void setVehicle(Vehicle vehicle): this method can accept Vehicle as parameter
void showVehicle(): this method can show the vehicle details */


import java.util.*;

public class Vehicle
{
	private int id;
	private String name;
	private double price;
	
	//setters
	public void setId(int id)
	{
		this.id = id;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setPrice(double price)
	{
		this.price = price;
	}
	
	//getter
	
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public double getPrice()
	{
		return price;
	}
}




public class ShowRoom
{
	private Vehicle vehicle;
	
	public void setVehicle(Vehicle vehicle)
	{
		this.vehicle = vehicle;
	}
	
	public void showVehicle()
	{
		if(vehicle == null)
		{
			System.out.println("Vehicle Details:");
		}
		else
		{	
			System.out.println("vehicle  details");
			System.out.println("ID:"+vehicle.getId());
			
			System.out.println("Name:"+ vehicle.getName());
			System.out.println("Price:"+ vehicle.getPrice());
		}
	}
}



public class ShowRoom_22
{
	public static void main(String x[])
	{	
		Vehicle v = new Vehicle();
		
		v.setId(101);
		v.setName("DEFFENDER");
		v.setPrice(15000000);
		
		ShowRoom sr = new ShowRoom();
		sr.setVehicle(v);
		sr.showVehicle();
	}
}



/* >java ShowRoom_22.java
vehicle  details
ID:101
Name:DEFFENDER
Price:1.5E7 */


/* private → Only the ShowRoom class can access this variable directly.

Vehicle → This is the type (your POJO class).

vehicle → This is the variable name (object reference). */


