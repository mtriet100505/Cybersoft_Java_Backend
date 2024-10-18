import java.util.Scanner;
public class Ex5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Xin chào! Cho hỏi ai đang sử dụng máy? ");
        char thanhVien=sc.next().charAt(0);
        String loiChao="";
        switch (thanhVien) {
            case 'B':
                loiChao="Xin chào Ba";
                break;
            case 'M':
                loiChao="Xin chào Mẹ";
                break;
            case 'A':
                loiChao="Xin chào anh trai";
                break;
            case 'E':
                loiChao="Xin chào em gai";
                break;
            default:
                System.out.println("Ký tự không hợp lệ");
                break;
        }
        System.out.println(loiChao);
    }
}
