public class Company {

    private String name;
    private String address;
    private double cost;
    private double income;
    private double benefit;

    public Company(String name, String address, double cost, double income){
        this.name =name;
        this.address = address;
        this.cost = cost;
        this.income = income;
    }

    public double calculateBenefit(){
        return benefit = income - cost;
    }

    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Cost: $ " + cost);
        System.out.println("Income: $ " + income);
        System.out.println("Benefit: $ " + calculateBenefit());
    }

}
