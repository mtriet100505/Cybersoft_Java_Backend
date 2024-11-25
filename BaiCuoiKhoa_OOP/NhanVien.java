public class NhanVien extends NhanSu {
    private TruongPhong truongPhongQuanLy;

    public NhanVien(String maSo, String hoTen, String soDienThoai, int soNgayLamViec) {
        super(maSo, hoTen, soDienThoai, soNgayLamViec, 100);
    }

    public TruongPhong getTruongPhongQuanLy() {
        return truongPhongQuanLy;
    }

    public void setTruongPhongQuanLy(TruongPhong truongPhongQuanLy) {
        this.truongPhongQuanLy = truongPhongQuanLy;
    }

    @Override
    public double tinhLuong() {
        return getLuong1Ngay()*getSoNgayLamViec();
    }
}
