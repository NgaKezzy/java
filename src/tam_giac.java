import java.util.Scanner;
public class tam_giac {
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
            int k=1;
        for (int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(k++);
            }
            System.out.println("");
        }
    }
}
