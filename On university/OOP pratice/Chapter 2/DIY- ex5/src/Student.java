public class Student {

    private String name;
    private int age;
    private String address;
    private double score1;
    private double score2;
    private double score3;
    private double score4;

    public Student(String name, int age, String address, double score1, double score2, double score3, double score4){
        this.name= name;
        this.age = age;
        this.address = address;
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
        this.score4 = score4;
    }

    public double CalculateAverage(){
        return (score1 + score2 + score3 + score4) / 4;
    }

    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Age " + age );
        System.out.println("Address " + address);
        System.out.println("Score 1: " + score1);
        System.out.println("Score 2: " + score2);
        System.out.println("Score 3: " + score3);
        System.out.println("Score 4: " + score4);
        System.out.println("The average mark is " + CalculateAverage());
    }
}
