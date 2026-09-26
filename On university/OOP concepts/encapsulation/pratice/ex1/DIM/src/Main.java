public class Main{
    public static void main(String[] args){

        Employee employee = new Employee("Henry", "26IT048", 1000 );

        System.out.println("Name: "+ employee.getName() + " " + "Id: " + employee.getEmid() +  " " + "Salary base is: " + employee.getSalaryBase());

        employee.setName("John");
        employee.setEmId("78787");
        employee.setSalaryBase((10000));

        System.out.print("name: " + employee.getName() + " " + "Id: " + employee.getEmid() + " " + "Salary base: " + employee.getSalaryBase());
    }
}