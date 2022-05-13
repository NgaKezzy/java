import java.util.*;
public class delete_aray {
    public static void main(String[]args){
        int size = 20; // Suc chua cua mang
        int[] arr = new int[size];
        arr[0] = 1;
        arr[1] = -1;
        arr[2] = 6;
        arr[3] = 5;
        arr[4] = 3;
        int n = 5; // So luong phan tu trong mang hien tai
        System.out.print("Truoc khi xoa: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        int x = 6;
        n = delete(arr, n, x);
        System.out.print("\nSau khi xoa : ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
    static int delete(int[] arr, int n, int key) {
        int pos = searchElement(arr, key);
        if (pos == -1) {
            System.out.println("Khong tim thay phan tu can xoa");
        }
        // Xoa phan tu
        for (int i = pos; i < n; i++) {
            arr[i] = arr[i + 1];
        }
        return n - 1;
    }
    static int searchElement(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }
}
