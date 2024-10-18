import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhập số nguyên thứ nhất: ");
        int soA=sc.nextInt();
        System.out.print("Nhập số nguyên thứ hai: ");
        int soB=sc.nextInt();
        System.out.print("Nhập số nguyên thứ ba: ");
        int soC=sc.nextInt();
        System.out.print("Nhập lựa chọn (1: Tăng dần, 2: giảm dần) :");
        int luaChon=sc.nextInt();
        int temp;
        switch(luaChon){
            case 1:
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
                break;
            case 2:
                if(soA<soB){
                temp=soA;
                soA=soB;
                soB=temp;
            }
                if(soA<soC){
                    temp=soA;
                    soA=soC;
                    soC=temp;
                }
                if(soB<soC){
                    temp=soB;
                    soB=soC;
                    soC=temp;
                }
                break;
            default:
                System.out.println("Gia tri khong hop le "); break;
        }
        System.out.println("Thứ tự các số: "+soA+" "+soB+" "+soC);
    }
}
