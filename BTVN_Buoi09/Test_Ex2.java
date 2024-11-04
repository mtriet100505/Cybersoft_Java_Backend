import java.util.Scanner;
public class Test_Ex2 {
    public static void main(String[] args) {
        QuanLySinhVien_2 qlsv=new QuanLySinhVien_2();
        Scanner scanner =new Scanner(System.in);
        //tạo dl giả
        qlsv.themSinhVien(new SinhVien_2("Nguyen Van A", "SV001", 9, 8.5, 9.5));
        qlsv.themSinhVien(new SinhVien_2("Tran Thi B", "SV002", 6, 7, 6.5));
        qlsv.themSinhVien(new SinhVien_2("Le Van C", "SV003", 4, 5, 5.5));
        qlsv.themSinhVien(new SinhVien_2("Pham Thi D", "SV004", 7, 8, 7.5));
        int luaChon;
        do{
            System.out.println("\n----- Quản lý sinh viên -----");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. In danh sách sinh viên");
            System.out.println("3. In sinh viên có ĐTB cao nhất");
            System.out.println("4. In tất cả sinh viên yếu");
            System.out.println("5. Tìm sinh viên theo tên");
            System.out.println("6. Tìm sinh viên theo mã");
            System.out.println("7. Xóa sinh viên theo mã");
            System.out.println("0. Thoát");
            System.out.print("Mời bạn chọn: ");
            while(!scanner.hasNextInt()){
                System.out.println("Vui lòng nhập 1 số nguyên hợp lệ: ");
                System.out.print("Mời bạn chọn: ");
                scanner.next();
            }
            luaChon= scanner.nextInt();
            scanner.nextLine(); //đọc bỏ dòng thừa
            switch (luaChon){
                case 1:
                    System.out.print("Nhập tên SV: ");
                    String ten= scanner.nextLine();
                    System.out.print("Nhập mã sinh viên: ");
                    String maSV = scanner.nextLine();
                    System.out.print("Nhập điểm Toán: ");
                    double diemToan = nhapDiem(scanner, "Toán");
                    System.out.print("Nhập điểm Lý: ");
                    double diemLy = nhapDiem(scanner,"Lý");
                    System.out.print("Nhập điểm Hóa: ");
                    double diemHoa = nhapDiem(scanner, "Hóa");
                    qlsv.themSinhVien(new SinhVien_2(ten, maSV, diemToan, diemLy, diemHoa));
                    break;
                case 2:
                    qlsv.inDanhSachSV();
                    break;
                case 3:
                    qlsv.inSVDtbCaoNhat();
                    break;
                case 4:
                    qlsv.inSVYeu();
                    break;
                case 5:
                    System.out.print("Nhập tên sinh viên cần tìm: ");
                    String tenTimKiem = scanner.nextLine();
                    qlsv.timSVTheoTen(tenTimKiem);
                    break;
                case 6:
                    System.out.print("Nhập mã sinh viên cần tìm: ");
                    String maTimKiem = scanner.nextLine();
                    qlsv.timSinhVienTheoMa(maTimKiem);
                    break;
                case 7:
                    System.out.print("Nhập mã sinh viên cần xóa: ");
                    String maXoa = scanner.nextLine();
                    qlsv.xoaSinhVienTheoMa(maXoa);
                    break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }while(luaChon!=0);
        scanner.close();
    }
    public static double nhapDiem(Scanner scanner, String monHoc){
        double diem;
        do{
            System.out.print("Điểm "+monHoc+": ");
            while(!scanner.hasNextDouble()){
                System.out.println("Vui lòng nhập số thực hợp le: ");
                System.out.println("Điểm "+monHoc+": ");
                scanner.next();
            }
            diem= scanner.nextDouble();
            if(diem<0||diem>10){
                System.out.println("Điểm phải nằm trong khoảng từ 0 đến 10. Vui lòng nhâp lại. ");
            }
        }while(diem<0||diem>10);
        scanner.nextLine();
        return diem;
    }
}