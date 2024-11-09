package Cau_3;

public class TroChoi {
    private String tenTroChoi;
    private int soLuotChoi;
    public TroChoi(String tenTroChoi) {
        this.tenTroChoi = tenTroChoi;
        this.soLuotChoi = 0;
    }
    public void batDau(){
        System.out.println("Bat dau tro choi: "+tenTroChoi);
        soLuotChoi++;
    }
    public void ketThuc() {
        System.out.println("Kết thúc trò chơi: " + tenTroChoi);
    }
    public void hienThiThongTin(){
        System.out.println("Tên trò chơi: " + tenTroChoi);
        System.out.println("Số lượt chơi: " + soLuotChoi);
    }

}
