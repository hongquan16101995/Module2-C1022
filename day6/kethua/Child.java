package day6.kethua;

//từ khóa extends để đánh dấu class bên trái kế thừa class bên phải của từ khóa
public class Child extends Parent{
    @Override
    public void m1() {
        System.out.println("Đây là con 1 (child)");
    }

    public void m2() {
        System.out.println("Phương thức nâng cấp");
    }
}
