

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Student {

    String Name;
    Date Birthday;
    double Math;
    double Phys;
    double IT;
    double Aver;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        Name = sc.nextLine();
        System.out.print("Birthday (dd/MM/yyyy): ");
        try {
            Birthday = new SimpleDateFormat("dd/MM/yyyy").parse(sc.nextLine());
        } catch (Exception e) {
            Birthday = new Date();
        }
        System.out.print("Math: ");
        Math = sc.nextDouble();
        System.out.print("Phys: ");
        Phys = sc.nextDouble();
        System.out.print("IT: ");
        IT = sc.nextDouble();
    }

    public void display() {
        System.out.println("Name: " + Name);
        System.out.println("Birthday: " + new SimpleDateFormat("dd/MM/yyyy").format(Birthday));
        System.out.println("Math: " + Math);
        System.out.println("Phys: " + Phys);
        System.out.println("IT: " + IT);
        System.out.println("Average: " + Aver);
    }

    public void editName(String newName) {
        this.Name = newName;
    }

    public void editIT(double newIT) {
        this.IT = newIT;
    }

    public void delete() {
        Name = null;
        Birthday = null;
        Math = 0;
        Phys = 0;
        IT = 0;
        Aver = 0;
    }

    public double getAver() {
        Aver = (Math + Phys + IT) / 3;
        return Aver;
    }

    public int ranking() {
        if (Aver >= 8) return 1;
        if (Aver >= 6.5) return 2;
        if (Aver >= 5) return 3;
        return 4;
    }

    public static void main(String[] args) {
        Student Dat = new Student();
        Dat.input();

        double aver = Dat.getAver();
        int rank = Dat.ranking();
        Dat.display();
        System.out.println("Rank: " + rank);
    }
}