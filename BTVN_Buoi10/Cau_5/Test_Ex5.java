package Cau_5;

public class Test_Ex5 {
    public static void main(String[] args) {
        // Tạo đối tượng DieuHoa
        DieuHoa dieuHoa = new DieuHoa(2000, "Làm lạnh", "R32");
        System.out.println("Thông tin điều hòa:");
        dieuHoa.hienThiThongTin();
        dieuHoa.batDieuHoa();

        // Tạo đối tượng MaySay
        MaySay maySay = new MaySay(1500, "Sấy khô", 7);
        System.out.println("\nThông tin máy sấy:");
        maySay.hienThiThongTin();
        maySay.batMaySay();
    }
}
