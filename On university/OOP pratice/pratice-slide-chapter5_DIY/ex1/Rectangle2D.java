public class Rectangle2D {
    private Point2D2 first;
    private Point2D2 second;

    public Rectangle2D(Point2D2 first, Point2D2 second){
        this.first = first;
        this.second = second;
    }

    public double length(){
        return Math.abs(first.getX() - second.getX());
    }

    public double height(){
        return Math.abs(first.getY() - second.getY());
    }

    public double area(){
        return length()*height();
    }

    public double perimeter(){
        return (length()+height())*2;
    }

    public void display(){
        System.out.print("The first corner is: ");
        first.details();
        System.out.print("The second corner is: ");
        second.details();
        System.out.println("The length of rectangle is: " + length());
        System.out.println("The height of rectangle is: " + height());
        System.out.println("The area of rectangle is: " + area());
        System.out.println("The perimeter of rectangle is: " + perimeter());
    }
}
