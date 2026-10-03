import java.util.*;

public class main {
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int [] A = new int[n];

        for(int i = 0; i < n; i ++){

            System.out.print("Enter A [ " + i + " ]: ");
            A[i] = scanner.nextInt();

            int min = A[0];
            for(int j = 0; j < n; j++){
                min = Math.min(min, A[i]);
            }

            System.out.println("The min of valuable is: " + min);
        }

        scanner.close();

    }
}
