public class Car {
    private String color;
    private String model;
    private double engine;
    private int doors;
    
    //Constructor
    public Car(String color, String model, double engine, int doors) {
        this.color = color;
        this.model = model;
        this.engine = engine;
        this.doors = doors;
    }
    
    //Default Constructor - (OVERLOADING)
    public Car() {
        /*
        this.color = "No info";
        this.model = "No info";
        this.engine = 0;
        this.doors = 0;
        */
        this("No info","No info",0,0); //calls the upper constructor
    }
    
    //OVERLOADING
    public Car(String color, String model)
    {
        this(color,model,0,0);
    }
    
    public String getColor()
    {
        return color;
    }
    
    public void setColor(String color)
    {
        this.color = color;
    }
    
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        //Encapsulation
        if (doors == 2 || doors == 4)
            this.doors = doors;
        else
            System.out.println("Error! The number of doors can be 2 or 4");
    }
    
    public void start()
    {
        System.out.println("The car is running!");
    }
    public void stop()
    {
        System.out.println("The car stopped!");
    }
    
    public void showInfos()
    {
        System.out.println("Color of the car: " + this.color);
        System.out.println("Model of the car: " + this.model);
        System.out.println("Engine size of the car: " + this.engine);
        System.out.println("Number of doors of the car: " + this.doors);
    }
}
