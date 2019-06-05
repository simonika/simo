package lab2.AnimalRescue;

public class Dog {
    private String breed = "Husky";
    private String age = "2 years";
    private String heigh = "0.8 m";
    private String weight = "12 kg";
    private String name = "Puggy";

    public void eat() {
        System.out.println(name + " is eating Pedigree");

    }

    public void drink() {
        System.out.println(name + " is drinking water");
    }

    public void play() {
        System.out.println(name + " is playing frisbee");
    }

    public void sleep() {
        System.out.println(name + " is snoring");
    }

    public String getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    public String getHeigh() {
        return heigh;
    }

    public String getName() {
        return name;
    }

    public String getWeight() {
        return weight;
    }
}
