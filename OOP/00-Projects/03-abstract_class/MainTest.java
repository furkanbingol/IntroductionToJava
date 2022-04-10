////We 'cannot create objects' from abstract classes(with "new" keyword)
public class MainTest {
    public static void main(String[] args) {
        Person person[] = new Person[4];  //array initialization(not object)
        person[0] = new Student(1234,"Levis",10,17);
        person[1] = new Student(2345,"Kevin",10,19);
        person[2] = new Employee(3456,"Bill",10,59);
        person[3] = new Retired(4567,"Susan",10,70);

        System.out.println("registered users: ");
        for (Person p : person){
            p.printInfo();
        }

        System.out.println("\n(1)after getting on the bus:");
        for (Person p : person){
            p.updateCredit();
            p.printInfo();
        }

        System.out.println("\nage increase:");
        for (Person p : person){
            p.addAge();
            p.printInfo();
        }
        person[1] = new Employee(person[1].getId(),person[1].getName(),person[1].getCredit(),person[1].getAge());  //person[1].age >= 20 (student->employee)
        person[2] = new Retired(person[2].getId(),person[2].getName(),person[2].getCredit(),person[2].getAge());  //person[2].age >= 60 (employee->retired)

        System.out.println("\n(2)after getting on the bus:");
        for (Person p : person){
            p.updateCredit();
            p.printInfo();
        }
    }
}
