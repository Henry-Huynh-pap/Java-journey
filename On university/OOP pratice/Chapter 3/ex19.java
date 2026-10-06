import java.util.Scanner;

public class ex19 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int n, result;

        System.out.print("Enter a number: ");
        n = scanner.nextInt();

        for(int i = 0; i <= n; i++){
            result = (int) Math.pow(3,i);

            System.out.print(result + ", ");
        }

        scanner.close();
    }
}
