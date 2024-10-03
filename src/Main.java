class Animal {
    public int age;
    public String gender;

    public Animal(int age, String gender){
        this.age = age;
        this.gender = gender;
    }
    public void isAnimal(){
        System.out.println("I am an animal!");
    }
    public void mate(){
        System.out.println("The animal has generated an offspring.");
    }
    
}
class Fish extends Animal{
    private double sizeinFeet;

    public Fish(int age, String gender, double sizeinFeet){
        super(age, gender);
        this.sizeinFeet = sizeinFeet;
    }
    private void canEat(){
        System.out.println("I can eat food.");
    }
    public void isAnimal(){
        System.out.println("I am a fish!");
    }
}

class Zebra extends Animal{
    public boolean isWild;
    
    public Zebra(int age, String gender, boolean isWild){
        super(age, gender);
        this.isWild = isWild;
    }
    public void run(){
        System.out.println("The zebra is running!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal(5,"male");
        System.out.println("This animal is a " + myAnimal.gender + " and is " + myAnimal.age + " years old.");
        myAnimal.isAnimal();
        myAnimal.mate();
        Fish myFish = new Fish(5, "female", 1.5);
        Zebra myZebra = new Zebra(10, "male", true);
        myZebra.run();
    }
}