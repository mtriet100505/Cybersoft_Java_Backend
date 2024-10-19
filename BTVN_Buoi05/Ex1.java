import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhập số nguyên m: ");
        int m=sc.nextInt();
        System.out.print("Nhập số nguyên n: ");
        int n=sc.nextInt();
        int max=Math.max(m,n);
        System.out.println("Số nguyên lớn nhất trong 2 số "+m+" va "+n+ " là : "+max);
    }
}