package day6.kethua;

public class Main {
    public static void main(String[] args) {
//        //child is a SuperParent : cái này đúng
//        Child child = new Child();
//        Child2 child2 = new Child2();
//        child.m1();
//        child2.m1();

        //casting
        Parent parent = new Parent();
        Parent parent1 = new Child();
        parent.m1();
        parent1.m1();
        //ép kiểu tường minh: ép từ kiểu cha về kiểu con, khi mà đối tượng thực tế là kiểu con th
        //downcasting
        Child child = (Child) parent1;
        child.m2();

        //ép kiểu ngầm định: ép từ kiểu con về kiểu cha
        //upcasting: khi đối tượng thuộc is-a của lớp
        Child child1 = new Child();
        Parent parent2 = (Parent) child1;

        //lỗi ClassCastException: lỗi mà JVM tin tưởng lập trình viên
        Parent parent3 = new Parent();
        Child child2 = (Child) parent3;
        child2.m2();

        //instanceof: toán tử kiểm tra kiểu dữ liệu thực tế của biến
    }
}
