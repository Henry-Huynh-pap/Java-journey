public class Currency {
    private String name;
    private double currentDollarRate;

    public Currency(String name, double currentDollarRate){
        this.name = name;
        this.currentDollarRate = currentDollarRate;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCurrentDollarRate(double currentDollarRate) {
        this.currentDollarRate = currentDollarRate;
    }

    public double getCurrentDollarRate() {
        return currentDollarRate;
    }

    @Override
    public String toString() {
        return "Name: " + name + "; Current dollar rate: " + currentDollarRate;
    }
}
