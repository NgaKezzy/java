import java.util.Scanner;
public class rank {
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);

        int a;
        System.out.print("Nhập 1 số (1->7) : ");
        do {
            a = ip.nextInt();
            if(a<1 || a>7)
                System.out.print("Nhập lại! Chú ý điều kiện : ");
        }while (a<1 || a>7);
        switch (a){
            case 1: System.out.print("Thứ hai"); break;
            case 2: System.out.print("Thứ ba");  break;
            case 3: System.out.print("Thứ tư");  break;
            case 4: System.out.print("Thứ năm");  break;
            case 5: System.out.print("Thứ sáu");  break;
            case 6: System.out.print("Thứ bảy");  break;
            case 7: System.out.print("Chủ nhật");  break;

        }
    }
}
