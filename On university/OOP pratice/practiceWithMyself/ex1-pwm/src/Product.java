public class Product{
    private int id;
    private String name;
    private double price;
    private double quantity;
    
    public Product(int id,String name,double price,double quantity){
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    
    public int getId(){
        return id;
    }
    
    public String getName(){
        return name;
    }
    
    public double getPrice(){
        return price;
    }
    
    public double getQuantity(){
        return quantity;
    }
    
    public double totalValue(){
        return price * quantity;
    }
    
    public String toString(){
        return "ID = " + id + ", Name = " + name + ", Price = " +", Quantity = " + quantity;
    }
}


