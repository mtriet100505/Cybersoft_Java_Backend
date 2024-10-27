import java.util.Scanner;
public class Big_Ex2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[]array=inputArray(sc);
        System.out.println("Các phần tử của mảng:  ");
        printArray(array);
        findMax(array);
        findFirstNegative(array);
        findMaxNegative(array);
        calculateSumOfEvens(array);
        countNegativeNumbers(array);
        sumNegativeNumbers(array);
        System.out.print("Nhập x để tìm kiếm giá trị trong mảng: ");
        int x=sc.nextInt();
        findElement(array,x);
    }
    public static int[]inputArray(Scanner sc){
        System.out.print("Nhập số phần tử của mảng: ");
        int n=sc.nextInt();
        if(n<=0){
            throw new IllegalArgumentException("Số phần tử của mảng phải lớn hơn 0");
        }
        int[]array=new int[n];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Phần tử thứ "+(i+1)+": ");
            array[i]=sc.nextInt();
        }
        return array;
    }
    public static void printArray(int[]array){
            for (int e: array){
                System.out.print(e+" ");
            }
            System.out.println();
    }
    public static void findMax(int[]array){
       int max=array[0];
        int index=0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]>max){
                max=array[i];
                index=i;
            }
        }
        System.out.println("Tìm thấy giá trị lớn nhất "+max+" tại vị trí "+index);
    }
    public static void findFirstNegative(int[]array){
        for (int i = 0; i < array.length; i++) {
            if(array[i]<0){
                System.out.println("Tìm thấy giá trị "+array[i]+" tại vị trí:  "+i);
                break;
            }
        }
        System.out.println("Khong tìm thấy giá trị âm trong mảng. ");
    }
    public static void findMaxNegative(int[]array){
        int maxNegative=0;
        int index=-1;
        boolean foundNegative=false;
        for (int i = 0; i < array.length ; i++) {
            if(!foundNegative||array[i]>maxNegative){
                maxNegative=array[i];
                index=i;
                foundNegative=true;
            }
        }
        if(foundNegative){
            System.out.println("Gia trị  âm lớn nhất của mảng là "+maxNegative+" tại vị trí: "+index);
        }else{
            System.out.println("Không tìm thấy giá tr âm nào. ");
        }
    }
    public static void countNegativeNumbers(int []array){
        int count=0;
        for(int j: array){
            if(j<0){
                count++;
            }
        }
        System.out.println("Tổng cac so âm trong mảng: "+count);
    }
   public static void calculateSumOfEvens(int[]array){
        int sum=0;
        for(int e:array){
            if(e%2==0){
                sum+=e;
            }
        }
        System.out.println("Tổng các giá trị chẵn trong mảng: "+sum);
    }
    public static void sumNegativeNumbers(int[]array){
        int sum=0;
        for(int k:array){
            if(k<0){
                sum+=k;
            }
        }
        System.out.println("Tong các giá trị âm trong mảng: "+sum);
    }
    public static void findElement(int[]array, int x){
        for (int i = 0; i < array.length; i++) {
            if(array[i]==x){
                System.out.println("Tìm thấy phần tử "+x+ " tại vị trí: "+i);

                return;
            }
        }
        System.out.println("Phần tử "+x+" không có trong mảng");
    }
}
