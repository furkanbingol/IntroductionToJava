import java.util.Scanner;

public class p0wer {
    public static int power(int a, int b) //a: base, b: power
    {
        int result = 1;
        if (b == 0)
            return 1;
        while (b != 0)
        {
            result *= a;
            b--;
        }
        return result;
    }
    
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the base: ");
        int base = scan.nextInt();
        System.out.println("Enter the power: ");
        int power = scan.nextInt();
        int result = power(base,power);
        System.out.println("Result: " + result);
    }
}
