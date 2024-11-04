import java.util.ArrayList;
import java.util.List;
public class QuanLySinhVien_2 {
    private List<SinhVien_2>danhSachSV;
    public QuanLySinhVien_2(){
        danhSachSV=new ArrayList<>();
    }
    public void themSinhVien(SinhVien_2 sv){
        danhSachSV.add(sv);
    }
    public void inDanhSachSV(){
        if(danhSachSV.isEmpty()){
            System.out.println("Không có SV nào trong danh sách, ");
            return;
        }
        for(SinhVien_2 sv:danhSachSV){
            System.out.println(sv);
        }
    }
    public void inSVDtbCaoNhat(){
        if(danhSachSV.isEmpty()){
            System.out.println("Không có SV nào trong danh sách, ");
            return;
        }
        SinhVien_2 svCaoNhat =danhSachSV.getFirst();
        for(SinhVien_2 sv:danhSachSV){
            if (sv.getDiemTrungBinh()> svCaoNhat.getDiemTrungBinh()){
                svCaoNhat=sv;
            }
        }
        System.out.println("SV có đtb cao nhất: \n"+svCaoNhat);
    }
    public void inSVYeu(){
        boolean coSinhVienYeu=false;
        System.out.println("Danh sách SV yếu: ");
        for(SinhVien_2 sv:danhSachSV){
            if(sv.xepLoai().equals("Yếu")||sv.xepLoai().equals("Kếm")){
                System.out.println(sv);
                coSinhVienYeu=true;
            }
        }
        if(!coSinhVienYeu){
            System.out.println("Khong co SV yeu nao trong danh sach. ");
        }
    }
    public void timSVTheoTen(String ten){
        boolean timThay=false;
        System.out.println("Kết quả tim sv theo tên: ");
        for(SinhVien_2 sv:danhSachSV){
            if(sv.getTen().equalsIgnoreCase(ten)){
                System.out.println(sv);
                timThay=true;
            }
        }
        if(!timThay){
            System.out.println("Không tìm thấy sv với tên: "+ten);
        }
    }
    public void timSinhVienTheoMa(String maSV){
        boolean timThay=false;
        System.out.println("Kết quả tìm sv theo mã: ");
        for(SinhVien_2 sv:danhSachSV){
            if(sv.getMaSV().equalsIgnoreCase(maSV)){
                System.out.println(sv);
                timThay=true;
            }
        }
        if(!timThay){
            System.out.println("Khong tim thay sv với mã: "+maSV);
        }
    }
    public void xoaSinhVienTheoMa(String maSV){
        SinhVien_2 sinhVien2CanXoa =null;
        for(SinhVien_2 sv: danhSachSV){
            if(sv.getMaSV().equalsIgnoreCase(maSV)){
                sinhVien2CanXoa =sv;
                break;
            }
        }
        if(sinhVien2CanXoa !=null){
            danhSachSV.remove(sinhVien2CanXoa);
            System.out.println("Đã xóa sv có mã: "+maSV);
        }else{
            System.out.println("Không tìm thấy sv với mã: "+maSV);
        }
    }
}
