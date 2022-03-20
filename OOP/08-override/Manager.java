public class Manager extends Employee{ //INHERITANCE
    private int num_of_employees;

    //Constructor (alt+insert)
    public Manager(String name, String department, int salary, int num_of_employees) {
        super(name, department, salary); //// call constructor from super(base) class {like 'this' keyword}
        this.num_of_employees = num_of_employees; //special property (only manager has)
    }

    public void raiseSalary(int amount)
    {
        System.out.println(amount +"$ raise to employees");
    }

    @Override //Intellij IDEA 'shortcut': ctrl+o
    public void showInfos() {
        super.showInfos();
        System.out.println("Number of employees: " + this.num_of_employees);
    }

    @Override
    public String toString() {
        return "Manager Object";
    }
}
