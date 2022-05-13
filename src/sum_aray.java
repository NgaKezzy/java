import java.util.*;
public class sum_aray {
    public static void main(String[] args){
        int number[] = new int[]{5,6,8 ,9,7,12};
        int sum = 0;
        for (int i: number
             ) {
            sum+=i;
        }
        System.out.print("\nTổng các pt của mảng = "+sum);
        System.out.print("\nTB của các pt  = "+ (double)sum/number.length);
    }
}
