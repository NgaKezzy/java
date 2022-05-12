import java.util.Scanner;
public class so_le {
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);

        System.out.print("Nhập 1 số :");
        int number = ip.nextInt();

        int sum = 0;
        System.out.print("Các số lẻ từ 1 đến "+number+" là : \n");
        for(int i =1 ; i <= number ; i++ ){
            if(i%2==1){
                System.out.print(i+"\n");
                sum +=i;

            }

        }
//        return sum;
        System.out.print("Tổng các số lẻ ="+sum);

    }
}
