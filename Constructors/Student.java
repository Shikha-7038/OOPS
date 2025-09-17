/* Problem 1: University Management System
    Create a Student class with:
        rollNumber (public).
        name (protected).
        CGPA (private).
    Write methods to:
        Access and modify CGPA using public methods.
        Create a subclass PostgraduateStudent to demonstrate the use of protected members.
 */

public class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    Student(int rollNumber, String name, double CGPA){
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }
    public double getCGPA(){
        return CGPA;
    }
    public void setCGPA(double CGPA){
        this.CGPA = CGPA;
    }
    public void displayDetails(){
        System.out.println("---------------------");
        System.out.println("Roll Number :"+rollNumber);
        System.out.println("Name :"+ name);
        System.out.println("CGPA :"+CGPA);
        System.out.println("------------------------");
    }
    public static void main(String[] args) {
        Student s1 = new Student(1, "Navya", 8.9);
        s1.displayDetails();

       // System.out.println("CGPA :"+ s1.getCGPA());

        s1.setCGPA(9.0);
        System.out.println("Updated CGPA :"+ s1.getCGPA());
        s1.displayDetails();

        PostgraduateStudent pg = new PostgraduateStudent(101, "Shreya", 9.5);
        pg.displayDetails();
        pg.showName();
    }
}
class PostgraduateStudent extends Student{
    PostgraduateStudent(int rollNumber, String name, double CGPA){
        super(rollNumber, name, CGPA);
    }
    void showName(){
        System.out.println("Postgraduate Student Name (protected):"+ name);
    }
}
