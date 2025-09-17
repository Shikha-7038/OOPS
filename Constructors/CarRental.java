// 6. Car Rental System: Create a CarRental class with attributes customerName, carModel, and rentalDays. 
//    Add constructors to initialize the rental details and calculate total cost.

public class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double dailyRate;

    CarRental(String n, String m, int d, double r){
        customerName = n;
        carModel = m;
        rentalDays = d;
        dailyRate = r;
    }
    double calculateTotalCost(){
        return dailyRate * rentalDays;
    }

    void displayDetails(){
        System.out.println("-----------------");
        System.out.println("Name of the Customer :"+customerName);
        System.out.println("Model of the Car :"+carModel);
        System.out.println("Number of Rental Days :"+rentalDays);
        System.out.println("Daily Rate for Car Rent :"+dailyRate);
        System.out.println("Total Rental Cost :"+calculateTotalCost());
        System.out.println("------------------");
    }
    public static void main(String[] args){
        CarRental rent1 = new CarRental("Priya", "Swift", 5, 20000);

        rent1.displayDetails();

    }
}
