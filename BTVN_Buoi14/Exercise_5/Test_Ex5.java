package Exercise_5;

public class Test_Ex5 {
    public static void main(String[] args) {
        Flight flight=new Flight();
        flight.addSeat(new EconomySeat("E1",100));
        flight.addSeat(new BusinessSeat("B1", 200.0));
        flight.addSeat(new FirstClassSeat("F1", 300.0));
        flight.addSeat(new EconomySeat("E2", 100.0));
        flight.addSeat(new BusinessSeat("B2", 200.0));
        //Thử đặt ghế
        flight.bookSeat("E1");
        flight.bookSeat("B1");
        flight.bookSeat("F1");
        //Tính doanh thu cuối cùng
        double totalRevenue=flight.calculateTotalRevenue();
        System.out.println("Tổng doanh thu chuyến bay: "+totalRevenue);
    }
}
