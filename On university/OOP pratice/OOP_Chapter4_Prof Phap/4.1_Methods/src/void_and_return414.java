public class void_and_return414 {
    public static void main(String[] args){

        int age = 20;

        printHello();
        checkAge(20);

    }

    public static void printHello(){
        System.out.println("Hello Java!");
    }

    public static void checkAge(int age){
        if(age < 18){
            return;
        }
        System.out.println("Adult");
    }
}
