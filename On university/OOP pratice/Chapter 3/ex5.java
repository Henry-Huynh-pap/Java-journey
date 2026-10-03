public class ex5 {
    public  static void main(String[] args){

        int i = 0;

        do{
            i++;
            if(i % 2 == 0){
                System.out.println("The even number is: " + i);
            }

        }while(i >= 1 && i <= 100);
    }
}
