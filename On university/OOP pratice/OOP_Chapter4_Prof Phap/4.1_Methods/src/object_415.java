public class object_415 {
    public static class Student{
        String name;
    }

    public static void changeName(Student s){
        s.name = "An";
    }

    public static void main(String[] args){
        Student st = new Student();
        st.name = "Binh";
        changeName(st);
        System.out.println(st.name);
    }
}
