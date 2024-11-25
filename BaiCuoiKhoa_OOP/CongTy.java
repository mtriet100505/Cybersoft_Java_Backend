import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
public class CongTy {
    private String tenCongTy;
    private String maSoThue;
    private double doanhThuThang;
    private List<NhanSu>danhSachNhanSu;
    public CongTy(){
        danhSachNhanSu=new ArrayList<>();
    }
    public void nhapThongTinCongTy(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhập tên công ty: ");
        this.tenCongTy= scanner.nextLine();
        System.out.print("Nhập mã số thuế: ");
        this.maSoThue=scanner.nextLine();
        System.out.print("Nhâp doanh thu tháng: ");
        this.doanhThuThang=scanner.nextDouble();
    }
    public void phanBoNhanVienVaoTruongPhong(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhập mã nhân viên thường: ");
        String maNhanVien=scanner.nextLine();
        System.out.print("Nhập mã trưởng phòng: ");
        String maTruongPhong= scanner.nextLine();
        NhanVien nhanVien=null;
        TruongPhong truongPhong=null;
        for(NhanSu nhanSu:danhSachNhanSu){
            if(nhanSu instanceof NhanVien && nhanSu.getMaSo().equals(maNhanVien)){
                nhanVien=(NhanVien)nhanSu;
            }
            if(nhanSu instanceof TruongPhong && nhanSu.getMaSo().equals(maTruongPhong)){
                truongPhong=(TruongPhong)nhanSu;
            }
        }
        if(nhanVien!=null && truongPhong!=null){
            nhanVien.setTruongPhongQuanLy(truongPhong);
            truongPhong.tangNhanVienDuoiQuyen();
            System.out.println("Phân bố nhân viên vào trưởng phòng thành công");
        }else{
            System.out.println("Nhân viên hoặc trưởng phòng không tồn tại. ");
        }
    }
    public void themNhanSu(NhanSu nhanSu){
        danhSachNhanSu.add(nhanSu);
    }
    public void xoaNhanSu(String maSo) {
        NhanSu nhanSuXoa = null;
        for (NhanSu nhanSu : danhSachNhanSu) {
            if (nhanSu.getMaSo().equals(maSo)) {
                nhanSuXoa = nhanSu;
                break;
            }
        }
        if (nhanSuXoa != null) {
            if (nhanSuXoa instanceof TruongPhong) {
                for (NhanSu nhanSu : danhSachNhanSu) {
                    if (nhanSu instanceof NhanVien && ((NhanVien) nhanSu).getTruongPhongQuanLy() == nhanSuXoa) {
                        ((NhanVien) nhanSu).setTruongPhongQuanLy(null);
                    }
                }
            }
            danhSachNhanSu.remove(nhanSuXoa);
            System.out.println("Xóa nhân sự thành công");
        } else {
            System.out.println("Không tìm thấy nhân sự có mã số " + maSo);
        }
    }
    public void xuatThongTinNhanSu(){
        System.out.printf("%5s %20s %15s %10s %10s %10s\n", "STT", "Họ tên", "Mã số", "Số ngày", "Lương ngày", "Tổng lương");
        int stt=1;
        for(NhanSu nhanSu:danhSachNhanSu){
            System.out.printf("%5d %20s %15s %10d %10.2f %10.2f\n",stt++,nhanSu.getHoTen(),nhanSu.getMaSo(),nhanSu.getSoNgayLamViec(),nhanSu.getLuong1Ngay(),nhanSu.tinhLuong());
        }
    }
    public void tinhVaXuatTongLuongCongTy(){
        double tongLuong=0;
        for(NhanSu nhanSu:danhSachNhanSu){
            tongLuong+=nhanSu.tinhLuong();
        }
        System.out.println("Tong luong toan cong ty: "+tongLuong);
    }
     public void timNhanVienLuongCaoNhat(){
        NhanVien nhanVienLuongCaoNhat=null;
        for(NhanSu nhanSu:danhSachNhanSu){
            if(nhanSu instanceof NhanVien){
                if(nhanVienLuongCaoNhat==null || nhanSu.tinhLuong()>nhanVienLuongCaoNhat.tinhLuong()){
                    nhanVienLuongCaoNhat=(NhanVien)nhanSu;
                }
            }
        }
        if(nhanVienLuongCaoNhat!=null){
            System.out.println("Nhân viên có lương cao nhất: "+nhanVienLuongCaoNhat.getHoTen()+"Lương: "+nhanVienLuongCaoNhat.tinhLuong());
        }
     }
     public void timTruongPhongCoNhieuNhanVienNhat(){
        TruongPhong truongPhongCoNhieuNhanVienNhat=null;
        for(NhanSu nhanSu:danhSachNhanSu){
            if(nhanSu instanceof TruongPhong){
                if(truongPhongCoNhieuNhanVienNhat==null || ((TruongPhong)nhanSu).getSoLuongNhanVienDuoiQuyen()>truongPhongCoNhieuNhanVienNhat.getSoLuongNhanVienDuoiQuyen()){
                    truongPhongCoNhieuNhanVienNhat=(TruongPhong)nhanSu;
                }
            }
        }
     }
    public void sapXepNhanVienTheoABC(){
        danhSachNhanSu.sort(Comparator.comparing(NhanSu::getHoTen));
        System.out.println("Sắp xếp nhân viên theo thứ tự ABC thành công");
    }
    public void sapXepNhanVienTheoLuongGiamDan(){
        danhSachNhanSu.sort((o1, o2) -> Double.compare(o2.tinhLuong(), o1.tinhLuong()));
        System.out.println("Sắp xếp nhân viên theo lương giảm dần thành công");
    }
    public void timGiamDocCoPhanNhieuNhat(){
        GiamDoc giamDocCoPhanNhieuNhat=null;
        for(NhanSu nhanSu:danhSachNhanSu){
            if(nhanSu instanceof GiamDoc ){
                if(giamDocCoPhanNhieuNhat==null||((GiamDoc)nhanSu).getCoPhan()>giamDocCoPhanNhieuNhat.getCoPhan()){
                    giamDocCoPhanNhieuNhat=(GiamDoc)nhanSu;
                }
            }
        }
        if(giamDocCoPhanNhieuNhat!=null){
            System.out.println("Giám đốc có số cổ phần nhiều nhất: "+giamDocCoPhanNhieuNhat.getHoTen()+", Số cổ phần: "+giamDocCoPhanNhieuNhat.getCoPhan());
        }
    }
    public void tinhVaXuatThuNhapGiamDoc(){
        double tongLuongCongTy=0;
        for(NhanSu nhanSu: danhSachNhanSu){
            tongLuongCongTy+=nhanSu.tinhLuong();
        }
        double loiNhanCongTy=doanhThuThang-tongLuongCongTy;
        for(NhanSu nhanSu:danhSachNhanSu){
            if(nhanSu instanceof GiamDoc giamDoc){
                double thuNhap=giamDoc.tinhLuong()+(giamDoc.getCoPhan()/100)*loiNhanCongTy;
                System.out.println("Thu nhaập của giám đốc: "+giamDoc.getHoTen()+": "+thuNhap);
            }
        }
    }
}
