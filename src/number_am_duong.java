import java.util.Scanner;
public class number_am_duong {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Nhập 1 số từ bàn phím : ");
         int a = input.nextInt();

         if(a>=1){
             System.out.print(a+" Là số dương ");
         }
         else if(a<0){
             System.out.print(a+" Là số âm");
         }
         else{
             System.out.print("a là số 0");
         }
    }
}
