public class ex2 {
    public static void main(String[] args){

        StringBuffer sb = new StringBuffer("Hello");
        char c;

        sb.append(" World");
        sb.insert(0, "Hi, ");

        System.out.println(sb);
        System.out.println( c = sb.charAt(1));

        StringBuffer sb1 = new StringBuffer("Hello World");

        sb1.delete(5, 11);
        sb1.deleteCharAt(0);

        System.out.println(sb1);

        StringBuffer sb2 = new StringBuffer("Hello World");

        sb2.replace(0, 5, "Hi");
        sb2.reverse();

        System.out.println(sb2);

        StringBuffer sb3 = new StringBuffer("Hello");

        sb3.setCharAt(0, 'j');

        System.out.println(sb3);
        System.out.println(sb3.length());
        System.out.println(sb3.indexOf("Hello"));

    }
}
