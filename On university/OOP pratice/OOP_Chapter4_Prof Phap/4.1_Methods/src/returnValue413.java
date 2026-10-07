public class returnValue413 {
    public static int max(int a, int b){
        if(a >b){
            return a;
        }
        return b;
    }

    public static void main(String[] args){
        int a = 20;
        int b = 10;

        int result = max(a,b);
        System.out.println(result);
    }
}
