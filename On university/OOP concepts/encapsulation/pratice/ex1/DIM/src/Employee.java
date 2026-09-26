public class Employee {
    private String name;
    private String emId;
    private double salaryBase;

    public Employee (String name,String emId,double salaryBase){
        this.name = name;
        this.emId = emId;
        this.salaryBase = salaryBase;
    }

    public String getName(){
        return name;
    }

    public String getEmid(){
        return emId;
    }

    public double getSalaryBase(){
        return salaryBase;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setEmId(String emId){
        this.emId = emId;
    }

    public void setSalaryBase(double salaryBase){
        this.salaryBase = salaryBase;
    }
}
