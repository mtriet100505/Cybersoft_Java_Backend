import java.util.Scanner;
public class Exercise {
    public static int findMax(int a, int b, int c){
        return Math.max(a,Math.max(b,c));
    }
    public static void checkEvenOrOdd(int n){
        System.out.println((n%2==0)?" Số chẵn ":"Số lẻ ");
    }
    public static int sum3Numbers(int a,int b, int c){
        return a+b+c;
    }
    public static double calculate (double a, double b, int operation) {
        switch (operation){
            case 1: return a+b;
            case 2: return a-b;
            case 3: return a*b;
            case 4:
                if(b==0){
                    throw new ArithmeticException("Khong thể chia hết cho 0");
                }else{
                    return a/b;
                }
            default:throw new IllegalArgumentException("Phép toán không hợp lệ");
        }
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Câu 1: ");
            System.out.print("Nhập số thứ nhất: ");
            int a = sc.nextInt();
            System.out.print("Nhập số thứ hai: ");
            int b = sc.nextInt();
            System.out.print("Nhập số thứ ba: ");
            int c = sc.nextInt();
            System.out.println("Số lớn nhất trong ba số là: " + findMax(a, b, c));
            System.out.println("Cau 2: ");
            System.out.print("Nhập số để kiểm tra chan lẻ: ");
            int number = sc.nextInt();
            System.out.print("Số " + number + " là số: ");
            checkEvenOrOdd(number);
            System.out.println("Câu 3: ");
            System.out.print("Nhập số thứ nhất: ");
            int d = sc.nextInt();
            System.out.print("Nhập số thứ hai: ");
            int e = sc.nextInt();
            System.out.print("Nhập số thứ ba: ");
            int f = sc.nextInt();
            System.out.println("Tổng 3 số trên là: " + sum3Numbers(d, e, f));
            System.out.println("Câu 4: ");
            System.out.print("Nhập số thứ nhất: ");
            double x = sc.nextDouble();
            System.out.print("Nhập số thứ hai: ");
            double y = sc.nextDouble();
            System.out.println("Vui lòng nhập lựa chọn: ");
            int choice = sc.nextInt();
            double result = calculate(x, y, choice);
            System.out.println("Kết quả là: " + result);
        } catch (ArithmeticException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}