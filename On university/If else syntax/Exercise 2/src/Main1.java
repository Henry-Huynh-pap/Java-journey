public class Main1{
    public static void main(String[] args){

        int x1 = 6;
        int x2 = 4;
        int x3 = 2;
        int m ;

        if(x1 < x2){
            m =x1;
        }
        else {
            m = x2;
        }

        if(x3 < m){
            m = x3;
        }


        System.out.print("The min is: " + m);
    }

}