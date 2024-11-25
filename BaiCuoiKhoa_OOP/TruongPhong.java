public class TruongPhong extends NhanSu{
    private int soLuongNhanVienDuoiQuyen;

    public TruongPhong(String maSo, String hoTen, String soDienThoai, int soNgayLamViec) {
        super(maSo, hoTen, soDienThoai, soNgayLamViec, 200);
        this.soLuongNhanVienDuoiQuyen=0;
    }

    public int getSoLuongNhanVienDuoiQuyen() {
        return soLuongNhanVienDuoiQuyen;
    }

    public void setSoLuongNhanVienDuoiQuyen(int soLuongNhanVienDuoiQuyen) {
        this.soLuongNhanVienDuoiQuyen = soLuongNhanVienDuoiQuyen;
    }
    public void tangNhanVienDuoiQuyen(){
        soLuongNhanVienDuoiQuyen++;
    }
    public void themNhanVien(){
        soLuongNhanVienDuoiQuyen++;
    }
    @Override
    public double tinhLuong() {
        return getLuong1Ngay()*getSoNgayLamViec()+100*soLuongNhanVienDuoiQuyen;
    }
}
