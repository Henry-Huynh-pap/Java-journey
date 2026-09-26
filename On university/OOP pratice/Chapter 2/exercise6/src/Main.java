class Rectangle{
    private double width, height;
    Rectangle (double widVal, double heightVal){
        width = widVal;
        height = heightVal;
    }

    double area(){
        return width * height;
    }
}

public class Main{
    public static void main(String args[]){
         Rectangle rec1,rec2;

         rec1 = new Rectangle(23,20);
         rec2 = new Rectangle(40,50);

         System.out.println("area of rec1 is: " + rec1.area());
         System.out.println("area of rec1 is: " + rec2.area());
    }
}

