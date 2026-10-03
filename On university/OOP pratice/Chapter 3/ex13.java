public class ex13 {
    public static void main(String[] args){

        for(int i = 1; i <= 4 ; i++ ){

            int k = 10 + (i - 1) * -2;
            int l = 0 + ( i - 1 ) * 2;

            for(int j = 1; j <= l; j++){
                System.out.print(" ");
            }

            for(int j = 1; j <= k; j++){
                System.out.print("* ");
            }

            System.out.println();
        }

        for(int i =1; i < 4; i++){

            int l = 4 + (i - 1) * -2;
            int k = 6 + (i - 1) * 2;

            for(int j = 1; j <= l; j++){
                System.out.print(" ");
            }

            for(int j = 1; j <= k; j++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
