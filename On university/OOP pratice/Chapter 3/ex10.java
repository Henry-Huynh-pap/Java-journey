public class ex10 {
    public static void main(String[] args){

        int sum = 0;

        for(int i = 1; i <= 100; i++){
            if(i % 7 == 0){
                sum = sum + i;
            }
        }

        System.out.println("The sum of all number between 1 and 100 that divides in 7 without a residual is: " + sum);
    }
}
