//  !(not)  &&(and)  ||(or)
public class logic_op {
    public static void main(String args[])
    {
        System.out.println("Sonuc: " + !(3 > 4));             //true
        System.out.println("Sonuc: " + ((2 == 2) && 3 > 2));  //true
        System.out.println("Sonuc: " + ((2 == 1) || 3 > 2));  //true
        
        String a = "furkan";
        String b = "Istanbul";
        
        if (a.equals(b))  //in C: strcmp function
            System.out.println("The strings you entered are SAME!");
        else
            System.out.println("The strings you entered are DIFFERENT!");
    }
}
