import java.util.Locale;
import java.util.Scanner;

public class input {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in); //Scanner: class, scan: object
        scan.useLocale(Locale.US); //US standards
        
        System.out.println("Enter a integer value: ");
        int a = scan.nextInt();
        System.out.println("Value of a: " + a);
        
        System.out.println("------------");
        
        System.out.println("Enter a float value: ");
        float b = scan.nextFloat(); 
        System.out.println("Value of b: " + b);
        
        System.out.println("------------");
        
        System.out.println("Enter a string: ");
        scan.nextLine();  // '\n'(enter) karakterini stringe atmasın diye boş bir scan yapıyoruz.
        String k = scan.nextLine();
        System.out.println("k : " + k);
   }
}
