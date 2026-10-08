public class ReferenceVariables435 {
    public static void main(String[] args){
        class Student{
            String name;
            int age;
        }

        Student s = new Student();
        s.name = "An";
        s.age = 20;

        System.out.println(s.name);
        System.out.println(s.age);
    }
}
