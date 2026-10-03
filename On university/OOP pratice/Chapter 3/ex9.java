public class ex9 {
    public static void main(String[] args){

        int a = 0;

        for(int i =0; i <= 100; i++){
            if(i % 7 == 0){
                a = Math.max(a,i);
            }
        }

        System.out.println("The biggest number between 1 and 100 that divides in 7 without a residual is: " + a);
    }
}
