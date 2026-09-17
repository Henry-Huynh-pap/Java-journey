import java.util.Random;

public class Main{
    public static void main(String [] args){

        Random random = new Random();

        int num1;

        num1 = random.nextInt(1 , 99);

        System.out.print(num1);
    }
}