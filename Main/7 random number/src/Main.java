import java.util.Random;

public class Main{
    public static void main(String [] args){

        Random random = new Random();

        int num1;

        num1 = random.nextInt(1 , 99);

        boolean isStudent;

        isStudent = random.nextBoolean();

        System.out.println(num1);

        if(isStudent){
            System.out.println("I'm a student");
        }
        else{
            System.out.println("I'm not a student");
        }
    }
}