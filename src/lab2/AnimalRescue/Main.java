package lab2.AnimalRescue;

public class Main {
    public static void main (String[] args){
       Dog dog = new Dog();
        System.out.println(dog.getName());
        System.out.println(dog.getAge());
        System.out.println(dog.getWeight());
        System.out.println(dog.getBreed());
        dog.eat();
        dog.drink();
        dog.play();


    }



}
