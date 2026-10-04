public class ex15 {
    public static void main(String[] args){

        for(int i = 1; i <= 4; i++){

            int m = 9 + (i -1) * -3; //space
            int n = 1 + (i - 1) * 2;

            for(int j = 1; j <= m; j++){
                System.out.print(" ");
            }

            for(int j = 1; j <= n; j++){
                System.out.print("*  ");
            }

            System.out.println();
        }

        for(int i = 1; i <= 3; i++){

            int m = 3 + (i -1) * 3; //space
            int n = 5 + (i - 1) * -2;

            for(int j = 1; j <= m; j++){
                System.out.print(" ");
            }

            for(int j = 1; j <= n; j++){
                System.out.print("*  ");
            }

            System.out.println();
        }
    }
}
