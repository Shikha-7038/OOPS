public class Book {
    String title;
    String author;
    double price;

    void setDetails(String t, String a, double p){
        title = t;
        author = a;
        price = p;
    }
    void displayDetails(){
        System.out.println("Title of the book :"+ title);
        System.out.println("Author of the book :"+ author);
        System.out.println("Price of the book :"+ price);
        System.out.println("--------------------");
    }
    public static void main(String[] args){
        Book b1 = new Book();
        Book b2 = new Book();

        b1.setDetails("Java Programming", "James Gosling", 0400);
        b2.setDetails("Clean Code", "Robert C. Martin", 500);

        b1.displayDetails();
        b2.displayDetails();
    }
}
