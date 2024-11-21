package Exercise_4;

public class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }
    @Override
    public void withdraw(double amount) {
        if(amount>0 && getBalance()>=amount){
            setBalance(getBalance()-amount);
        }else{
            System.out.println("Insufficient balance for withdrawal");
        }
    }
    @Override
    public void displayBalance() {
        System.out.println("Savings Account - Account Number: " + getAccountNumber() + ", Balance: " + getBalance());
    }

}
