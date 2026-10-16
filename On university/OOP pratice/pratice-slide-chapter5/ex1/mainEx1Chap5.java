public class mainEx1Chap5 {
    public static void main(String [] args){

        Point2D first = new Point2D(3,6);
        Point2D second = new Point2D(4,8);
        Rectangle2D rectangle2D = new Rectangle2D(first, second);

        rectangle2D.display();
    }
}
