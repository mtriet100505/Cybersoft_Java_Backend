package Exercise_5;

public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng Employee
        Employee emp = new Employee("Nguyễn Văn A", 30, 5000000);
        System.out.println("Thông tin nhân viên:");
        emp.displayInfo();

        // Tạo đối tượng Manager
        Manager mgr = new Manager("Trần Thị B", 40, 10000000, "Kinh doanh");
        System.out.println("\nThông tin quản lý:");
        mgr.displayInfo();
    }
}
