public class Main {
    public static void main(String args[])
    {
        Car car1 = new Car(); //creating an object
        
        car1.color = "Blue";
        car1.model = "Renault Megane";
        car1.engine = 1.6;
        car1.doors = 4;
        
        System.out.println("Color of the car: " + car1.color);
        System.out.println("Model of the car: " + car1.model);
        System.out.println("Engine size of the car: " + car1.engine);
        System.out.println("Number of doors of the car: " + car1.doors);
    }
}
