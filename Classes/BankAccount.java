public class BankAccount {
    String accountHolder;
    String accountNumber;
    double balance;

    void setDetails(String h, String n, double b){
        accountHolder = h;
        accountNumber = n;
        balance = b;
    }
    void deposit(double amount){
        if (amount>0){
            balance += amount;
            System.out.println("Deposit :"+ amount);
        }else{
            System.out.println("Invalid deposit amount");
        }
    }
    void withdraw(double amount){
        if(amount>0 && amount<=balance){
            balance -= amount;
            System.out.println("Withdraw Money :"+ amount);
        }else{
            System.out.println("Insufficient balance or invalid amount ");
        }
    }
    void displayDetails(){
        System.out.println("----------------------------");
        System.out.println("Account Holder :"+accountHolder);
        System.out.println("Account Number :"+ accountNumber);
        System.out.println("Current balance :"+balance );
        System.out.println("-----------------------------");
    }
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();

        b1.setDetails("A", "UHJER0005761", 200000);

        b1.displayDetails();
        b1.deposit(20000);
        b1.deposit(0);
        b1.withdraw(10000);
        b1.withdraw(500000);
        b1.displayDetails();

    }
}
