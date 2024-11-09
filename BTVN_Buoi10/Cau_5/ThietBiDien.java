package Cau_5;

public class ThietBiDien {
    private int congSuat;
    private String chucNang;

    public ThietBiDien(int congSuat, String chucNang) {
        this.congSuat = congSuat;
        this.chucNang = chucNang;
    }
    public void hienThiThongTin() {
        System.out.println("Công suất: " + congSuat + "W");
        System.out.println("Chức năng: " + chucNang);
    }

    public int getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(int congSuat) {
        this.congSuat = congSuat;
    }

    public String getChucNang() {
        return chucNang;
    }

    public void setChucNang(String chucNang) {
        this.chucNang = chucNang;
    }
}
