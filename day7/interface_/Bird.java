package day7.interface_;

//1 lớp có thể triển khai 1 hoặc nhiều interface cùng lúc
//lớp triển khai bắt buộc phải overriding các method abstract có trong interface
//nếu lớp triển khai là abstract class, thì có thể không cần triển khai. lý do:
//trong abstract class vẫn có thể chứa được các phương thức abstract
//implementS: từ khóa đánh dấu triển khai interface
public class Bird extends Animal implements Resize, Cloneable{
    public String color;

    public Bird(double weight, double height, String color) {
        super(weight, height);
        this.color = color;
    }

    @Override
    public void makeNoise() {
        System.out.println("Can sing");
    }

    @Override
    public void canFly() {
        System.out.println("Bird can fly");
    }

    @Override
    public Bird clone() {
        try {
            Bird clone = (Bird) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
