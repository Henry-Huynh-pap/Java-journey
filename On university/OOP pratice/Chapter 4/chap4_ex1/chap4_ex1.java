public class chap4_ex1 {
    public static void main(String[] args){

        int a = 9;
        int b = 4;
        int c = 20;
        int result;

        result = sortNum(a,b,c);

        System.out.println(result);

    }

    public static int sortNum(int a, int b, int c){
        return Math.min(a, Math.min(b,c));
    }
}
