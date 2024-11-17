package Exercise_3;
public class BankAccount {
    private int account_number;
    private int balance;
    public int getAccount_number() {
        return account_number;
    }
    public void setAccount_number(int account_number) {
        this.account_number = account_number;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }

    public BankAccount(int account_number, int balance) {
        this.account_number = account_number;
        this.balance = balance;
    }

    public void deposit(int amount){
        if(amount<=0){
            System.out.println("Số tiền nạp phải >0 ");
            return;
        }
        this.balance+=amount;
        System.out.println("Đã nạp "+amount+" VNĐ và số tien la: "+this.balance);
    }
    public void withdraw(int amount){
        if(amount<=0){
            System.out.println("Số tiền  rút  phải lớn hơn 0 ");
            return;
        }
        if(balance<=amount){
            System.out.println("Số dư không đủ. ");
        }else {
            this.balance-=amount;
            System.out.println("Đã rút "+amount+" VNĐ và số tiền la : "+this.balance);
        }
    }
    public void display_balance(){
        System.out.println("Số dư hiện tại là: "+this.balance+" VNĐ ");
    }
}
