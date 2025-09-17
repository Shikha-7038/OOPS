// Problem 1: Product Inventory
// Create a Product class with:
//     Instance Variables: productName, price.
//     Class Variable: totalProducts (shared among all products).
//     Methods:
//          An instance method displayProductDetails() to display the details of a product.
//          A class method displayTotalProducts() to show the total number of products created.


public class Product {
    String productName;
    double price;
    static int totalProducts = 0;

    Product(String n, double p){
        productName = n;
        price = p;
        totalProducts++;
    }
    void displayProductDetails(){
        System.out.println("------------------------");
        System.out.println("Name of the Product :"+productName);
        System.out.println("Price of the Product :"+price);
        System.out.println("------------------------");
    }
    static void displayTotalProducts(){
            System.out.println("Total number of Products :"+totalProducts);
    }

    public static void main(String[] args){
        Product p1 = new Product("Laptop", 50000);
        Product p2 = new Product("Mobile Phone", 20000);
        Product p3 = new Product("HeadPhones", 2500);

        p1.displayProductDetails();
        p2.displayProductDetails();
        p3.displayProductDetails();

        Product.displayTotalProducts();
    }
}
