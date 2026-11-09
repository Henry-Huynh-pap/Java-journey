public class Main{
    public static void main(String[] args){

        double k = 2.0;

        double[] A = {1, 2, 3};
        double[] B = {4, 5, 6};
        double[] C = new double[A.length];

        for ( int i = 0; i < A.length; i++) {
            C[i] = A[i] + B[i];
            System.out.print(C[i] + " ");
        }

        System.out.println();

        for ( int i = 0; i < A.length; i++) {
            C[i] = B[i] - A[i];
            System.out.print(C[i] + " ");
        }

        double[] result = new double[A.length];
        for (int i = 0; i < A.length; i++) {
            result[i] = k * A[i];
        }

        System.out.println(result);
    }
}