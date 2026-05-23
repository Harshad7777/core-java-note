/* Q3. Problem:
Create a POJO class Car with fields: carId, model, fuelConsumed, and distanceTravelled. Store details of 5 cars using an array of objects. Perform the following operations:

Calculate the mileage of each car (mileage = distanceTravelled / fuelConsumed).

Find the car with the best mileage.
Display cars whose mileage is above the average mileage of all cars.
Why?
 Here you apply formula-based computation + comparison + filtering, just like the employee salary example, but with a different real-world scenario. */


import java.util.*;

class Car
{
	private int carId;
	private int model;
	private int fuelConsumed;
	private int distanceTravelled;
	
	public void setArr(int carId ,int model , int fuelConsumed, int distanceTravelled)
	{
		this.carId=carId;
		this.model=model;
		this.fuelConsumed = fuelConsumed;
		this.distanceTravelled = distanceTravelled;
	}

	int getCarId()
	{
		return carId;
	}
	int getModel()
	{
		return model;
	}
	int getFuelConsumed()
	{
		return fuelConsumed;
	}
	int getDistanceTravelled()
	{
		return distanceTravelled;
	}
	double getMileage()
	{
		return distanceTravelled/(double)fuelConsumed;
	}
}

class Cardetails
{
	Car cars[];
	
	public void setCars(Car cars[])
	{
		this.cars = cars;
	}
	
	void show()
	{
		//1.milage of each car	
		
		System.out.println("ID------tmodel------tmileage");
		
		double totalMileage = 0;
		
		for(int i=0; i<cars.length; i++)
		{
			double mileage = cars[i].getMileage();
			
			totalMileage += mileage;
			
			System.out.println(cars[i].getCarId()+"\t"+cars[i].getModel()+"\t"+mileage);
		}
		
		// 2.car with best milage
		double bestMileage = -1;
		int index = 0;
		
		for(int i=0; i<cars.length ; i++)
		{
			double mileage = cars[i].getMileage();
			
			if(mileage > bestMileage)
			{
				bestMileage = mileage;
				index = i;
				
			}
		}
		
		System.out.println("\ncar with BEST mileage:");
		
		System.out.print("ID :"+cars[index].getCarId()+"\tModle: "+ cars[index].getModel()+"\tMilage: "+bestMileage);
		
		//3 cars above average mileage
		double avgMileage = totalMileage/cars.length;
		
		System.out.println("\nCars with milage ABOVE avrage ("+avgMileage +"):");
		
		System.out.println("ID|tModel|tmilage");
		
		for(int i = 0; i < cars.length; i++)
		{
			double mileage = cars[i].getMileage();
			
			if(mileage > avgMileage)
			{
				System.out.println(cars[i].getCarId()+"\t"
				+cars[i].getModel()+"\t"+mileage);
			}
		}
	}
}


public class cardetails_3
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		Cardetails cd = new Cardetails();
		
		Car c[] = new Car[5];
		
		for(int i=0; i<c.length; i++)
		{
			c[i]= new Car();
	
		
		System.out.print("Enter car ID:");
		int id = sc.nextInt();
		
		System.out.print("Model :");
		int model = sc.nextInt();
		
		System.out.print("fuelConsumed :");
		int fuelConsumed = sc.nextInt();
		
		System.out.print("distanceTravelled :");
		int distanceTravelled = sc.nextInt();
		
		// array of objects.
		c[i].setArr(id, model, fuelConsumed, distanceTravelled);
		}
		
		cd.setCars(c);
		cd.show();
	}
}
/* 
java cardetails_3.java

Enter car ID:
1
Model :1990
fuelConsumed :10
distanceTravelled :20

Enter car ID:2
Model :1999
fuelConsumed :20
distanceTravelled :20

Enter car ID:3
Model :2025
fuelConsumed :30
distanceTravelled :60

Enter car ID:4
Model :2025
fuelConsumed :60
distanceTravelled :100

Enter car ID:5
Model :2026
fuelConsumed :20
distanceTravelled :100

ID--tmodel--tmileage
1       1990    2.0
2       1999    1.0
3       2025    2.0
4       2025    1.6666666666666667
5       2026    5.0

car with BEST mileage:
ID :5   Modle: 2026  Milage: 5.0

Cars with milage ABOVE avrage (2.3333333333333335):

ID|tModel|tmilage
5       2026    5.0

 */