import java.awt.*;

public class MainEx2Chap5 {
    public static void main(String[] args){

        Point2D2 first = new Point2D2(3,8);
        Circle2D circle2D = new Circle2D(first, 6, Color.red);

        System.out.println(circle2D.toString());
    }
}
