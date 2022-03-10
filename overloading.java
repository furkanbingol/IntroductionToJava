public class overloading {
    public static void addition(int a, int b, int c, int d)
    {
        System.out.println("Result: " + (a+b+c+d));
    }
    public static void addition(int a, int b, int c)
    {
        System.out.println("Result: " + (a+b+c));
    }
    public static void addition(int a, int b)
    {
        System.out.println("Result: " + (a+b));
    }
    
    public static void main(String args[])
    {
        addition(1,2,3,4);
        addition(1,4,15);
        addition(5,25); 
    }
}
