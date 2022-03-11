public class Main {
    public static void main(String args[])
    {
        Car car1 = new Car();
        
        car1.setColor("Black");
        car1.setModel("Audi A4");
        car1.setEngine(1.8);
        car1.setDoors(4);
        
        System.out.println("Color of the car: " + car1.getColor());
        System.out.println("Model of the car: " + car1.getModel());
        System.out.println("Engine size of the car: " + car1.getEngine());
        System.out.println("Number of doors of the car: " + car1.getDoors());
        car1.start();
        car1.stop();
    }
}
