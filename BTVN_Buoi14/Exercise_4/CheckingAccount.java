package Exercise_4;

public class CheckingAccount extends BankAccount {
    private double overdraftLimit;

    public CheckingAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount){
        if(amount>0 && getBalance()+overdraftLimit>=amount){
            setBalance(getBalance()-amount);
            System.out.println("Withdrawal successful (Checking Account): " + amount);
        }else{
            System.out.println("Withdrawal failed: Exceeds overdraft limit.");
        }
    }
    @Override
    public void displayBalance() {
        System.out.println("Checking Account - Account Number: " + getAccountNumber() + ", Balance: " + getBalance() + ", Overdraft Limit: " + overdraftLimit);
    }
}
