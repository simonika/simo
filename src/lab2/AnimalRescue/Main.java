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

        AnimalFood food = new AnimalFood();
        System.out.println(food.getFoodName());
        System.out.println(food.getAvailability());
        System.out.println(food.getQuantity());
        System.out.println(food.getQuantity());


    }



}
