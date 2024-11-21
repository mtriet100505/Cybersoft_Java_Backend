package Exercise_4;

public class BankAccount {
    private String accountNumber;
   protected double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Deposit successful: "+amount);
        }else{
            System.out.println("Deposit failed: Invalid amount.");
        }
    }
    public void withdraw(double amount){
        if(amount>0 && amount<=balance){
            balance-=amount;
            System.out.println("Withdrawal successful: "+amount);
        }else{
            System.out.println("Withdrawal failed: Insufficient balance. ");
        }
    }
    public void displayBalance() {
        System.out.println("Account Number: " + this.accountNumber + ", Balance: " + this.balance);
    }
}
