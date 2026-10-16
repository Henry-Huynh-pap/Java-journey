import java.awt.*;

public class Circle2D {
    private double radius;
    private Color color;
    private Point2D2 center;

    public Circle2D(Point2D2 center, double radius, Color color) {
        this.radius = radius;
        this.color = color;
        this.center = center;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public Point2D2 getCenter(){
        return center;
    }

    public void setCenter(Point2D2 center){
        this.center = center;
    }

    public Color getColor(){
        return color;
    }

    public void setColor(Color color){
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle: center = (" + center.getX() + "," + center.getY() +") "
                + "Radius = " + radius + " Color =" + color;
    }
}
