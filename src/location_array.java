import java.util.*;
public class location_array {
    public static void main(String[]args){
        Scanner ip=new Scanner(System.in);

        int number[] =new int[]{11,12,13,15,18,17,19,5,6};

        System.out.print("Mảng gồm các pt : "+Arrays.toString(number));
        System.out.print("\nNhập pt trong mảng bạn muốn tìm vị trí : ");

        int a;
        boolean flag= false;
        do {
             a = ip.nextInt();
            for (int i=0; i< number.length;i++) {
                if(a == number[i]){
                    flag =true;
                }
            }
            if(flag == false){
                System.out.print("\nNhâp lại ! chú ý các pt có trong mảng : ");
            }

        }while (flag == false);
        for (int k=0; k< number.length;k++) {
            if(a == number[k]){
                System.out.print("Phần tử nằm ở vị trí số "+(k+1));
            }
        }

    }
}
