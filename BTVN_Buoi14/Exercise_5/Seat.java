package Exercise_5;

public class Seat {
    private String seatNumber;
    private double price;
    private String status;

    public Seat(String seatNumber, double price) {
        this.seatNumber = seatNumber;
        this.price = price;
        this.status="trống";
    }
    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double calculateFinalPrice() {
        return price;
    }
}
