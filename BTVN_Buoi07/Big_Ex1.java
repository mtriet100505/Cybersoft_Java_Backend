import java.util.Scanner;

public class Big_Ex1 {
    public static void bai1(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhập số nguyên: ");
        int n=sc.nextInt();
        System.out.println((n>=0)? "Đây là số nguyên dương": "Đây là số nguyên âm");
    }
    public static void bai1_1(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhập số nguyên: ");
        int n=sc.nextInt();
        System.out.println((n%2==0)? "Số chẵn":"Số lẻ");
    }
    public static boolean isPrime(int n){
        if(n<2) return false;
        for (int i = 2; i <=Math.sqrt(n) ; i++) {
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void bai1_2(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhập số nguyen: ");
        int n=sc.nextInt();
        System.out.println(isPrime(n)?"Số nguyên tố ":"Không phải số nguyên tố ");
    }
    public static void bai2(){
        Scanner sc=new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhap số  nguyen từ 1 đến 10: ");
            n = sc.nextInt();
        }while(n<1||n>10);
         switch(n){
            case 1 : System.out.println("Một"); break;
            case 2 : System.out.println("Hai"); break;
            case 3 :  System.out.println("Ba"); break;
            case 4 : System.out.println("Bốn"); break;
            case 5 : System.out.println("Năm"); break;
            case 6 : System.out.println("Sáu"); break;
            case 7 :  System.out.println("Bảy"); break;
            case 8 :  System.out.println("Tám"); break;
            case 9 :  System.out.println("Chín"); break;
            case 10 :  System.out.println("Mười"); break;
            default : System.out.println("Số không hợp lệ"); break;
        }
    }
    public static void bai3(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập số nguyen dương n: ");
        int n=sc.nextInt();
        if(n<0){
            throw  new IllegalArgumentException("n phải là số nguyên dương");
        }
        int sum=0;
        for (int i = 0; i <=n; i++) {
            if(i%2==0) {
                sum += i;
            }
        }
        System.out.println("Tong cac số chẵn từ 0 đến "+n+" là: "+sum);
    }
    public static void bai4(){
         Scanner sc=new Scanner(System.in);
        System.out.print("Nhap n: ");
         int n=sc.nextInt();
        if(n<0){
            throw  new IllegalArgumentException("Số phần tử phải lớn hơn 0");
        }
        int[]arr=new int[n];
        int sum=0;
        for (int i = 0; i < arr.length ; i++) {
            System.out.print("Nhập phần tử thứ "+(i+1)+": ");
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        for(int e: arr){
            System.out.print(e+" ");
        }
        System.out.println();
        System.out.println("Giá trị trung bình của mảng:  "+ (double) (sum/n));
    }
    public static void bai5(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n=sc.nextInt();
        if(n<0){
            throw  new IllegalArgumentException("Số phần tử phải lớn hơn 0 ");
        }
        int[]arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhập phần tử thứ "+(i+1)+": ");
            arr[i]=sc.nextInt();
        }
        for(int e: arr){
            System.out.print(e+" ");
        }
        int max=arr[0];
        int min=arr[0];
        for(int j :arr){
            if(j < min){
                min=j;
            }
            if(j > max){
                max=j;
            }
        }
        System.out.println("Số lớn nhất: " + max);
        System.out.println("Số nhỏ nhất: " + min);
    }
    public static void bai6(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap n: ");
        double n=sc.nextDouble();
        if(n<0){
            throw  new IllegalArgumentException("n phải là số nguyên dương");
        }
        System.out.println("Diện tích hình vuông là: "+ Math.pow(n,2));
        System.out.println("Chu vi hình vuong là: "+ (n*4));
    }
    public static void bai7(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n=sc.nextInt();
        if(n<0){
            throw  new IllegalArgumentException("Số phần tử phải lớn hơn 0 ");
        }
        int[]arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhập phần tử thứ "+(i+1)+": ");
            arr[i]=sc.nextInt();
        }
        for(int e: arr){
            System.out.print(e+" ");
        }
        System.out.println();
    }
    public static void bai8(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n=sc.nextInt();
        if(n<0){
            throw  new IllegalArgumentException("Số phần tử phải lớn hơn 0 ");
        }
        int[]arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhập phần tử thứ "+(i+1)+": ");
            arr[i]=sc.nextInt();
        }
        for(int e: arr){
            if(e%2==0){
                System.out.print(e+" ");
            }
        }
    }
    public static void main(String[] args) {
        bai1();
        bai1_1();
        bai1_2();
        bai2();
        bai3();
        bai4();
        bai5();
        bai6();
        bai7();
        bai8();
    }
}
