public class GiamDoc extends NhanSu {
    private double coPhan;
    public GiamDoc(String maSo, String hoTen, String soDienThoai, int soNgayLamViec, double coPhan) {
        super(maSo, hoTen, soDienThoai, soNgayLamViec, 300);
        if(coPhan<0||coPhan>100){
            System.out.println("Cổ phần phải nằm trong khoảng từ 0 đến 100%");
            return;
        }
        this.coPhan = coPhan;
    }

    public double getCoPhan() {
        return coPhan;
    }
    public void setCoPhan(double coPhan) {
        if(coPhan<0||coPhan>100){
            System.out.println("Cổ phần phải nằm trong khoảng từ 0 đến 100%");
            return;
        }
        this.coPhan = coPhan;
    }
    @Override
    public double tinhLuong() {
        return getLuong1Ngay()*getSoNgayLamViec();
    }
}
