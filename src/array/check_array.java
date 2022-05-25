package array;
import java.util.*;
public class check_array {
    public static Scanner ip = new Scanner(System.in);
    public static void main (String []args){
        int x[] =new int[]{1,2,3,4,5,6,8,7,9};

        System.out.print("Nhập số bạn muốn kiểm tra : ");
        int  number = ip.nextInt();

        // kiểm trá xem mảng có giá trị nào trùng vs number hay ko
        boolean flag = false;

        int  location = 0;

        for(int i=0;i<x.length;i++){
            if(x[i]==number){
                flag =true;
                location = i;
            }
        }
        if(flag == true){
            System.out.print("\n Giá trị số "+number+" năm ở vị trí số "+location+" trong mảng.");
        }
        else{
            System.out.print("\n Giá trị "+number+" không có trong mảng");
        }


    }
}
