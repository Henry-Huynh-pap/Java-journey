import java.util.Scanner;
public class ex16 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int n, result;

        System.out.print("Enter a number: ");
        n = scanner.nextInt();

        for(int i = 1; i <= n ; i++){

            result = (int) (Math.pow(i,2) - 1);
            System.out.print(result + ",  ");
        }

        scanner.close();
    }
}

