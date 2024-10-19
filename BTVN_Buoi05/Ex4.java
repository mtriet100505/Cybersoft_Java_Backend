import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập vào số nguyên có 2 chữ so: ");
        int n=sc.nextInt();
        if(n<10||n>99){
            System.out.println("Số không hợp lệ ");
            return;
        }
        int soHangDonVi=n%10;
        int soHangChuc=n/10;
        String hangDonVi = "", hangChuc = "";
        switch (soHangChuc){
            case 1:
                hangChuc="Mười"; break;
            case 2:
                hangChuc= "Hai mươi "; break;
            case 3:
                hangChuc="Ba mươi"; break;
            case 4:
                hangChuc="Bốn mươi"; break;
            case 5:
                hangChuc="Năm mươi"; break;
            case 6:
                hangChuc="Sáumươi"; break;
            case 7:
                hangChuc="Bảy mươi"; break;
            case 8:
                hangChuc="Tám mươi"; break;
            case 9:
                hangChuc="Chín mươi"; break;
            default:
                System.out.println("Số không hợp lệ "); break;
        }
        switch (soHangDonVi){
            case 0: hangDonVi=""; break;
            case 1:
                if(soHangChuc==1) hangDonVi="một";
                else hangDonVi="mốt"; break;
            case 2:
                hangDonVi="hai"; break;
            case 3:
                hangDonVi="ba"; break;
            case 4:
                hangDonVi="bốn"; break;
            case 5:
                hangDonVi="lăm"; break;
            case 6:
                hangDonVi="sáu"; break;
            case 7:
                hangDonVi="bảy"; break;
            case 8:
                hangDonVi="tám"; break;
            case 9:
                hangDonVi="chín"; break;
            default:
                System.out.println("Số không hợp lệ "); break;
        }
        System.out.println(hangChuc+hangDonVi);
    }
}
