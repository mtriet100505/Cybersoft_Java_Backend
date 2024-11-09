package Cau_5;

public class DieuHoa extends ThietBiDien{
    private String loaiGas;

    public DieuHoa(int congSuat, String chucNang, String loaiGas) {
        super(congSuat, chucNang);
        this.loaiGas = loaiGas;
    }

    public void batDieuHoa() {
        System.out.println("Điều hòa đang hoạt động với công suất " + getCongSuat() + "W và sử dụng loại gas " + loaiGas);
    }

    public String getLoaiGas() {
        return loaiGas;
    }

    public void setLoaiGas(String loaiGas) {
        this.loaiGas = loaiGas;
    }
}
