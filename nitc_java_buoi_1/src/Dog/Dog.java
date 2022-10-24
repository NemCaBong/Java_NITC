package Dog;

public class Dog {
    public String breed;
    public String color;
    public String size;
    public int age;

    public Dog() {
    }

    public Dog(String breed, String color, String size, int age) {
        this.breed = breed;
        this.color = color;
        this.size = size;
        this.age = age;
    }

    void eat() {
        System.out.println("Eating....");
    }

    void sleep() {
        System.out.println("Sleeping....");
    }

    void play() {
        System.out.println("Playing....");
    }
}
