public class Main {
    public static void main(String args[])
    {
        Car car1 = new Car("White","BMW",1.4,4); //Thanks to the "constructor method"
        Car car2 = new Car();
        Car car3 = new Car("Black","Audi");
        
        car1.showInfos();
        System.out.println();
        car2.showInfos();
        System.out.println();
        car3.showInfos();
        
        System.out.println();
        car1.start();
        car1.stop();
    }
}
