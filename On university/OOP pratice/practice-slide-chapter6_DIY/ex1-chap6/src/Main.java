abstract class Shape{
    public abstract double area();
    public abstract double perimeter();
    public abstract void draw();
}

class Square extends Shape{
    private double sideLength;

    public Square(double sideLength){
        this.sideLength = sideLength;
    }

    public double area(){
        return sideLength*sideLength;
    }

    public double perimeter(){
        return sideLength*4;
    }

    public void draw(){
        for(double i = 0; i < sideLength; i++){
            for(double j = 0; j < sideLength; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

class Circle extends Shape{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double area(){
        return Math.PI*Math.pow(radius,2);
    }

    public double perimeter(){
        return 2*Math.PI*radius*radius;
    }

    @Override
    public void draw() {
        int r = (int) Math.round(radius);

        for (int i = 0; i <= 2 * r; i++) {
            for (int j = 0; j <= 2 * r; j++) {
                int dx = j - r;
                int dy = i - r;

                double distance = Math.sqrt(dx * dx + dy * dy);

                if (distance <= r) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

class EquilateralTriangle extends Shape{
    private double sideLength;

    public EquilateralTriangle(double sideLength){
        this.sideLength = sideLength;
    }

    public double area(){
        return sideLength*sideLength*Math.sqrt(3) / 4;
    }

    public double perimeter(){
        return 3*sideLength;
    }

    @Override
    public void draw(){
        for (int i = 1; i <= sideLength; i++) {

            for (int j = 1; j <= 2 * (sideLength - i); j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Shape square = new Square(5);
        Shape circle = new Circle(4);

        square.draw();

        System.out.printf("%.2f%n",circle.area());
        circle.draw();

        Shape equilateral = new EquilateralTriangle(5);
        System.out.println();
        equilateral.draw();
    }
}