public class ex22 {
    public static void main(String[] args) {

        int x = 0777;

        for (int i = 0; i <= x; i++) {

            String s = Integer.toOctalString(i);
            System.out.println(s);
        }
    }
}