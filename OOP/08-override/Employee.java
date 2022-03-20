public class Employee {
    private final String name;
    private final String department;
    private final int salary;

    public Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    
    public void showInfos()
    {
        System.out.println("Infos...");
        System.out.println("Name: " + this.name);
        System.out.println("Department: " + this.department);
        System.out.println("Salary: " + this.salary);
    }
}
