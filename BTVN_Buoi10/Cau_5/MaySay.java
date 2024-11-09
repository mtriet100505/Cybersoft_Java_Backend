package Cau_5;

public class MaySay extends ThietBiDien{
    private int dungTich;

    public MaySay(int congSuat, String chucNang, int dungTich) {
        super(congSuat, chucNang);
        this.dungTich = dungTich;
    }
    public void batMaySay() {
        System.out.println("Máy sấy đang hoạt động với công suất " + getCongSuat() + "W và dung tích " + dungTich + " lít");
    }

    public int getDungTich() {
        return dungTich;
    }

    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
    }
}
