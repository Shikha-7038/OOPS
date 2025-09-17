// 4. Hotel Booking System: Create a HotelBooking class with attributes guestName, roomType, and nights.
//    Use default, parameterized, and copy constructors to initialize bookings.

public class HotelBooking {
    String guestName;
    String roomType;
    int nights;

    HotelBooking() {
        guestName = "Unknown";
        roomType = "Unknown";
        nights = 0;
    }
    HotelBooking(String guestName, String roomType, int nights){
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }
    HotelBooking(HotelBooking ref){
        this.guestName = ref.guestName;
        this.roomType = ref.roomType;
        this.nights = ref.nights;
    }
    void displayDetails(){
        System.out.println("========================");
        System.out.println("Name of the Guest :"+guestName);
        System.out.println("Type of the Room :"+roomType);
        System.out.println("Number of nights to stay :"+nights);
        System.out.println("------------------------");
    }
    public static void main(String[] args){
        HotelBooking booking1 = new HotelBooking();
        booking1.displayDetails();

        HotelBooking booking2 = new HotelBooking("Priya", "delux", 5);
        booking2.displayDetails();

        HotelBooking booking3 = new HotelBooking(booking2);
        booking3.displayDetails();
    }

    
}
