/* Q2. Problem Statement:
Write a Java program to implement the concept of inheritance for different types of vehicles.
 The program must include four classes:
Vehicle – Superclass
Bus – Subclass of Vehicle
Truck – Subclass of Vehicle
Transport – Driver class containing the main() method


The goal is to demonstrate the concept of inheritance, constructor chaining, method overriding, and object-oriented encapsulation.
Detailed Description:
1. Class: Vehicle (Superclass)
Data Members:
String model – Vehicle model
String registrationNumber – Registration number of the vehicle
double speed – Vehicle speed in kilometers per hour
double fuelCapacity – Fuel tank capacity in liters
double fuelConsumption – Fuel consumption in kilometers per liter


Member Methods:
Parameterized Constructor


Initializes all data members with the given values.


Getters and Setters
Provide get and set methods for each data member.


fuelNeeded(double distance)
Accepts distance (in kilometers) as an argument.
Calculates and returns the amount of fuel required for that distance.


distanceCovered(double time)
Accepts time (in hours) as an argument.
Calculates and returns the distance covered based on the vehicle’s speed.
display()
Displays all details of the vehicle, including model, registration number, speed, fuel capacity, and fuel consumption.
2. Class: Truck (Subclass of Vehicle)
Additional Data Member:
double cargoWeightLimit – Cargo carrying capacity in kilograms.
Member Methods:
Parameterized Constructor
Initializes all data members, including those inherited from the Vehicle class (using super()), and cargoWeightLimit.


Overridden display() Method
Must call super.display() to display the base class details,
 and then display the cargo weight limit specific to the truck.
3. Class: Bus (Subclass of Vehicle)
Additional Data Member:
int numberOfPassengers – Total number of passengers the bus can carry.


Member Methods :
Parameterized Constructor


Initializes all data members, including those from the superclass (using super()).


Getters and Setters
Provide getter and setter methods for numberOfPassengers.


Overridden display() Method


Must call super.display() to display base class details,
 and then display the number of passengers specific to the bus.
4. Class: Transport (Driver Class)
Description:
 This class must contain the main() method to test inheritance and method overriding.
Steps to Perform in main() Method:
Create an object of Truck and initialize all its data members with valid values using the parameterized constructor.


Create an object of Bus and initialize all its data members with valid values using the parameterized constructor.


For both objects:


Call the fuelNeeded() method by passing a sample distance (e.g., 500 km).
Call the distanceCovered() method by passing a sample time (e.g., 5 hours).
Call the display() method to display all details.
Concepts Demonstrated:
Inheritance (Superclass → Subclasses)
Constructor Chaining using super()
Method Overriding (display() method)
Encapsulation (Private data members with getters/setters)
Polymorphism (Different display() methods for Bus and Truck) */



class Vehicle {
    private String model;
    private String registrationNumber;
    private double speed;
    private double fuelCapacity;
    private double fuelConsumption;

    Vehicle(String model, String registrationNumber, double speed, double fuelCapacity, double fuelConsumption) {
        this.model = model;
        this.registrationNumber = registrationNumber;
        this.speed = speed;
        this.fuelCapacity = fuelCapacity;
        this.fuelConsumption = fuelConsumption;
    }

    public String getModel() { return model; }
    public String getRegistrationNumber() { return registrationNumber; }
    public double getSpeed() { return speed; }
    public double getFuelCapacity() { return fuelCapacity; }
    public double getFuelConsumption() { return fuelConsumption; }

    public void setModel(String m) { model = m; }
    public void setRegistrationNumber(String r) { registrationNumber = r; }
    public void setSpeed(double s) { speed = s; }
    public void setFuelCapacity(double f) { fuelCapacity = f; }
    public void setFuelConsumption(double f) { fuelConsumption = f; }

    double fuelNeeded(double distance) {
        return distance / fuelConsumption;
    }

    double distanceCovered(double time) {
        return speed * time;
    }

    void display() {
        System.out.println("Model: " + model);
        System.out.println("Registration No: " + registrationNumber);
        System.out.println("Speed: " + speed + " km/hr");
        System.out.println("Fuel Capacity: " + fuelCapacity + " L");
        System.out.println("Fuel Consumption: " + fuelConsumption + " km/L");
    }
}

// ---------------- TRUCK ----------------

class Truck extends Vehicle {
    double cargoWeightLimit;

    Truck(String model, String regNo, double speed, double fuelCap, double fuelCons, double cargoWeightLimit) {
        super(model, regNo, speed, fuelCap, fuelCons);
        this.cargoWeightLimit = cargoWeightLimit;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Cargo Weight Limit: " + cargoWeightLimit + " kg");
    }
}

// ---------------- BUS ----------------

class Bus extends Vehicle {
    private int numberOfPassengers;

    Bus(String model, String regNo, double speed, double fuelCap, double fuelCons, int numberOfPassengers) {
        super(model, regNo, speed, fuelCap, fuelCons);
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getNumberOfPassengers() { return numberOfPassengers; }
    public void setNumberOfPassengers(int n) { numberOfPassengers = n; }

    @Override
    void display() {
        super.display();
        System.out.println("Passenger Capacity: " + numberOfPassengers);
    }
}

// ---------------- MAIN ----------------

public class Transport_2
 {
    public static void main(String[] args) {

        // Truck object
        Truck t = new Truck("TATA-800", "MH12AB1234", 80, 120, 5, 15000);

        System.out.println("\n--- TRUCK DETAILS ---");
        System.out.println("Fuel Needed (500km): " + t.fuelNeeded(500));
        System.out.println("Distance Covered (5 hrs): " + t.distanceCovered(5));
        t.display();

        // Bus object
        Bus b = new Bus("Volvo AC", "MH14XY5678", 90, 200, 4, 50);

        System.out.println("\n--- BUS DETAILS ---");
        System.out.println("Fuel Needed (500km): " + b.fuelNeeded(500));
        System.out.println("Distance Covered (5 hrs): " + b.distanceCovered(5));
        b.display();
    }
}
/* 
java Transport_2.java

--- TRUCK DETAILS ---
Fuel Needed (500km): 100.0
Distance Covered (5 hrs): 400.0
Model: TATA-800
Registration No: MH12AB1234
Speed: 80.0 km/hr
Fuel Capacity: 120.0 L
Fuel Consumption: 5.0 km/L
Cargo Weight Limit: 15000.0 kg

--- BUS DETAILS ---
Fuel Needed (500km): 125.0
Distance Covered (5 hrs): 450.0
Model: Volvo AC
Registration No: MH14XY5678
Speed: 90.0 km/hr
Fuel Capacity: 200.0 L
Fuel Consumption: 4.0 km/L
Passenger Capacity: 50
 */