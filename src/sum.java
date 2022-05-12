import java.util.Scanner;
public class sum {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        int x;
        System.out.print("Nhập 1 số trong khoảng từ 0 đến 1000 :");
        do {
             x = input.nextInt();
             if(x<1 || x >1000){
                System.out.print("Nhập lại x chú ý điều kiện :");
            }
        }while (x<1 || x >1000);

        int tach1 = x % 10; // tách lấy số đầu tiên
        int bo1 = x / 10;   // bỏ số đầu tiên
        int tach2 = bo1 % 10;
        int bo2 = bo1 / 10 ;

        int sum = tach1 +tach2+ bo2;
        System.out.print("Tổng của các chữ số đã nhập là : "+sum);

    }
}
