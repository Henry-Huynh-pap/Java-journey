import java.util.Scanner;

public class main {
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);

        int age = 0;
        String name;
        Boolean isStudent;

        System.out.print("What's your name ? : ");
        name = scanner.nextLine();

        System.out.print("How old are you ? : ");
        age = scanner.nextInt();

        System.out.print("Are you a student ? (true/false) : ");
        isStudent = scanner.nextBoolean();

        //Name
        if( name.isEmpty()){
            System.out.print("You haven't entered your name");
        }
        else{
            System.out.println("Hello " + name);
        }

        //Age
        if( age == 0){
            System.out.println("You are a baby");
        }
        else if( age <= 16){
            System.out.println("Keep learning");
        }
        else if( age >= 18){
            System.out.println("You can pay tax right now");
        }
        else{
            System.out.println("You haven't born yet");
        }

        //Boolean
        if(isStudent){
            System.out.println("You are a student");
        }
        else{
            System.out.println("You are not a student");
        }

        scanner.close();
    }
}
