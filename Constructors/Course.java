/* Problem 2: Online Course Management
    Design a Course class with:
        Instance Variables: courseName, duration, fee.
        Class Variable: instituteName (common for all courses).
        Methods:
            An instance method displayCourseDetails() to display the course details.
            A class method updateInstituteName() to modify the institute name for all courses.
 */

public class Course {
    String courseName;
    int duration;
    int fee;
    static String instituteName="ABC Institute";

    Course(String n, int d, int f){
        courseName = n;
        duration = d;
        fee = f;
    }
    void displayCourseDetails(){
        System.out.println("------------------");
        System.out.println("Name of the Institute :"+instituteName);
        System.out.println("Name of the Course :"+courseName);
        System.out.println("Duration of the Course :"+duration);
        System.out.println("Fee for the Course :"+fee);
        System.out.println("--------------------");
    }
    static void updateInstituteName(String newName){
        instituteName = newName;
        System.out.println("Institute name updated to :"+instituteName);
    }
    public static void main(String[] args) {
        Course c1 = new Course("BCA", 3, 52000);
        Course c2 = new Course("MCA", 2, 75000);

        c1.displayCourseDetails();
        c2.displayCourseDetails();

        Course.updateInstituteName("XYZ Institute");
        
        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}
