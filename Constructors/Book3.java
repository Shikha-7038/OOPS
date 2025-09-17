/* Problem 2: Book Library System
    Design a Book class with:
        ISBN (public).
        title (protected).
        author (private).
    Write methods to:
        Set and get the author name.
        Create a subclass EBook to access ISBN and title and demonstrate access modifiers.
 */
public class Book3 {
    public String ISBN;
    protected String title;
    private String author;

    Book3(String ISBN, String title, String author){
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }
    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void displayDetails(){
        System.out.println("--------------------");
        System.out.println("ISBN :"+ISBN);
        System.out.println("Title :"+ title);
        System.out.println("Author :"+author);
    }
    public static void main(String[] args){
        Book3 b1 = new Book3("978-047357783", "Effective Java", "Joshua Bloch");
        b1.displayDetails();

        b1.setAuthor("J. Bloch");
        System.out.println("Updated Author :"+ b1.getAuthor());

        EBook eb = new EBook("978-86544689", "Clean Code", "Robert C. Martin");
        eb.displayDetails();
        eb.displayEBookDetails();  
    }
}
class EBook extends Book3{
    EBook(String ISBN, String title, String author){
        super(ISBN,title,author);
    }
    public void displayEBookDetails(){
        System.out.println("------------------");
        System.out.println("EBook ISBN (public) :"+ ISBN);
        System.out.println("EBook Title (protected) :"+ title);
    }
}

