class Student{
    public String name;
    public float aver;
    public static int NS=0;
    public Student (String name , float a){
        this.name = name;
        aver=a;
        NS++;
    }
}
public class Main {
    public static void main(String[] args){
        Student A = new Student("Nam", 7);
        Student B = new Student("Nu", 8);
        System.out.println("A.aver= " +A.aver);
        System.out.println("B.aver= " +B.aver);
        System.out.println("A.NS= " + A.NS);
        System.out.println("B.NS= " + B.NS);
    }
}
