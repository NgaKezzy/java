import java.util.Scanner;
public class nam_nhuan {
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        System.out.print("Nhập số năm bạn muốn kiểm tra : ");
        int nam = ip.nextInt();
        int tinh = nam % 4 ;
        if(tinh == 0){
            System.out.print("Năm "+nam+" là năm nhuận");
        }
        else {
            System.out.print("Năm "+nam+" không  phải năm nhuận");
        }
    }
}
