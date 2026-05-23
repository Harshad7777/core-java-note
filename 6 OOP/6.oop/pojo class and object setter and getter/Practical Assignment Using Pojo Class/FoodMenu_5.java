/* Q5. Problem  
Write a java to Create class name as Food with using data memberfid,fname,fprice, fcategory using do while and switch case.
create array of object of size 5 ,store the food details in it and perform following operations.
	
	1 : Add All Food details.
	2 : Display All Food details.
	3 : Display Bill Details :
		1 :  Bill Without Gst.
		2 : Bill With 18% Gst. */
		
import java.util.*;

class Food
{
    private int fid;
    private String fname;
    private float fprice;
    private String fcategory;

    // setters
    public void setFid(int fid) {
        this.fid = fid;
    }
    public void setFname(String fname) {
        this.fname = fname;
    }
    public void setFprice(float fprice) {
        this.fprice = fprice;
    }
    public void setFcategory(String fcategory) {
        this.fcategory = fcategory;
    }

    // getters
    public int getFid() { return fid; }
    public String getFname() { return fname; }
    public float getFprice() { return fprice; }
    public String getFcategory() { return fcategory; }

    public void showFood() {
        System.out.println(fid + " | " + fname + " | " + fprice + " | " + fcategory);
    }
}

public class FoodMenu_5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Food[] foods = new Food[5];

        int choice;
        do
        {
            System.out.println("\n===== FOOD MENU =====");
            System.out.println("1. Add All Food Details");
            System.out.println("2. Display All Food Details");
            System.out.println("3. Display Bill Details");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    // Add food details
                    for(int i = 0; i < foods.length; i++)
                    {
                        foods[i] = new Food();
                        System.out.println("\nEnter Food " + (i+1) + " Details:");

                        System.out.print("Food ID: ");
                        foods[i].setFid(sc.nextInt());

                        System.out.print("Food Name: ");
                        foods[i].setFname(sc.next());

                        System.out.print("Food Price: ");
                        foods[i].setFprice(sc.nextFloat());

                        System.out.print("Food Category: ");
                        foods[i].setFcategory(sc.next());
                    }
                    break;

                case 2:
                    // Display food details
                    System.out.println("\nFid | Name | Price | Category");
                    System.out.println("-------------------------------");
                    for(int i = 0; i < foods.length; i++)
                    {
                        if(foods[i] != null)
                            foods[i].showFood();
                    }
                    break;

                case 3:
                    // Bill Menu
                    int billChoice;
                    float sum = 0;

                    for(int i = 0; i < foods.length; i++)
                    {
                        if(foods[i] != null)
                            sum += foods[i].getFprice();
                    }

                    System.out.println("\nBill Menu:");
                    System.out.println("1. Bill Without GST");
                    System.out.println("2. Bill With 18% GST");
                    System.out.print("Enter Choice: ");
                    billChoice = sc.nextInt();

                    if(billChoice == 1)
                    {
                        System.out.println("Total Bill (Without GST): " + sum);
                    }
                    else if(billChoice == 2)
                    {
                        float gst = sum * 0.18f;
                        System.out.println("Total Bill With 18% GST: " + (sum + gst));
                    }
                    else
                    {
                        System.out.println("Invalid Choice!");
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while(choice != 4);

        sc.close();
    }
}
/* 
java FoodMenu_5.java

===== FOOD MENU =====
1. Add All Food Details
2. Display All Food Details
3. Display Bill Details
4. Exit
Enter Choice: 1

Enter Food 1 Details:
Food ID: 1
Food Name: vegmaratha
Food Price: 170
Food Category: veg

Enter Food 2 Details:
Food ID: 2
Food Name: shavbhgi
Food Price: 140
Food Category: veg

Enter Food 3 Details:
Food ID: 3
Food Name: chickanthli
Food Price: 550
Food Category: nonveg

Enter Food 4 Details:
Food ID: 4
Food Name: kajumasala
Food Price: 250
Food Category: veg

Enter Food 5 Details:
Food ID: 5
Food Name: dalrice
Food Price: 120
Food Category: veg

===== FOOD MENU =====
1. Add All Food Details
2. Display All Food Details
3. Display Bill Details
4. Exit
Enter Choice: 2

Fid | Name | Price | Category
-------------------------------
1 | vegmaratha | 170.0 | veg
2 | shavbhgi | 140.0 | veg
3 | chickanthli | 550.0 | nonveg
4 | kajumasala | 250.0 | veg
5 | dalrice | 120.0 | veg

===== FOOD MENU =====
1. Add All Food Details
2. Display All Food Details
3. Display Bill Details
4. Exit
Enter Choice: 3

Bill Menu:
1. Bill Without GST
2. Bill With 18% GST
Enter Choice: 2
Total Bill With 18% GST: 1451.4

===== FOOD MENU =====
1. Add All Food Details
2. Display All Food Details
3. Display Bill Details
4. Exit
Enter Choice: 4
Exiting...
 */