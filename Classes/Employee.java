public class Employee {
    String name;
    int id;
    double salary;

    void setDetails(String n, int i, double s){
        name = n;
        id = i;
        salary = s;
    }
    void displayDetails(){
        System.out.println("Name :"+ name);
        System.out.println("Id :"+ id);
        System.out.println("Salary :"+salary);
        System.out.println("-----------------");
    }

    public static void main(String[] args){
        Employee e1 = new Employee();
        Employee e2 = new Employee();

        e1.setDetails("Sia", 1, 100000);
        e2.setDetails("Riya", 2, 200000);
        
        e1.displayDetails();
        e2.displayDetails();
    }
}
