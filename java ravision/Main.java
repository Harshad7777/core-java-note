class Main
{
    // Original main method (entry point)
    public static void main(String[] args) 
    {
        System.out.println("Original main");
        
        // Calling overloaded main method
        main(10);
    }

    // Overloaded main method
    public static void main(int x) 
    {
        System.out.println("Overloaded main: " + x);
    }
}