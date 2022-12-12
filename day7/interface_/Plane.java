package day7.interface_;

public class Plane extends Vehicle implements Resize{
    @Override
    public void canFly() {
        System.out.println("Plane can fly");
    }
}
