public class Manager extends Employee{ //INHERITANCE
    private int num_of_employees;

    //Constructor
    public Manager(String name, String department, int salary, int num_of_employees) {
        super(name, department, salary); //// call constructor from super(base) class {like 'this' keyword}
        this.num_of_employees = num_of_employees; //special property (ONLY Manager has)
    }

    public void raiseSalary(int amount)
    {
        System.out.println(amount +"$ raise to employees");
    }
}
