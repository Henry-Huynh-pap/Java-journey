import java.util.Arrays;

public class doDai_vectoDonVi_Cosinesimilarity_TichCoHuong {
    public static void main(String[] args){

        double[] A = {1, 2, 3};
        double[] B = {4, 5, 6};

        double norm = 0;
        for (double v : A) norm += v * v;
        norm = Math.sqrt(norm);

        System.out.println("The length is: " + norm);

        double[] unitA = new double[A.length];
        for (int i = 0; i < A.length; i++) {
            unitA[i] = A[i] / norm;
        }

        System.out.println(Arrays.toString(unitA));

        double dot = 0, normA = 0, normB = 0;
        for (int i = 0; i < A.length; i++) {
            dot += A[i] * B[i];
            normA += A[i] * A[i];
            normB += B[i] * B[i];
        }
        double cosineSimilarity = dot / (Math.sqrt(normA) * Math.sqrt(normB));

        System.out.println(cosineSimilarity);


        // Giả sử A và B là mảng có đúng 3 phần tử (không gian 3D)
        double[] cross = new double[3];
        cross[0] = A[1] * B[2] - A[2] * B[1]; // a2*b3 - a3*b2
        cross[1] = A[2] * B[0] - A[0] * B[2]; // a3*b1 - a1*b3
        cross[2] = A[0] * B[1] - A[1] * B[0]; // a1*b2 - a2*b1

        System.out.println(Arrays.toString(cross));
    }
}
