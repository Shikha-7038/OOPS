// 1. Create a Book class with attributes title, author, and price. 
//    Provide both default and parameterized constructors.

public class Book {
    String title;
    String author;
    double price;

    Book(){
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }
    Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    void displayDetails(){
        System.out.println("------------------------");
        System.out.println("Title of the Book :"+ title);
        System.out.println("Author of the Book :"+author);
        System.out.println("Price of the Book :"+price);
        System.out.println("------------------------");
    }
    public static void main(String[] args){
        Book b1 = new Book();
        b1.displayDetails();

        Book b2 = new Book("Wings of Fire", "A.P.J. Abdul Kalam", 400);
        b2.displayDetails();
    }
}
