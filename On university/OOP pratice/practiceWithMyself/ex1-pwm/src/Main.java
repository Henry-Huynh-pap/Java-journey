import java.util.*;

public class Main{
    public static void main(String[] args){
        ArrayList<Product> list = new ArrayList<>();

        list.add(new Product(101,"Snack",3,200));
        list.add(new Product(102,"Pizza",6,0));
        list.add(new Product(103,"Fish",8,50));
        list.add(new Product(104,"Beef", 15,100));
        list.add(new Product(105,"Coke",6,300));

        for(int i = 0 ; i < list.size(); i++){
            System.out.println(list.get(i).toString());
        }

        for(Product x : list){
            if(x.getName().equals("Coke")){
                System.out.println("Found " + x);
            }
            else{
                System.out.println("Not found ");
            }
        }

        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getName().equals("Coke")){
                System.out.println("Found " + list.get(i).getName());
            }
            else{
                System.out.println("Not found");
            }
        }

        double sum = 0;
        for(Product p : list){
            sum += p.totalValue();
        }

        System.out.println("The total value of all products is: " + sum);

        //descending
        list.sort((a,b) -> Double.compare(b.getQuantity(),a.getQuantity()));

        for(Product p : list){
            System.out.println(p);
        }

        //remove in ArrayList

        for(int i = list.size() - 1; i >= 0 ; i--){
            if(list.get(i).getQuantity() == 0){
                list.remove(i);
            }
        }

        for(int i = 0 ; i < list.size(); i++){
            System.out.println(list.get(i).toString());
        }
    }
}