package Exercise_3;

public class Test_Ex3 {
    public static void main(String[] args) {
        Hotel hotel=new Hotel();
        HotelRoom room1=new HotelRoom(101,2,500.0);
        HotelRoom room2 = new HotelRoom(102, 4, 800.0);
        HotelRoom room3 = new HotelRoom(103, 3, 600.0);
        hotel.addRoom(room1);
        hotel.addRoom(room2);
        hotel.addRoom(room3);
        HotelRoom foundRoom=hotel.searchRoom(2);
        if(foundRoom!=null){
            foundRoom.bookRoom();
        }
        foundRoom=hotel.searchRoom(4);
        if(foundRoom!=null){
            foundRoom.bookRoom();
        }
        System.out.println("Tổng thu nhập của khách sạn: " + hotel.calculateRevenue());
        room1.checkOut();
        System.out.println("Tổng thu nhập của khách sạn sau khi trả phòng: " + hotel.calculateRevenue());
    }
}
