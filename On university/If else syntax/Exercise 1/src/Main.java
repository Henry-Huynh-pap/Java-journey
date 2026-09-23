public class Main{
    public static void main(String[] args){

        int min = 4;
        int b = 5;
        int c = 6 ;
        int temp;

        if( b < min){
            temp = b;
            System.out.print("The value of min is: " + temp);
        }
        else if (c < min) {
            temp = c;
            System.out.print("The value of min is: " + temp);
        }
        else{
            System.out.print("THe value of min is: " + min);
        }


    }
}