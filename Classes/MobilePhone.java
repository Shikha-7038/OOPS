public class MobilePhone {
    String brand;
    String model;
    double price;

    void setDetails(String b, String m, double p){
        brand = b;
        model = m;
        price = p;
    }
    void displayDetails(){
        System.out.println("Brand of the Mobile Phone :"+brand);
        System.out.println("Model of the Mobile Phone :"+model);
        System.out.println("Price of the Mobile Phone :"+price);
        System.out.println("-------------------------");
    }
    public static void main(String[] args){
        MobilePhone phone1 = new MobilePhone();
        MobilePhone phone2 = new MobilePhone();

        phone1.setDetails("Apple", "iPhone 14", 79999.0);
        phone2.setDetails("Samsung", "Galaxy 523", 74999.0);

        phone1.displayDetails();
        phone2.displayDetails();
    }
}
