package day7.interface_;

public class Animal {
    public double weight;
    public double height;

    public Animal(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public void makeNoise() {
        System.out.println("Can noise");
    }
}
