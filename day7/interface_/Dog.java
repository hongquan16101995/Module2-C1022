package day7.interface_;

public class Dog extends Animal{
    private String boobs;

    public Dog(double weight, double height) {
        super(weight, height);
    }

    @Override
    public void makeNoise() {
        System.out.println("Go go");
    }
}
