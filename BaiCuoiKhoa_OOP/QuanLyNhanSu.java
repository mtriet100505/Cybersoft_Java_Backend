import java.util.Scanner;
public class QuanLyNhanSu {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        CongTy congTy=new CongTy();
        int chon;
        do{
            System.out.println("\n===== Quản Lý Nhân Sự Công Ty =====");
            System.out.println("1. Nhập thông tin công ty");
            System.out.println("2. Phân bố nhân viên vào trưởng phòng");
            System.out.println("3. Thêm, xóa thông tin một nhân sự");
            System.out.println("4. Xuất thông tin toàn bộ nhân sự trong công ty");
            System.out.println("5. Tính và xuất tổng lương cho toàn công ty");
            System.out.println("6. Tìm nhân viên thường có lương cao nhất");
            System.out.println("7. Tìm trưởng phòng có số lượng nhân viên dưới quyền nhiều nhất");
            System.out.println("8. Sắp xếp nhân viên theo thứ tự ABC");
            System.out.println("9. Sắp xếp nhân viên theo thứ tự lương giảm dần");
            System.out.println("10. Tìm giám đốc có số cổ phần nhiều nhất");
            System.out.println("11. Tính và xuất tổng thu nhập của từng giám đốc");
            System.out.println("0. Thoát");
            System.out.print("Mời chọn chức năng: ");
            chon=scanner.nextInt();
            switch (chon){
                case 1 -> congTy.nhapThongTinCongTy();
                case 2 -> congTy.phanBoNhanVienVaoTruongPhong();
                case 3 ->{
                    System.out.println("1. Thêm nhân sự ");
                    System.out.println("2. Xoá nhân sự");
                    System.out.print("Chọn chức năng: ");
                    int luaChon=scanner.nextInt();
                    scanner.nextLine();
                    if(luaChon==1){
                            System.out.print("Nhập loại nhân sự (1 - Nhân viên, 2 - Trưởng phòng, 3 - Giám đốc): ");
                            int loaiNhanSu=scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Nhập mã số: ");
                            String maSo = scanner.nextLine();
                            System.out.print("Nhập họ tên: ");
                            String hoTen = scanner.nextLine();
                            System.out.print("Nhập số điện thoại: ");
                            String soDienThoai = scanner.nextLine();
                            System.out.print("Nhập số ngày làm việc: ");
                            int soNgayLamViec = scanner.nextInt();
                            switch (loaiNhanSu){
                                case 1:
                                    NhanVien nhanVien=new NhanVien(maSo,hoTen,soDienThoai,soNgayLamViec);
                                    congTy.themNhanSu(nhanVien);
                                    break;
                                case 2:
                                    TruongPhong truongPhong=new TruongPhong(maSo,hoTen,soDienThoai,soNgayLamViec);
                                    congTy.themNhanSu(truongPhong);
                                    break;
                                case 3:
                                    System.out.print("Nhập cổ phần (%): ");
                                    double coPhan=scanner.nextDouble();
                                    GiamDoc giamDoc=new GiamDoc(maSo,hoTen,soDienThoai,soNgayLamViec,coPhan);
                                    congTy.themNhanSu(giamDoc);
                                    break;
                                default:
                                    System.out.println("Loại nhân sự không hợp lệ");
                                    break;
                            }
                    } else if (luaChon==2) {
                        System.out.println("Nhập mã nhân sự cần xóa: ");
                        String maSo=scanner.nextLine();
                        congTy.xoaNhanSu(maSo);
                        System.out.println("Xóa nhân sự thành công");
                    }else{
                        System.out.println("Chọn sai chức năng");
                    }
                }
                case 4 -> congTy.xuatThongTinNhanSu();
                case 5-> congTy.tinhVaXuatTongLuongCongTy();
                case 6 -> congTy.timNhanVienLuongCaoNhat();
                case 7 -> congTy.timTruongPhongCoNhieuNhanVienNhat();
                case 8 ->congTy.sapXepNhanVienTheoABC();
                case 9 -> congTy.sapXepNhanVienTheoLuongGiamDan();
                case 10 -> congTy.timGiamDocCoPhanNhieuNhat();
                case 11 -> congTy.tinhVaXuatThuNhapGiamDoc();
                case 0 -> {
                    System.out.println("Thoát chương trình ");
                   System.exit(0);
                }
                default -> System.out.println("Sai chức năng, vui lòng chọn lại");
            }
        }while (true);
    }
}