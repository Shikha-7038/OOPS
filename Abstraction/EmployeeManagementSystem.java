interface Department{
    void assignDepartment(String deptName);
    String getDepartmentDetails();
}

abstract class Employee implements Department{
    private int employeeId;
    private String name;
    private double baseSalary;
    private String department;

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public int getEmployeeId(){
        return employeeId;
    }

    public void setEmployeeId(int employeeId){
        this.employeeId = employeeId;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name =name;
    }

    public double getBaseSalary(){
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary){
        this.baseSalary = baseSalary;
    }

    public void assignDepartment(String deptName){
        this.department = deptName;
    }
    @Override
    public String getDepartmentDetails(){
        return department;
    }

    public abstract double calculateSalary();
    public void displayDetails(){
        System.out.println("--------------------");
        System.out.println("Employee ID :"+employeeId);
        System.out.println("Employee Name :"+name);
        System.out.println("Base Salary :"+baseSalary);
        System.out.println("Department :"+getDepartmentDetails());
        System.out.println("Final Salary :"+calculateSalary());
        System.out.println("--------------------");
    }
}

class FullTimeEmployee extends Employee{
    double allowance;
    FullTimeEmployee(int employeeId, String name, double baseSalary, double allowance){
        super(employeeId, name, baseSalary);
        this.allowance = allowance;
    }
    @Override
    public double calculateSalary(){
        return getBaseSalary() + allowance;
    }
}

class PartTimeEmployee extends Employee{
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(int employeeId, String name, double baseSalary,int hoursWorked, double hourlyRate) {
        super(employeeId, name, baseSalary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }
    @Override
    public double calculateSalary(){
        return getBaseSalary() + (hoursWorked * hourlyRate);
    }
}
public class EmployeeManagementSystem {
    public static void main(String[] args){
        Employee e1 = new FullTimeEmployee(1, "Kavya", 50000,10000);
        Employee e2 = new PartTimeEmployee(10,"Shreya", 30000, 30, 300);

        e1.assignDepartment("HR");
        e2.assignDepartment("IT");

        Employee[] employees = {e1,e2};
        for(Employee emp : employees){
            emp.displayDetails();
            System.out.println();
        }
    }
}
