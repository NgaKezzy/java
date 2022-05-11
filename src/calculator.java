import java.util.Objects;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        System.out.println("\t ----- Máy tính bỏ túi -----");

        Scanner input = new Scanner(System.in);

        System.out.print("Nhập a = ");
        double a = input.nextDouble();

        System.out.print("\nNhập b = ");
        double b = input.nextDouble();

        System.out.println("\nPhép toán bạn muốn thực hiện (+ , - , * , / )  là : ");
        String x = input.next();


        if (Objects.equals(x, "+")) {
            System.out.print("\n a + b = " + (a + b));
        } else if (Objects.equals(x, "-")) {
            System.out.print("\na - b = " + (a - b));
        } else if (Objects.equals(x, "*")) {
            System.out.print("a * b = " + (a * b));
        } else {
            if (b == 0) {
                System.out.print("Không thể chia được");
            }
            else{

                System.out.print(String.format("%.2f", (a/b)));
            }
        }
    }
}