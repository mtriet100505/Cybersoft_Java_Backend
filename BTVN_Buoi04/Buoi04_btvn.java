import java.util.Scanner;
public class Buoi04_btvn {
    public static double cau1(double a, double b){
        return Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
    }
    public static void cau2(int a, int x, int n){
        System.out.println(a+"*"+x+"^"+n+"="+a*(int)Math.pow(x,n));
    }
    public static int cau3(int n){
        int sum=0;
        if(n<10) return n;
       int m=n%10;
       n=n/10;
       sum=n+m;
        return sum;
    }
    public static double cau4(double a, double b, double c, double d, double e){
        return ((a+b+c+d+e)/5);
    }
    public static double cau5(double C){
        return (C*1.8)+32;
    }
    public static double cau6(double USD){
        return USD * 23500;
    }
    public static void main(String[] args) {
        //cau 1
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap canh goc vuong thu 1: ");
        double a1= sc.nextDouble();
        System.out.print("Nhap canh goc vuong thu 2: ");
        double b1=sc.nextDouble();
        System.out.println("Do dai canh huyen:"+cau1(a1,b1));
        //cau 2
        sc.nextLine();
        System.out.print("Nhap a: ");
        int a2=sc.nextInt();
        System.out.print("Nhap n: ");
        int n2=sc.nextInt();
        int x=8;
        cau2(a2,x,n2);
        //cau 3:
        int n3;
        do {
            System.out.print("Nhap so nguyen co 2 chu so n: ");
             n3 = sc.nextInt();
        }while(n3<10||n3>99);
        System.out.println("Tong cac ky so la: "+cau3(n3));
        //cau 4
        sc.nextLine();
        System.out.print("Nhap so thu nhat: ");
        double a4=sc.nextDouble();
        System.out.print("Nhap so thu hai: ");
        double b4=sc.nextDouble();
        System.out.print("Nhap so thu ba: ");
        double c4=sc.nextDouble();
        System.out.print("Nhap so thu tu: ");
        double d4=sc.nextDouble();
        System.out.print("Nhap so thu nam: ");
        double e4=sc.nextDouble();
        System.out.println("Trung binh cong 5 so la: "+cau4(a4,b4,c4,d4,e4));
        //Cau 5
        sc.nextLine();
        System.out.println("Nhap vao do C: ");
        double C=sc.nextDouble();
        System.out.println(C+" do C sang do F la: "+cau5(C));
        //Cau 6:
        sc.nextLine();
        System.out.println("Nhap vao USD: ");
        double USD=sc.nextDouble();
        System.out.println(USD+" USD sang VND: "+cau6(USD));
    }
}