// 2. Write a Circle class with a radius attribute. 
//    Use constructor chaining to initialize radius with default and user-provided values.
public class Circle{
    double radius;

    Circle(){
        radius = 0;
    }
    Circle(double radius){
        this.radius = radius;
    }
    void displayRadius(){
        System.out.println("Radius of the Circle :"+radius);
    }
    public static void main(String[] args){
        Circle c1 = new Circle();
        c1.displayRadius();

        Circle c2 = new Circle(3.14);
        c2.displayRadius();
    }
}