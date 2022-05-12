public class flag_usa {
    public static void main(String[] args) {
        System.out.print("<-------------------- USA ------------------->\n  \n");

        for (int i = 0; i <= 3; i++) {
                for (int j= 0; j <= 20; j++){
                    if (j <= 5)
                        System.out.print("*  ");
                    else
                        System.out.print("= ");
                }
            System.out.print("\n");
            }

        for(int x = 0; x <= 4; x++) {
            for(int z = 0; z <= 23; z++){
                System.out.print("= ");
            }
            System.out.print("\n");
        }

    }

}



