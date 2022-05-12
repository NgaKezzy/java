import java.util.Scanner;
public class temperature {
    public static void main(String[] args){
        // chuyển từ độ f sang độ c
        double f;
        Scanner input = new Scanner(System.in);

        System.out.print("Nhập độ F = ");
        f = input.nextDouble();
        System.out.print("Độ C là :"+transfer(f));
    }
    public static double transfer(double f){

        double c = (f - 32) / 1.8000;

        return c;
    }
}
