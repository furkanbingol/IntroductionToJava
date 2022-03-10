import java.util.Scanner;

public class factorial {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scan.nextInt();
        int fact = 1;
        
        if (n <= 1 && n >= 0)
            System.out.println("Factorial : " + 1);
        else if (n > 1)
        {
            while (n != 0)
            {
                fact *= n;
                n--;
            }
            System.out.println("Factorial : " + fact);
        }
        else
            System.out.println("You entered an invalid number!");
    }
}
