public class a84 {

    public static int countChar(String text, char target) {
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == target) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        String text =
                "Java is a powerful programming language";

        System.out.println("Length = " + text.length());

        String[] words = text.split("\\s+");

        System.out.println("Words = " + words.length);

        System.out.println(text.toUpperCase());

        System.out.println(
                "Contains Java = " + text.contains("Java")
        );

        System.out.println(
                "Number of a = " + countChar(text, 'a')
        );
    }
}