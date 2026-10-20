import java.util.Date;

public class Vacation {
    private int length;
    private Date date;
    private String place;

    public Vacation(int length, Date date, String place){
        this.length = length;
        this.date = date;
        this.place = place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getPlace() {
        return place;
    }

    public Date getDate() {
        return date;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "Place: " + place +" Length: " + length + " Date: " + date;
    }
}
