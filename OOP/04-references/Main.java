public class Main {
    public static void main(String args[])
    {
        Car car1 = new Car("Silver","Megan",1.6,4);
        Car car2 = car1; //reference
        Car car3 = null; //not point any object
        car2.showInfos();
        
        String s1 = new String("Furkan");
        String s2 = new String("Furkan");
        
        if (s1 == s2) //references are not the SAME
            System.out.println("\nEqual");
        else
            System.out.println("\nNot equal");
    }
}
