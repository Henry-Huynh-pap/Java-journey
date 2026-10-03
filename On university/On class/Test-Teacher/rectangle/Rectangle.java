public class Rectangle {

    private double length;
    private double width;

    public Rectangle (double length, double width){
        this.length = length;
        this.width = width;
    }

    public double area(){
        return length * width;
    }

    public void display(){
        System.out.println("THe area of a rectangle is: " + area());
    }

}
