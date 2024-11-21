package Exercise_3;

public class HotelRoom {
    private int roomNumber;
    private int capacity;
    private double pricePerNight;
    private String status;

    public HotelRoom(int roomNumber, int capacity, double pricePerNight) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.pricePerNight = pricePerNight;
        this.status = "trống";
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public void bookRoom(){
        if(status.equals("trống")){
            status="đã đặt";
            System.out.println("Phòng " + roomNumber + " đã được đặt.");
        }else{
            System.out.println("Phòng " + roomNumber + " đã được đặt trước đó.");
        }
    }
    public void checkOut(){
        if(status.equals("đã đặt")){
            status="trống";
            System.out.println("Phòng " + roomNumber + " đã trả.");
        }else{
            System.out.println("Phòng " + roomNumber + " chưa được đặt, không cần trả.");
        }
    }
}
