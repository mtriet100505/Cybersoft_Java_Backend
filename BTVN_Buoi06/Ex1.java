import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
        int number, sum=0;
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.print("Vui lòng nhập so lon hon 0: ");
            number=sc.nextInt();
            if(number<=0){
                break;
            }
            sum+=number;
        }
        System.out.println("Tổng các số đã nhập : "+sum);
    }
}
