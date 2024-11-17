package Exercise_5;

public class Employee {
    protected  String name;
    protected  int age;
    protected double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public void displayInfo() {
        System.out.println("Tên: " + this.name);
        System.out.println("Tuổi: " + this.age);
        System.out.println("Lương: " + this.salary);
    }
}
