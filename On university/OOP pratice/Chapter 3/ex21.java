public class ex21 {
    public static void main(String[] args) {

        int x = 0xFFFF;

        for (int i = 0; i <= x; i++) {

            String s = Integer.toHexString(i);
            System.out.println(s.toUpperCase());
        }
    }
}