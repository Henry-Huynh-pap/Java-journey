public class Number {

    private int num;

    public Number(int num) {
        this.num = num;
    }

    public int sumFactor() {
        int sum = 0;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

    public void display(){
        System.out.println("The sum factor of a valuable is: " + sumFactor());
    }
}