class Animal{
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void speak()
    {
        System.out.println(this.name +" speaking..");
    }
}

class Bird extends Animal{
    public Bird(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(getName() + " singing..");
    }
}

class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(getName() + " barking..");
    }
}

class Horse extends Animal{
    public Horse(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(getName() + " neighing..");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal");
        Bird bird = new Bird("Lemon");
        Dog dog = new Dog("Junie");
        Horse horse = new Horse("Klein");

        animal.speak(); 
        bird.speak();
        dog.speak();
        horse.speak();
        System.out.println();

        Animal animal2 = new Bird("Watermelon"); //POLYMORPHISM
        animal2.speak();
    }
}
