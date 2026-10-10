public class ClassInterfaceEnumRecord445 {
    public static void main(String[] args){
        class Student{
            String name;
            int age;
        }

        interface Animal{
            void sound();
        }

        enum Gender{
            MALE, FEMALE, OTHER
        }

        record Student(String name, int age) {}

        Student s = new Student("An", 20);
        System.out.println(s.name());   // An
        System.out.println(s.age());    // 20
        System.out.println(s);          // Student[name=An, age=20]

        Object c = new Student();
    }
}
