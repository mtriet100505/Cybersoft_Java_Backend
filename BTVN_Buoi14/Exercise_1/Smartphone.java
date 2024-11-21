package Exercise_1;

public class Smartphone extends Product{
    private String cameraQuality;
    public Smartphone() {
    }

    public Smartphone(String cameraQuality) {
        this.cameraQuality = cameraQuality;
    }

    public String getCameraQuality() {
        return cameraQuality;
    }

    public void setCameraQuality(String cameraQuality) {
        this.cameraQuality = cameraQuality;
    }

    public Smartphone(String id, String name, double price, int quantity, String cameraQuality) {
        super(id, name, price, quantity);
        this.cameraQuality = cameraQuality;
    }
    @Override
    public double calculate_discounted_price(double discount_rate){
        return getPrice()-(getPrice()*discount_rate/100)*0.8;
    }

    @Override
    public String toString() {
        return super.toString() + ", Exercise_1.Smartphone[ Camera Quality=" + cameraQuality+" ]";
    }
}
