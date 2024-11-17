package Exercise_2;

public class Test_Ex2 {
    public static void main(String[] args) {
       double[]grades=new double[]{8.6,5.8,7.4,9.5,10,6.5,4.2};
        Student student=new Student("Nguyen Van A ",19,grades);
        student.get_info();
    }
}