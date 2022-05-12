import java.util.Scanner;
public class count_bmi {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);


        System.out.print("Nhập số cân nặng : ");
        double kg = input.nextDouble();


        System.out.print("Nhập chiều cao : ");
        double cm =input.nextDouble();
        double m = (double)cm/ 100;

        double BMI =(double) kg/(Math.pow(m,2));
        System.out.print("BMI = "+String.format("%.1f",BMI)+"\n");

        if( BMI <18.5){
            System.out.print("Gầy");
        }
        else if(BMI>=18.5 && BMI<=24.9){
            System.out.print("Bình thường ");
        }
        else if(BMI>=25 && BMI<=29.9){
            System.out.print("Thừa cân");
        }
        else if(BMI>=30 && BMI<=34.9){
            System.out.print("Béo phì cấp độ 1");
        }
        else if(BMI>=35 && BMI<=39.9){
            System.out.print("Béo phì cấp độ 2");
        }
        else if(BMI >40){
            System.out.print("Béo phì cấp độ 3");
        }





    }
}
