package Cau_1;
public class HocSinh {
    private String ten;
    private int tuoi;
    private double[]diemSo;
    public HocSinh(String ten, int tuoi, double[] diemSo) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diemSo = diemSo;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public double[] getDiemSo() {
        return diemSo;
    }

    public void setDiemSo(double[] diemSo) {
        this.diemSo = diemSo;
    }
    public double tinhDiemTrungBinh() {
        double tong = 0;
        for (double diem : diemSo) {
            tong += diem;
        }
        return tong / diemSo.length;
    }
    public void inThongTin(){
        System.out.println("Tên: "+ten);
        System.out.println("Tuổi: "+tuoi);
        System.out.println("Điểm số: ");
        for(double diem:diemSo){
            System.out.print(diem+" ");
        }
        System.out.println();
        System.out.println("Điểm tb: "+tinhDiemTrungBinh());
    }
}
