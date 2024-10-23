import java.util.Scanner;
public class Ex2 {
    //Câu 1
    public static void printEvenNumbersWithFor(){
        System.out.println("Even numbers less than 100: ");
        for (int i = 0; i <100 ; i++) {
            if(i%2==0){
                System.out.print(i+ " ");
            }
        }
        System.out.println();
    }
    public static void printOddNumbersWithFor(){
        for (int i = 0; i < 100; i++) {
            if(i%2!=0){
                System.out.print(i+ " ");
            }
        }
        System.out.println();
    }
    public static void printEvenNumbersWithWhile(){
        int i=0;
        while(i<100){
            if(i%2==0){
                System.out.print(i+" ");
            }
            i++;
        }
        System.out.println();
    }
    public static void printOddNumbersWithWhile(){
        int i=0;
        while(i<100){
            if(i%2!=0){
                System.out.print(i+" ");
            }
            i++;
        }
        System.out.println();
    }
    //Câu 2
    public static void sumEvenNumbersWithFor(int n){
        int sum=0;
        for (int i = 0; i <n ; i++) {
            if(i%2==0){
                sum+=i;
            }
        }
        System.out.println("Tổng các số từ 1 đến "+n+" là: "+sum);
    }
    public static void sumEvenNumbersWithWhile(int n){
        int i=0, sum=0;
        while(i<n){
            if(i%2==0){
                sum+=i;
            }
            i++;
        }
        System.out.println("Tổng các số từ 1 đến "+n+" là: "+sum);
    }
    //Câu 3
    public static void countDivisibleBy3WithFor(){
        int count=0;
        for (int i = 0; i < 1000; i++) {
            if(i%3==0){
                count++;
            }
        }
        System.out.println("Có "+count+" các số chia hết cho 3 từ 0-1000");
    }
    public static void countDivisibleBy3WithWhile(){
        int count=0, i=0;
        while(i<1000){
            if(i%3==0){
                count++;
            }
            i++;
        }
        System.out.println("Có "+count+" các số chia hết cho 3 từ 0-1000");
    }
    public static void main(String[] args) {
        // Test các hàm
        System.out.println("Câu 1: ");
        System.out.println("Số chẵn nhỏ hơn 100 (for loop):");
        printEvenNumbersWithFor();
        System.out.println("Số lẻ nhỏ hơn 100 (for loop):");
        printOddNumbersWithFor();

        System.out.println("Số chẵn nhỏ hơn 100 (while loop):");
        printEvenNumbersWithWhile();

        System.out.println("Số lẻ nhỏ hơn 100 (while loop):");
        printOddNumbersWithWhile();
        System.out.println("Câu 2: ");
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhập số n: ");
        int n=sc.nextInt();
        System.out.println("Tính tổng các số chẵn từ 1 đến n (for loop):");
        sumEvenNumbersWithFor(n);

        System.out.println("Tính tổng các số chẵn từ 1 đến n (while loop):");
        sumEvenNumbersWithWhile(n);
        System.out.println("Câu 3: ");
        System.out.println("Đếm số chia hết cho 3 từ 0-1000 (for loop):");
        countDivisibleBy3WithFor();

        System.out.println("Đếm số chia hết cho 3 từ 0-1000 (while loop):");
        countDivisibleBy3WithWhile();
    }
}
