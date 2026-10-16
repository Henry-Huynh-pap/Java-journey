public class tichVoHuong {
    public static void main(String[] args){
        double dot = 0;
        double[] A = {1, 2, 3};
        double[] B = {4, 5, 6};

        for (int i = 0; i < A.length; i++) {
            dot += A[i] * B[i];
        }

        System.out.println(dot);
    }
}
