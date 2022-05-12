import java.util.Scanner;
public class so_sanh {
    public static double sosanh(double x){

        double tach =  x % x; // lấy ả phần dư
        System.out.print(tach+"\n");
        return tach;
    }
    public static void main(String[]args) {
        // so sánh 3 số sau dấu phẩy
        Scanner ip = new Scanner(System.in);
        System.out.print("Nhâp  số  : ");
        double a = ip.nextDouble();
        System.out.print("Nhâp  số 2 : ");
        double b = ip.nextDouble();

        double j, k;
        j=sosanh(a);

        k=sosanh(b);
        System.out.print(j+"\n");
        System.out.print(k);
        if(j==k)
            System.out.print("Chúng giống nhau");
        else
            System.out.print("Chúng khác nhau");
    }
}
