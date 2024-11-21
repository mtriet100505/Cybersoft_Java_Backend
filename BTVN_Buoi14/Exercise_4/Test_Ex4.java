package Exercise_4;

public class Test_Ex4 {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount("CHK123", 500, 200);
        SavingsAccount savingsAccount = new SavingsAccount("SAV123", 1000);
        checkingAccount.deposit(300);
        checkingAccount.withdraw(700);
        checkingAccount.displayBalance();

        savingsAccount.deposit(500);
        savingsAccount.deposit(1200);
        savingsAccount.displayBalance();
    }
}
