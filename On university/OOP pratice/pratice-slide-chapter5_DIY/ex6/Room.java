public class Room {
    private int beds;
    private boolean tv;
    private boolean telephone;

    public Room(int beds, boolean tv, boolean telephone){
        this.beds = beds;
        this.tv = tv;
        this.telephone = telephone;
    }

    public void setBeds(int beds) {
        this.beds = beds;
    }

    public int getBeds() {
        return beds;
    }

    public void setTv(boolean tv) {
        this.tv = tv;
    }

    public boolean getTv(){
        return tv;
    }

    public void setTelephone(boolean telephone) {
        this.telephone = telephone;
    }

    public boolean getTelephone(){
        return telephone;
    }

    public String toString(){
        return "Bed: " + beds + "; TV: " + tv + "; Telephone: " + telephone;
    }
}
