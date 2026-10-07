public class Traversing_Arrays_423 {
    public static void main(String[] args){

        int [] a = {10, 20 ,30 ,40};

        for(int i =0; i < a.length; i++){
            System.out.println(a[i]);
        }

        for(int x : a){
            System.out.println(x);
        }
    }
}
