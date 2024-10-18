import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập số nguyên thứ nhất: ");
        int soA=sc.nextInt();
        System.out.println("Nhập số nguyên thứ hai: ");
        int soB=sc.nextInt();
        System.out.println("Nhập số nguyên thứ ba: ");
        int soC=sc.nextInt();
        int temp;
       if(soA>soB){
           temp=soA;
           soA=soB;
           soB=temp;
       }
       if(soA>soC){
           temp=soA;
           soA=soC;
           soC=temp;
       }
       if(soB>soC){
           temp=soB;
           soB=soC;
           soC=temp;
       }
        System.out.println("Vay thu tu tang dan la: "+soA+" "+soB+" "+soC);
    }
}
