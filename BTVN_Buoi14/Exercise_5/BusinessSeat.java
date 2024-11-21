package Exercise_5;

public class BusinessSeat extends Seat {

    private static final double SERVICE_FEE = 50.0;
    public BusinessSeat(String seatNumber, double price) {
        super(seatNumber, price);
    }
    @Override
    public double calculateFinalPrice() {
        return getPrice() + SERVICE_FEE;
    }
}
