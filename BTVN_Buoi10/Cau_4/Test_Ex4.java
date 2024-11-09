package Cau_4;
public class Test_Ex4 {
    public static void main(String[] args) {
        // Tạo đối tượng XeHoi
        XeHoi xeHoi = new XeHoi("Toyota", "Đỏ", 2020);
        System.out.println("Thông tin xe hơi:");
        xeHoi.hienThiThongTin();

        // Tạo đối tượng XeMay
        XeMay xeMay = new XeMay("Honda", "Xanh", 2018);
        System.out.println("\nThông tin xe máy:");
        xeMay.hienThiThongTin();
    }
}
