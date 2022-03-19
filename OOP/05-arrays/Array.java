import java.util.Scanner;

public class Array {
    public static double mean(int[] a)
    {
        double s = 0;
        int i;
        for(i = 0;i < a.length;++i)
        {
            s += a[i];
        }
        s /= a.length;
        return s;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr1 = {10,20,30,40,50};  //initializing
        int[] arr2 = new int[5];        //declaration
        int[] arr3 = new int[5];
        int i;
        
        for(i = 0; i < arr2.length; ++i)
        {
            arr2[i] = (i+1)*3;
        }
        System.out.println("first element of arr2: " + arr2[0]);
        for(i = 0; i < arr3.length; ++i)
        {
            System.out.println("Enter "+ (i+1) +".number: ");
            int k = scan.nextInt();
            arr3[i] = k;
        }
        System.out.println("\n Elements of the created array:");
        for(i = 0; i < arr3.length; ++i)
        {
            System.out.println(arr3[i] + " ");
        }
        
        System.out.println("Average of the elements of the array: " + mean(arr3));
    }
}
