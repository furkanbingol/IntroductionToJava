public class Main {
    public static void main(String[] args) {
        /*
        Employee employee = new Employee("Kevin","Blockchain",5000);
        employee.showInfos();
        */
        Manager manager = new Manager("Furkan","Blockchain",10000,10);
        manager.showInfos();
        System.out.println();
        manager.raiseSalary(500);

        System.out.println(manager);  //through the "toString" method in the "object class"
        System.out.println(manager.toString()); //same
    }
}
