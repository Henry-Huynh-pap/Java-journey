public class Arrays_and_Methods425 {
    public static void main(String[] args){
       int [] numbers = {1,2,3,4,5};
        System.out.println(sum(numbers));
    }

    public static int sum(int[] a){
        int s = 0;
        for(int x : a){
            s += x;
        }
        return s;
    }
}
