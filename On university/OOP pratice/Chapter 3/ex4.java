public class ex4 {
    public static void main(String[] args){

        int i = 1;

        while( i >= 1 && i <= 100 ){
            i++;
            if(i % 2 == 0) {
                System.out.println("The even number is: " + i);
            }
        }
    }
}
