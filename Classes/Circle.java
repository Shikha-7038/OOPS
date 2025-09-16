public class Circle {
    double radius;

    void setRadius(double r){
        radius = r;
    }
    double calculateArea(){
        return Math.PI * radius * radius;
    }

    double calculateCircumference(){
        return 2 * Math.PI * radius;
    }
    void displayDetails(){
        System.out.println("Radius :"+ radius);
        System.out.println("Area of Circle :"+calculateArea());
        System.out.println("Circumference of Circle : "+calculateCircumference());
        System.out.println("-----------------");
    }
    public static void main(String[] args){
        Circle c1 = new Circle();
        Circle c2 = new Circle();

        c1.setRadius(5);
        c2.setRadius(7);
        
        c1.displayDetails();
        c2.displayDetails();
    }
}
