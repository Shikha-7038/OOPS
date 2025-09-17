/* Problem 4: Employee Records
    Develop an Employee class with:
        employeeID (public).
        department (protected).
        salary (private).
    Write methods to:
        Modify salary using a public method.
        Create a subclass Manager to access employeeID and department.
 */
public class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }
    public void setSalary(double salary){
        if(salary>0){
            this.salary = salary;
        }else{
            System.out.println("Invalid salary amount :");
        }
    }
    public double getSalary(){
        return salary;
    }
    public void displayDetails(){
        System.out.println("-------------------------");
        System.out.println("Employee ID :"+employeeID);
        System.out.println("Department :"+department);
        System.out.println("Salary :"+salary);
        System.out.println("---------------------------");
    }
    public static void main(String[] args){
        Employee e1 = new Employee(101,"HR",45000);
        e1.displayDetails();

        e1.setSalary(50000);
        System.out.println("Updated Salary :"+e1.getSalary());

        Manager m1 = new Manager(104, "IT", 75000);
        m1.displayDetails();
        m1.displayManagerDetails();
    }
}
class Manager extends Employee{
    Manager(int employeeID, String department, double salary){
        super(employeeID, department, salary);
    }
    public void displayManagerDetails(){
        System.out.println("Manager ID (public) :"+employeeID);
        System.out.println("Manager Department (protected) :"+department);
    }
}
