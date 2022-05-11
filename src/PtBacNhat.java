import java.util.Scanner;

public class PtBacNhat {
    public static void main(String[] args){
        // pt bậc nhất một ẩn ax + b = 0 với điều kiện a khác 0

        System.out.print("\t------ Phương trình bậc nhất------- ");

        Scanner input = new Scanner(System.in);

        System.out.print("\nNhập a = ");
        int a = input.nextInt();

        System.out.print("Nhập b = ");
        int b = input.nextInt();

        if(a==0){
            System.out.print("Đây không phải phương trình bậc nhất một ẩn");

        }
        else{
            System.out.print("s = " + ((float)-b/(float)a));
        }

    }
}
