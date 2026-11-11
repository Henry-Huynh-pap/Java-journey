import java.util.*;

abstract class Employee{
    private String name;
    private double age;
    private double hourRate;

    public Employee(String name, double age,double hourRate){
        this.name = name;
        this.age = age;
        this.hourRate = hourRate;
    }

    public abstract double salary(double hours);

    public String getName(){
        return name;
    }

    public double getHourRate(){
        return hourRate;
    }

    public String toString(){
        return "name= " + name + " age= " + age + " hourRate= " + hourRate;
    }
}

class Manager extends Employee{
    public Manager(String name,double age, double hourRate){
        super(name,age,hourRate);
    }

    public double salary(double hours){
        return hours * this.getHourRate() * 1.2;
    }
}

class Clerk extends Employee{
    public Clerk(String name, double age, double hourRate){
        super(name, age, hourRate);
    }

    public double salary(double hours){
        return hours * this.getHourRate() * 0.8;
    }
}

public class Main{
    public static void main(String[] args){
        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Manager("HCPhap",45,104));
        list.add(new Clerk("Jonh Le", 26, 110));
        list.add(new Manager("David Huynh",42,120));
        list.add(new Manager("Marry Nguyen", 34, 120));

        double hours[] = {140,150,130,180};

        double total = 0;

        for(int i = 0; i < list.size(); i++){
            total += list.get(i).salary(hours[i]);
            System.out.println(list.get(i));
        }

        System.out.println("The total payment of the employee is " + total);
    }
}