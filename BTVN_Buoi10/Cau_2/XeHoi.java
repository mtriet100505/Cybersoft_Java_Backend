package Cau_2;

public class XeHoi {
    private String hangSanXuat;
    private String mauSac;
    private int namSanXuat;
    public XeHoi(String hangSanXuat, String mauSac, int namSanXuat) {
        this.hangSanXuat = hangSanXuat;
        this.mauSac = mauSac;
        this.namSanXuat = namSanXuat;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(String hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    @Override
    public String toString() {
        return "XeHoi{" +
                "hangSanXuat='" + hangSanXuat + '\'' +
                ", mauSac='" + mauSac + '\'' +
                ", namSanXuat=" + namSanXuat +
                '}';
    }
}
