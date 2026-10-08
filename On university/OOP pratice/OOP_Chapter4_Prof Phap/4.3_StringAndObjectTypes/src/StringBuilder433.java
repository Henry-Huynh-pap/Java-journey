public class StringBuilder433 {
    public static void main(String[] args){

        StringBuilder sb = new StringBuilder();

        sb.append("Hello");
        sb.append(" ");
        sb.append("Java");

        System.out.println(sb);

        StringBuilder sa = new StringBuilder();

        sa.append("ABC");
        sa.insert(0, "Start ");
        sa.delete(0, 6);
        sa.reverse();

        System.out.println(sa);

    }
}
