import java.util.Arrays;

public class nhanVectorVoi1SoVoHuong {
    public static void main(String[] args){
        double k = 2.0;
        double[] A = {1, 2, 3};

        double[] result = new double[A.length];
        for (int i = 0; i < A.length; i++) {
            result[i] = k * A[i];
        }

        System.out.println(Arrays.toString(result));
    }
}
