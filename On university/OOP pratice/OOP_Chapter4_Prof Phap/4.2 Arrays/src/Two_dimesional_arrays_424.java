public class Two_dimesional_arrays_424 {
    public static void main(String[] args){
        int [][] matrix = {{1,2,4},
                           {4,5,6}};

        System.out.println(matrix[0][1]);

        for(int i =0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
