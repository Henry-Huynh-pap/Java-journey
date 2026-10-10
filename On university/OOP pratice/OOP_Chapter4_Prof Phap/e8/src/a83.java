public class a83 {

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int x : row) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }

    public static int sum(int[][] matrix) {
        int result = 0;

        for (int[] row : matrix) {
            for (int x : row) {
                result += x;
            }
        }

        return result;
    }

    public static int diagonalSum(int[][] matrix) {
        int n = Math.min(matrix.length,
                matrix[0].length);
        int result = 0;

        for (int i = 0; i < n; i++) {
            result += matrix[i][i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        printMatrix(matrix);
        System.out.println("Sum = " + sum(matrix));
        System.out.println(
                "Diagonal = " + diagonalSum(matrix)
        );
    }
}