interface Animal{
    public void getName();
    public void makeSound();
    public void eat();
    public void sleep();
}

class Dog implements Animal{

    private String name;


    public Dog(String name){
        this.name = name;
    }

    public void getName(){
        System.out.println("The dog's name is " + name);
    }

    public void makeSound(){
        System.out.println("It sounds Gau gau");
    }

    public void eat(){
        System.out.println("It's food is meat");
    }

    public void sleep(){
        System.out.println("Sleep around 6 hours");
    }

    public void showAll(){
        getName();
        makeSound();
        eat();
        sleep();
        System.out.println();
    }
}

class Cat implements Animal{
    private String name;

    public Cat(String name){
        this.name = name;
    }

    public void getName(){
        System.out.println("The cat's name is " + name);
    }

    public void makeSound(){
        System.out.println("It sounds Meow Meow");
    }

    public void eat(){
        System.out.println("It's food is fish");
    }

    public void sleep(){
        System.out.println("Sleep around 5 hours");
    }

    public void showAll(){
        getName();
        makeSound();
        eat();
        sleep();
        System.out.println();
    }
}

public class Main{
    public static void main(String[] args){

        Dog dog = new Dog("King");
        dog.showAll();

        Cat cat = new Cat("Queen");
        cat.showAll();
    }
}