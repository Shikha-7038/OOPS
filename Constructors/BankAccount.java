/* Problem 3: Bank Account Management
    Create a BankAccount class with:
        accountNumber (public).
        accountHolder (protected).
        balance (private).
    Write methods to:
        Access and modify balance using public methods.
        Create a subclass SavingsAccount to demonstrate access to accountNumber and accountHolder.
 */
public class BankAccount {
    public int accountNumber;
    protected String accountHolder;
    private double balance;

    BankAccount(int accountNumber, String accountHolder, double balance){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double newBalance){
        if(newBalance >= 0){
            balance = newBalance;
        }else{
            System.out.println("Balance cannot be negative");
        }
    }
    public void displayDetails(){
        System.out.println("-------------------------");
        System.out.println("Account Number :"+accountNumber);
        System.out.println("Account Holder :"+accountHolder);
        System.out.println("Balance :"+balance);
        System.out.println("-------------------------");
    }
    public static void main(String[] args) {
        BankAccount b = new BankAccount(210, "Sakshi", 20000);
        b.displayDetails();

        b.setBalance(50000);
        System.out.println("Updated Balance :"+b.getBalance());
        b.displayDetails();
        SavingsAccount sa = new SavingsAccount(202, "Ishita", 10000);
        sa.displayDetails();
        sa.displaySavingsAccountDetails();
    }
}
class SavingsAccount extends BankAccount{
    SavingsAccount(int accountNumber, String accountHolder, double balance){
        super(accountNumber, accountHolder, balance);
    }
    public void displaySavingsAccountDetails(){
        System.out.println("Savings Account Number (public) :"+accountNumber);
        System.out.println("Savings Account Holder (protected) :"+accountHolder);
        System.out.println("---------------------");
    }
}

