public class Item {
    int itemCode;
    String itemName;
    double price;

    void setDetails(int code, String name, double p){
        itemCode = code;
        itemName = name;
        price = p;
    }
    void displayDetails(){
        System.out.println("Code of the item :"+itemCode);
        System.out.println("Name of the item :"+itemName);
        System.out.println("Price of the item :"+price);
        System.out.println("--------------");
    }
    double calculateTotalCost(int quantity){
        return price * quantity;
    }
    public static void main(String[] args) {
        Item t1 = new Item();
        Item t2 = new Item();

        t1.setDetails(1, "Pencil", 10.0);
        t2.setDetails(2, "Sketch Book", 60.0);

        t1.displayDetails();
        t2.displayDetails();

        int qty1 = 10;
        int qty2 = 5;

        System.out.println("Total cost for " + qty1 + " " + t1.itemName + "s: " + t1.calculateTotalCost(qty1));
        System.out.println("Total cost for " + qty2 + " " + t2.itemName + "s: " + t2.calculateTotalCost(qty2));
    }
}
