class Employee{
    String id;
    String name;
    String department;
    double salary;

    public Employee(String id, String name, String dep, double sal){
        this.id=id;
        this.name=name;
        department = dep;
        salary = sal;
    }

    public void setId(String val){
        id = val;
    }

    public String getId(){
        return id;
    }

    public void details(){
        System.out.println("ID: " +id);
        System.out.println("Name: "+ name);
        System.out.println("Department: " +department);
        System.out.println("Salary: " +salary);
    }
}

class Manager extends Employee{
    String title;
    double position_allowance;

    public Manager(String id, String name, String dep, double sal, String tit, double pa){
        super(id,name,dep,sal);
        title=tit;
        position_allowance = pa;
    }

    public void setTitel(String val){
        title = val;
    }

    public String getTittle(){
        return title;
    }

    public void details(){
        super.details();
        System.out.println("Title: " + title);
        System.out.println("Position allowance: " + position_allowance);
    }
}

public class Main{
    public static void main(String[] args){
        Employee A = new Employee("VKU01", "David Tho", "Academic Office", 10000);
        Manager B = new Manager("VKU02", "Jonh Phap", "Steering Board", 10000, "Rector", 1000);

        A.details();
        System.out.println("--------");
        B.details();
    }
}