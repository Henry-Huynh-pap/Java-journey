public class ex8 {
    public static void main(String [] args){

        int i = 0;
        double sum = 0;
        double avr = 0;

        do{
            sum = sum + i;
            i++;

        }while( i <= 100);

        avr = sum / (i-1);

        System.out.println("The average of all integer number between 1 and 100 is: " + avr);
    }
}
