/* Q10. Create a Product class with:
      productName, stock
      Use a constructor to set values.

      Create an array of 15 products.
      Write a method to count how many products have stock < 10.

      Concepts Used:
      ✔ Constructor
      ✔ Array of objects
      ✔ Logical condition (stock < 10)
      ✔ Counter variable
*/

import java.util.*;

class Product
{
    private String productName;
    private int stock;

    // Constructor
    public Product(String productName, int stock)
    {
        this.productName = productName;
        this.stock = stock;
    }

    // Method to check stock < 10
    public boolean isLowStock()
    {
        return stock < 10;
    }
}

public class productStock_10
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Product products[] = new Product[15];

        // Input 15 products
        for(int i = 0; i < 15; i++)
        {
            System.out.println("\nEnter details of Product " + (i + 1));

            System.out.print("Enter Product Name: ");
            String name = sc.next();

            System.out.print("Enter Stock: ");
            int stock = sc.nextInt();

            products[i] = new Product(name, stock);
        }

        // Count low stock items
        int count = 0;

        for(int i = 0; i < 15; i++)
        {
            if(products[i].isLowStock())   // stock < 10
            {
                count++;
            }
        }
        System.out.println("\nTotal products with stock < 10: " + count);
    }
}

/* 
java productStock_10.java

Enter details of Product 1
Enter Product Name: p1
Enter Stock: 15

Enter details of Product 2
Enter Product Name: p2
Enter Stock: 14

Enter details of Product 3
Enter Product Name: p3
Enter Stock: 13

Enter details of Product 4
Enter Product Name: p4
Enter Stock: 12

Enter details of Product 5
Enter Product Name: p5
Enter Stock: 11

Enter details of Product 6
Enter Product Name: p6
Enter Stock: 10

Enter details of Product 7
Enter Product Name: p7
Enter Stock: 9

Enter details of Product 8
Enter Product Name: p8
Enter Stock: 7

Enter details of Product 9
Enter Product Name: p9
Enter Stock: 15

Enter details of Product 10
Enter Product Name: p10
Enter Stock: 13

Enter details of Product 11
Enter Product Name: p11
Enter Stock: 14

Enter details of Product 12
Enter Product Name: p12
Enter Stock: 16

Enter details of Product 13
Enter Product Name: p13
Enter Stock: 12

Enter details of Product 14
Enter Product Name: p14
Enter Stock: 10

Enter details of Product 15
Enter Product Name: p15
Enter Stock: 10

Total products with stock < 10: 2

*/
