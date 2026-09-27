public class Main{
    public static void main(String[] args){

        happyBirthday("Henry", 20);
        System.out.println(square(9));
        System.out.println(cube(3));
        System.out.println(fullName("Henry","Huynh"));

        int age = 12;

        if( ageCheck(age)){
            System.out.println("You must pay tax");
        }
        else{
            System.out.println("You have to go to school");
        }

    }

    static void happyBirthday(String name, int age){
        System.out.println("Happy your birthday");
        System.out.printf("Happy dear %s\n", name);
        System.out.printf("Happy your %d\n", age);
        System.out.println("Happy birthday");
    }

    static double square(double length){
        return length*length;
    }

    static double cube(double length){
        return length*length*length;
    }

    static String fullName(String firstName, String lastName){
        return firstName + " " + lastName;
    }

    static boolean ageCheck(int age){
        if( age >= 18){
            return true;
        }
        else{
            return false;
        }
    }
}