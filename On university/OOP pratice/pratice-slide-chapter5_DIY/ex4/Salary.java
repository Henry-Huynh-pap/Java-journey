public class Salary {
    private double sum;
    private int month;
    private double tax;

    public Salary(double sum, int month, double tax){
        this.sum =sum;
        this.month = month;
        this.tax = tax;
    }

    public void setSum(double sum){
        this.sum = sum;
    }

    public double getSum(){
        return sum;
    }

    public void setMonth(int month){
        this.month = month;
    }

    public int getMonth(){
        return month;
    }

    public void setTax(double tax){
        this.tax = tax;
    }

    public double getTax(){
        return tax;
    }

    @Override
    public String toString() {
        return "Sum: " + sum + " Month: " + month + " Tax: " + tax;
    }
}
