import java.awt.*;

public class Mobile {
    private String ownerName;
    private Color color;
    private String number;
    private String model;

    public Mobile(String ownerName, Color color, String number, String model){
        this.ownerName = ownerName;
        this.color = color;
        this.number = number;
        this.model = model;
    }

    public void setOwnerName(String ownerName){
        this.ownerName = ownerName;
    }

    public String getOwnerName(){
        return ownerName;
    }

    public void setColor(Color color){
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setNumber(String number){
        this.number = number;
    }

    public String getNumber(){
        return number;
    }

    public void setModel(String model){
        this.model = model;
    }

    public String getModel(){
        return model;
    }

    public String toString(){
        return "Owner name : " + ownerName + " Color: " + color + " Number: " + number + " Model: " + model;
    }
}
