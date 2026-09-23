import java.util.Scanner;

public class Main{
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);

        char ch;

        System.out.print("Enter a character: ");
        ch = scanner.next().charAt(0);

        if(Character.isUpperCase(ch)){
            System.out.print("Convert from upper case to lower case: " + Character.toLowerCase(ch));
        }
        else if(Character.isLowerCase(ch)){
            System.out.print("Convert from lower case to upper case: " + Character.toUpperCase(ch));
        }
    }
}