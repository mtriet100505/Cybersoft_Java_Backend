package Exercise_5;

public class FirstClassSeat extends Seat {
    private static final double HIGHER_FEE = 100.0;

    public FirstClassSeat(String seatNumber, double price) {
        super(seatNumber, price);
    }

    @Override
    public double calculateFinalPrice() {
        return getPrice() + HIGHER_FEE;
    }
}
