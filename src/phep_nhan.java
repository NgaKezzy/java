import java.util.Scanner;
public class phep_nhan {
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);

        int number;

        System.out.print("Nhập 1 số từ 1 đến 9 :");
        do {
             number = ip.nextInt();
             if(number<1 || number>10)
                 System.out.print("Nhâp lại! chú ý điều kiện : ");
        }while(number<1 || number>10);
        int tich=0;
        for(int i = 1; i <= number; i++){
            tich = number * i;
            System.out.print(number+" * "+i+" = "+tich+"\n");
        }
    }

}
