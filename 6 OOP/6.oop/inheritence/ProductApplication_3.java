/* 3. Question:
 Create a base class Product with fields id, name, and price. Create subclasses Electronics (10% discount) and Clothing (20% discount).
 Write a program to calculate and print final prices after applying discounts.
Explanation:
 This tests constructor chaining and method overriding for price calculation.
 */

import java.util.*;

class Product
{
    int id;
    String name;
    double price;

    Product(int id, String name, double price)
    {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Base class → no discount
    double getFinalPrice()
    {
        return 0;
    }
}

// Electronics → 10% discount
class Electronics extends Product
{
    Electronics(int id, String name, double price)
    {
        super(id, name, price);   // constructor chaining
    }

    double getFinalPrice()
    {
        return price - (price * 0.10);
    }
}

// Clothing → 20% discount
class Clothing extends Product
{
    Clothing(int id, String name, double price)
    {
        super(id, name, price);
    }

    double getFinalPrice()
    {
        return price - (price * 0.20);
    }
}

public class ProductApplication_3
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        Product p = null;

        // Electronics
        System.out.println("Enter Electronics Product (id, name, price):");
		
        int eid = sc.nextInt();
        String ename = sc.next();
        double eprice = sc.nextDouble();

        p = new Electronics(eid, ename, eprice);
        System.out.println("Final Price (Electronics 10% off): " + p.getFinalPrice());

        System.out.println("----------------------------------------------");

        // Clothing
        System.out.println("Enter Clothing Product (id, name, price):");
        int cid = sc.nextInt();
        String cname = sc.next();
        double cprice = sc.nextDouble();

        p = new Clothing(cid, cname, cprice);
        System.out.println("Final Price (Clothing 20% off): " + p.getFinalPrice());
    }
}

/* java ProductApplication_3.java
Enter Electronics Product (id, name, price):

1
fan
1500
Final Price (Electronics 10% off): 1350.0
----------------------------------------------
Enter Clothing Product (id, name, price):
2
shirt
500
Final Price (Clothing 20% off): 400.0 */
