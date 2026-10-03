public class Teacher extends Person{

    private String institution_name;
    private String courses;

    public Teacher(String name, int age, String address,String institution_name, String courses){
        super(name,age,address);
        this.institution_name = institution_name;
        this.courses = courses;
    }

    @Override
    public void display(){
        super.display();
        System.out.println("Institution name: " + institution_name);
        System.out.println("Courses: " + courses);
    }
}
