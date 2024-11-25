abstract class NhanSu {
    private  String maSo;
    private String hoTen;
    private String soDienThoai;
    private int soNgayLamViec;
   private double luong1Ngay;

    public NhanSu(String maSo, String hoTen, String soDienThoai, int soNgayLamViec, double luong1Ngay) {
        this.maSo = maSo;
        this.hoTen = hoTen;
        this.soDienThoai = soDienThoai;
        this.soNgayLamViec = soNgayLamViec;
        this.luong1Ngay = luong1Ngay;
    }

    public String getMaSo() {
        return maSo;
    }

    public void setMaSo(String maSo) {
        this.maSo = maSo;
    }

    public int getSoNgayLamViec() {
        return soNgayLamViec;
    }

    public void setSoNgayLamViec(int soNgayLamViec) {
        this.soNgayLamViec = soNgayLamViec;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public double getLuong1Ngay() {
        return luong1Ngay;
    }

    public void setLuong1Ngay(double luong1Ngay) {
        this.luong1Ngay = luong1Ngay;
    }

    public abstract double tinhLuong();

    @Override
    public String toString() {
        return "NhanSu{" +
                "maSo='" + maSo + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", soDienThoai='" + soDienThoai + '\'' +
                ", soNgayLamViec=" + soNgayLamViec + "tinhLuong =" +tinhLuong()+ '}';
    }
}
