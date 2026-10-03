public class ex7 {
    public static void main(String [] args){

        int i = 1;
        int sum = 0;

       do{
           sum = sum + i;
           i++;

       }while( i <=100);

        System.out.println("The sum of all integer number between 1 and 100 is:  " + sum);
    }
}
