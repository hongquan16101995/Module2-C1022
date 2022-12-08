package day5;

public class Main {
    static Animal animal;
    static {
        System.out.println("Bye");
        animal = new Animal();
    }

    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println(animal.name1);
    }
}
