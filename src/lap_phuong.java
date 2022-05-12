import java.util.Scanner;
public class lap_phuong {
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        System.out.print("Nhập 1 số : ");
        double number = ip.nextDouble();
        double lapphuong = Math.pow(number,3);
        System.out.print("Số "+number+" lập phương là : "+lapphuong);
    }
}
