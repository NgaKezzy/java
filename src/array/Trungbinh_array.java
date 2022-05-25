package array;
import java.util.*;
public class Trungbinh_array {
    public static  Scanner ip = new Scanner(System.in);
    public static void main(String[] args){

        int x[] =new int [4];
        nhapmang(x);
        hienmang(x);
        TBmang(x);

    }

    public static void nhapmang(int x[]){
        for (int i=0; i< x.length;i++
             ) {
            System.out.print("\n Nhập phần tử thứ "+i+" = ");
              x[i] = ip.nextInt();
        }

    }
    public static void hienmang(int x[]){
        System.out.print("\n -------Mảng gồm có các phần tử--------");
        for (int  i =0; i<x.length;i++){
            System.out.print("\n Phần tử thứ "+i+" ="+x[i]);
        }
    }
    public static void TBmang(int x[]){
        int sum = 0;
        for (int i=0;i<x.length;i++){
            sum+=x[i];
        }
        double TB = (double)sum/ x.length;
        System.out.print("\n\nGiá trị tổng của mảng ="+sum);
        System.out.print("\n\nGiá trị trung bình của mảng ="+TB);
    }
}
