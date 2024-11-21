package Exercise_5;

import java.util.ArrayList;
import java.util.List;

public class Flight {
    private List<Seat> seats;
    public Flight(){
        seats=new ArrayList<>();
    }
    public void addSeat(Seat seat){
        seats.add(seat);
    }
    public boolean bookSeat(String seatNumber){
        for(Seat seat:seats){
            if(seat.getSeatNumber().equals(seatNumber) &&seat.getStatus().equals("trống")){
                seat.setStatus("đã đặt");
                System.out.println("Ghế "+seatNumber+" đã được đặt thành công");
                return true;
            }
        }
        System.out.println("Ghế "+seatNumber+"không thể đặt");
        return false;
    }
    public double calculateTotalRevenue(){
        double totalRevenue=0;
        for(Seat seat:seats){
            if(seat.getStatus().equals("đã đặt")){
                totalRevenue+=seat.calculateFinalPrice();
            }
        }
        return totalRevenue;
    }
}
