package Exercise_1;

public class Laptop extends Product{
    private String  processor;
    private int ram;
    public Laptop() {}
    public Laptop(String processor, int ram) {
        this.processor = processor;
        this.ram = ram;
    }

    public Laptop(String id, String name, double price, int quantity, String processor, int ram) {
        super(id, name, price, quantity);
        this.processor = processor;
        this.ram = ram;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
    @Override
    public double calculate_discounted_price(double discount_rate){
        return getPrice()-(getPrice()*discount_rate/100)*0.7;
    }
    @Override
    public String toString() {
        return super.toString() + ", Exercise_1.Laptop [processor=" + processor + ", ram=" + ram + "]";
    }
}
