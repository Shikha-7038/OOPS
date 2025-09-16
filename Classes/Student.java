public class Student {
    String name;
    int rollNumber;
    double marks;

    void setDetails(String n, int rn, int m){
        name = n;
        rollNumber = rn;
        marks = m;
    }
    char calculateGrade(){
        if(marks >= 90){
            return 'A';
        }else if (marks >= 75) {
            return 'B';
        }else if(marks >= 50){
            return 'C';
        }else{
            return 'D';
        }
    }
    void displayDetails(){
        System.out.println("------------------------");
        System.out.println("Name of the Student :"+name);
        System.out.println("Roll Number of the Student :"+ rollNumber);
        System.out.println("Marks of the Student :"+ marks);
        System.out.println("Grade of the Student :"+calculateGrade());
        System.out.println("--------------------------");
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();

        s1.setDetails("Priya", 101, 90);
        s2.setDetails("Riya", 102, 76);
        s3.setDetails("Sia",103,53);
        s4.setDetails("Shreya", 104, 40);

        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();
        s4.displayDetails();
    }
}
