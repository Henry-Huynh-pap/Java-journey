public class parameter_passing_415 {
    public static void change(int x){
        x = 100;
    }

    public static void main(String [] args){
        int a = 10;
        change(a);
        System.out.println(a);
    }
}
