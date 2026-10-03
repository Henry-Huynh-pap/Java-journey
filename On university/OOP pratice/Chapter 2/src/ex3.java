import java.util.Random;

public class ex3 {
    public static void main(String[] args){

        Random random = new Random();

        int a = random.nextInt();
        double b = random.nextDouble();
        float c = random.nextFloat();
        double d = random.nextGaussian();
        int e = random.nextInt(10);
        int f = random.nextInt(5, 11);
        long g = random.nextLong();
        double z = random.nextDouble(1.0,5.0);

        random.setSeed(100);
        int h = random.nextInt(100);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(random.nextBoolean());
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(z);
    }
}
