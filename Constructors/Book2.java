// 5. Library Book System: Create a Book class with attributes title, author, price, and availability. 
//    Implement a method to borrow a book.

public class Book2 {
    String title;
    String author;
    double price;
    boolean isAvailable;

    Book2(String t, String a, double p, boolean i){
        title = t;
        author = a;
        price = p;
        isAvailable = i;
    }
    void borrowBook(){
        if(isAvailable){
            isAvailable = false;
            System.out.println("The Book is successfully borrowed :"+title);
        }else{
            System.out.println("Sorry the Book "+title+" is not available");
        }
    }
    void displayDetails(){
        System.out.println("------------------");
        System.out.println("Book Title :"+title);
        System.out.println("Book Author :"+author);
        System.out.println("Book Price :"+price);
        System.out.println(isAvailable ? "Yes" : "No");
        System.out.println("-------------------");
    }
    public static void main(String[] args) {
        Book2 b1 = new Book2("Clean Code", "Robert C. Marting", 350, true);
        Book2 b2 = new Book2("The Java Handbook", "Patrick Naughton", 490, true);
        b1.displayDetails();
        b2.displayDetails();

        b1.borrowBook();

        b1.borrowBook();

        b2.borrowBook();

        b1.displayDetails();
        b2.displayDetails();

    }
}
