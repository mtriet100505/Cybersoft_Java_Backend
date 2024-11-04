import java.util.ArrayList;
import java.util.Scanner;
public class Test_Ex1 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        ArrayList<SinhVien_1>danhSachSV=new ArrayList<>();
        System.out.print("Nhap so luong sinh vien: ");
        int soLuong = scanner.nextInt();
        scanner.nextLine();
        if(soLuong <=0){
            throw new IllegalArgumentException("Số lượng SV phải lớn hơn 0");
        }
        for (int i = 0; i < soLuong; i++) {
            System.out.println("\nNhap thông tin sv thứ "+(i+1)+": ");
            System.out.print("Tên: ");
            String ten = scanner.nextLine();
            System.out.print("Mã SV: ");
            String maSV = scanner.nextLine();
            System.out.print("Điểm Toán: ");
            double diemToan = nhapDiem(scanner,"Toán");
            System.out.print("Điểm Lý: ");
            double diemLy = nhapDiem(scanner,"Lý");
            System.out.print("Điểm Hóa: ");
            double diemHoa = nhapDiem(scanner,"Hóa");
            SinhVien_1 sv= new SinhVien_1(ten,maSV,diemToan,diemLy,diemHoa);
            danhSachSV.add(sv);
        }
        //Xuất thông tin  SV
        for(SinhVien_1 sv: danhSachSV){
            System.out.println(sv);
        }
    }
    public static double nhapDiem(Scanner scanner, String monHoc){
        double diem;
        do{
            while(!scanner.hasNextDouble()){
                System.out.println("Vui lòng nhập 1 số thực hợp lệ: ");
                System.out.println("Điểm "+monHoc+": ");
                scanner.next();
            }
            diem=scanner.nextDouble();
            if (diem < 0 || diem > 10) {
                System.out.println("Điểm phải nằm trong khoảng từ 0 đến 10. Vui lòng nhập lại!");
            }
        }while( diem<0 ||diem>10);
        scanner.nextLine();
        return diem;
    }
}
