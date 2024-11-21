package Exercise_1;

public class Tablet extends Product{
    private boolean stylusIncluded;
    private String screenResolution;
    public  Tablet(){}
    public Tablet(boolean stylusIncluded, String screenResolution) {
        this.stylusIncluded = stylusIncluded;
        this.screenResolution = screenResolution;
    }

    public Tablet(String id, String name, double price, int quantity, boolean stylusIncluded, String screenResolution) {
        super(id, name, price, quantity);
        this.stylusIncluded = stylusIncluded;
        this.screenResolution = screenResolution;
    }

    public boolean isStylusIncluded() {
        return stylusIncluded;
    }

    public void setStylusIncluded(boolean stylusIncluded) {
        this.stylusIncluded = stylusIncluded;
    }

    public String getScreenResolution() {
        return screenResolution;
    }

    public void setScreenResolution(String screenResolution) {
        this.screenResolution = screenResolution;
    }

    @Override
    public double calculate_discounted_price(double discount_rate){
        return getPrice()-(getPrice()*discount_rate/100)*0.75;
    }

    @Override
    public String toString() {
        return super.toString() + ", Exercise_1.Tablet [hasStylus=" + stylusIncluded+ ", Screen resolution="+screenResolution+ "]";
    }
}
