import java.util.Scanner;

public class PtBac2 {
    public static void main(String [] args){
        // giải pt bậc 2:  ax + bx + c = 0 với điều kiện a khác 0

        System.out.print("\t------ Phương trình bậc 2------- ");

        Scanner input = new Scanner(System.in);

        System.out.print("\nNhập a = ");
        double a =  input.nextDouble();

        System.out.print("Nhập b = ");
        double b =  input.nextDouble();

        System.out.print("Nhập c = ");
        double c =  input.nextDouble();

        double delta = 0;

        if(a == 0){
            System.out.print("Đây không phải pt bậc 2");
        }
        else{
            delta = (Math.pow(b, 2) -(4* a * c));
            System.out.print("delta = "+delta);
            if(delta < 0){
                System.out.print("\nPhương trình có vô số nghiệm");
            }
            else if(delta == 0){
                System.out.print("\nPhương trình có nghiệm kép x1 = x2 = "+ (-b/2*a));
            }
            else{
                System.out.println("\nx1= "+ ((-b + Math.sqrt(delta)) / (2*a)));
                System.out.println("\nx2= "+ ((-b - Math.sqrt(delta)) / (2*a)));
            }
        }

    }
}
