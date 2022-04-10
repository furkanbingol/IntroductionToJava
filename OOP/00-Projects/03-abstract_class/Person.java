public abstract class Person {  //We 'cannot create objects' from abstract classes(with "new" keyword)
    private int id,age;
    private String name;
    private double credit;

    public abstract void updateCredit();  //subclasses must override this method(ABSTRACT CLASS)

    public Person(int id, String name, double credit, int age) {
        this.id = id;
        this.name = name;
        this.credit = credit;
        this.age = age;
    }

    public void printInfo() {
        System.out.printf("ID: %d \t Name: %s \t Credit: %.3f \t Age: %d\n",getId(),getName(),getCredit(),getAge()) ;
    }

    public void addAge(){
        this.age += 1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }
}
