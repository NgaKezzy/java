
import java.util.*;

public class test_method_java {
    public static void main(String[] args){
        Scanner ip= new Scanner(System.in);

        int array[] = new int[]{1,2,3,4,5,9,8,7};
        String language[]  = new String[]{"Java","Python", "PHP", "C#","C Programming","C++"};
        Arrays.sort(array);
        System.out.print(Arrays.toString(array));
        Arrays.sort(language);
        System.out.print(Arrays.toString(language));
        List<Double> list = new ArrayList<Double>();
        list.add(3.0);
        System.out.print(list);

    }
}
