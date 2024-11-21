package Exercise_3;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private List<HotelRoom>rooms;
    public Hotel(){
        rooms=new ArrayList<>();
    }
    public void addRoom(HotelRoom room){
        rooms.add(room);
    }
    public HotelRoom searchRoom(int capacity){
        for(HotelRoom room:rooms){
            if(room.getCapacity()>=capacity && room.getStatus().equals("trống")){
                System.out.println("Tìm thấy phòng: "+room.getRoomNumber());
                return room;
            }
        }
        System.out.println("Không tìm thấy phòng phù hợp ");
        return null;
    }
    public double calculateRevenue(){
        double revenue=0;
        for(HotelRoom room:rooms){
            if(room.getStatus().equals("đã đặt")){
                revenue+=room.getPricePerNight();
            }
        }
        return revenue;
    }
}
