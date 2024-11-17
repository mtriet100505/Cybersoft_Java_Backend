package Exercise_2;
public class Student {
    private String name;
    private int age;
    private double []grades;

    public double calculate_average(){
        double tong=0;
        for(double diem: grades){
            tong+=diem;
        }
        return tong/grades.length;
    }
    public Student(){}
    public Student(String name, int age, double[] grades) {
        this.name = name;
        this.age = age;
        this.grades = grades;
    }

    public void get_info(){
        System.out.println("Name: "+this.name);
        System.out.println("Age: "+ this.age);
        System.out.printf("Average grade : %.3f \n",calculate_average());
    }
}
