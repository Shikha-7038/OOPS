/* Problem 3: Vehicle Registration
    Create a Vehicle class to manage the details of vehicles:
        Instance Variables: ownerName, vehicleType.
        Class Variable: registrationFee (fixed for all vehicles).
        Methods:
            An instance method displayVehicleDetails() to display owner and vehicle details.
            A class method updateRegistrationFee() to change the registration fee.
 */

public class Vehicle {
    String ownerName;
    String vehicleType;
    static int registerationFee = 20000;

    Vehicle(String n, String t){
        ownerName = n;
        vehicleType = t;
    }
    void displayVehicleDetails(){
        System.out.println("--------------------");
        System.out.println("Registeration Fee :"+registerationFee);
        System.out.println("Name of the Owner :"+ownerName);
        System.out.println("Type of the Vehicle :"+vehicleType);
        System.out.println("-----------------------");
    }
    static void updateRegisterationFee(int newFee){
        registerationFee = newFee;
        System.out.println("Registeration Fee of the Vehicle is updated."+registerationFee);
    }
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Shreya", "Car");
        Vehicle v2 = new Vehicle("Aaradhya", "Motorcycle");

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        Vehicle.updateRegisterationFee(30000);

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}
