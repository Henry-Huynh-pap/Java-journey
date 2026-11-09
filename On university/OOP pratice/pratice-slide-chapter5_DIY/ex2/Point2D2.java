public class Point2D2 {
    private double x;
    private double y;

    public Point2D2(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void details() {
        System.out.println("(" + x + "," + y + ")");
    }
}