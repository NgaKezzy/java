import java.util.Scanner;
public class year_day {
    public static void main(String[] args){
        // chuyển phút sang nămcòn dư thì sang  ngày
        Scanner input = new Scanner(System.in);

        System.out.print("Nhập số phút :");
        int x = input.nextInt();

        int ngay = x/1440;
        int year = ngay /365;
        int day = ngay % 365;
        System.out.print("thời gian là: "+year+" năm "+day+" ngày");
    }
}
