package day6;

public class Main {
    public static void main(String[] args) {
        Type type = new Type("Động vật ăn cỏ");
        Type type1 = new Type("Động vật ăn thịt");

        Animal animal = new Animal("Hổ", 3, type1);
        Animal animal1 = new Animal("Thỏ", 1, type);
        System.out.println(animal.getName() + " là 1 " + animal.getType().getName());
    }
}
