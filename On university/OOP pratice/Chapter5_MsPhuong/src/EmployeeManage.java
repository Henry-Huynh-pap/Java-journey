import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManage {
    ArrayList<Employee> lst = new ArrayList<Employee>();
    public EmployeeManage(){
        Input(2);
        Display();
    }
    public void Input(int n){
        Scanner scan = new Scanner(System.in);
        for(int i=0;i<n;i++){
            {
                System.out.print("Input id=");
                int id = scan.nextInt();
                System.out.print("Input firstname=");
                String firstname = scan.nextLine();
                System.out.print("Input lastname=");
                String lastname = scan.nextLine();
                System.out.print("Input salary=");
                int salary = scan.nextInt();
                Employee employees = new Employee(id,firstname,lastname,salary);
                lst.add(employees);
            }
        }
    }
    public void Display(){
        for(int i=0;i<lst.size();i++){
            lst.get(i).toString();
        }
    }
    public static void main(String agrs[]){
        EmployeeManage emp = new EmployeeManage();

    }
}
