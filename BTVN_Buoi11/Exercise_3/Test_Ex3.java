package Exercise_3;
public class Test_Ex3 {
    public static void main(String[] args) {
        BankAccount bankAccount=new BankAccount(2452732,2000000);
        bankAccount.setBalance(2000000);
        bankAccount.deposit(500000);
        bankAccount.deposit(600000);
        bankAccount.display_balance();
        bankAccount.withdraw(2000000);
        bankAccount.display_balance();
        bankAccount.withdraw(2000000);
        bankAccount.display_balance();
    }
}
