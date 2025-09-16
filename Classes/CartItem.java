public class CartItem {
    String itemName;
    double price;
    int quantity;

    void addItem(String i, double p, int q ){
        itemName = i;
        price = p;
        quantity = q;
        System.out.println(itemName + " added to the cart.");
    }
    void removeItem(){
        if(itemName != null){
            System.out.println(itemName + " removed from the cart.");
        }
        itemName = null;
        price = 0;
        quantity =0;
    }
    void displayTotalCost(){
        if(itemName != null){
            double total = price * quantity;
            System.out.println("Total Cost :"+itemName + " - "+ price+ " x "+quantity+ " = "+total);
        }else{
            System.out.println("Cart is empty.");
        }
    }
    public static void main(String[] args){
        CartItem cart = new CartItem();

        cart.addItem("Book",200,3);
        cart.displayTotalCost();

        cart.removeItem();
        cart.displayTotalCost();
    }
}
