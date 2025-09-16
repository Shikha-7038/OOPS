public class MovieTicket {
    String movieName;
    int seatNumber;
    double price;

    void setDetails(String m, int n, double p){
        movieName = m;
        seatNumber = n;
        price = p;
    }
    void displayDetails(){
        System.out.println("--------------------------");
        System.out.println("Name of the Movie :"+movieName);
        System.out.println("Number of the Seat :"+seatNumber);
        System.out.println("Price of the Movie Ticker :"+price);
        System.out.println("Booking a Ticket :");
        System.out.println("--------------------------");
    }
    public static void main(String[] args) {
        MovieTicket m1 = new MovieTicket();
        MovieTicket m2 = new MovieTicket();

        m1.setDetails("Border", 45, 250);
        m2.setDetails("Dhoom", 56, 300);

        m1.displayDetails();
        m2.displayDetails();
    }
}
