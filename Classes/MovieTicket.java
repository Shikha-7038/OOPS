public class MovieTicket {
    String movieName;
    int seatNumber;
    double price;
    boolean isBooked;

    void setMovieName(String m){
        movieName = m;
    }

    void bookTicket(int s, double p){
        if(!isBooked){
            seatNumber = s;
            price = p;
            isBooked = true;
            System.out.println("Ticket booked successfully.");
        }else{
            System.out.println("Sorry, ticket already booked.");
        }
    }
    void displayDetails(){
        if(isBooked){
            System.out.println("-------------------------");
            System.out.println("Name of the Movie :"+movieName);
            System.out.println("Number of the Seat :"+seatNumber);
            System.out.println("Price of the Movie Ticket :"+price);
            System.out.println("--------------------------");
        }else{
            System.out.println("No ticket booked yet for movie :"+movieName);
        }
    }
    public static void main(String[] args) {
        MovieTicket t1 = new MovieTicket();

        t1.setMovieName("Border");

        t1.displayDetails();

        t1.bookTicket(18,300);
        t1.displayDetails();

        t1.bookTicket(20, 350);

    }
}
