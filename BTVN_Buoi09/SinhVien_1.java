public class SinhVien_1 {
    private String ten;
    private String maSV;
    private double diemToan;
    private double diemLy;
    private double diemHoa;

    public SinhVien_1(String ten, String maSV, double diemToan, double diemLy, double diemHoa) {
        this.ten = ten;
        this.maSV = maSV;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public double getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(double diemToan) {
        this.diemToan = diemToan;
    }

    public double getDiemLy() {
        return diemLy;
    }

    public void setDiemLy(double diemLy) {
        this.diemLy = diemLy;
    }

    public double getDiemHoa() {
        return diemHoa;
    }

    public void setDiemHoa(double diemHoa) {
        this.diemHoa = diemHoa;
    }
    public double tinhDiemTrungBinh(){
        return (diemToan+diemLy+diemHoa)/3;
    }
    public String xepLoai(){
        double dtb=tinhDiemTrungBinh();
        return (dtb>=9)? "Xuất sắc":(dtb>=8)?"Giỏi":(dtb>=7)?"Khá":(dtb>=6)?"Trung bình":
                (dtb>=5)?"Yếu":"Kém";
    }
    @Override
    public String toString(){
        return "Tên: "+ten+", Mã SV: "+maSV+", ĐTB= "+String.format("%.3f",tinhDiemTrungBinh())+", Xếp loại: "+xepLoai();
    }
}
