package day4;

import day5.Animal;

//test access protected từ package day5
public class MainAnimal extends Animal{
    public static void main(String[] args) {
        Animal animal = new Animal();
    }

    public void displayProtected() {
        System.out.println(name2);
    }
}
