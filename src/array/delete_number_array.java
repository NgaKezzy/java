package array;
import java.util.*;
public class delete_number_array {
    public static Scanner ip = new Scanner(System.in);

    public static void main(String[] args) {
        int[] my_array = {1,2,3,4,5,6,7,8,9};

        System.out.print("Nhập vị trí bạn muốn xóa ");
        int location = ip.nextInt();
        if (location > my_array.length) {
            System.out.print("\n Vị trí bạn muốn xóa vượt quá giới hạn  của mảng");
            return;
        } else {
            System.out.print("Mảng đã xóa gồm các pt là \n");
            for (int i = location; i < my_array.length - 2; i++) {
                my_array[i] = my_array[i + 1];

                }
            }
            System.out.print(Arrays.toString(my_array)+"\t\t");
        }
    }

