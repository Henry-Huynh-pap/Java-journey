import java.util.*;

public class ex4 {
    public static void main(String[] args){

        Calendar rightNow = Calendar.getInstance();
        Date d = new Date();
        String str1 = new String("Hello Da Nang");
        StringBuffer strb = new StringBuffer("I want to become software engineer");

        System.out.println(rightNow.getTime());
        System.out.println(rightNow.getTimeZone());
        System.out.println(rightNow.getWeekYear());
        System.out.println("Current date is " + d);
        System.out.println("Current hour is " + d.getHours());
        System.out.println(str1.isEmpty());
        System.out.println(str1.charAt(1));
        System.out.println(str1.toUpperCase());
        System.out.println(str1.toLowerCase());
        System.out.println(strb.append(" in global big tech companies"));
    }
}
