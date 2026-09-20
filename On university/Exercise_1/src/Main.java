import java.util.Scanner;

public class Main{
        public static void main(String [] args){

            byte ASCIIcode;
            Scanner scanner = new Scanner(System.in);
            System.out.print("Input an ASCII code : ");
            ASCIIcode = scanner.nextByte();
            System.out.println("ASCII code " + ASCIIcode + " is " + (char)ASCIIcode);

            scanner.close();
        }
}