package day18;

public class Test {
    //synchronized: hỗ trợ cho phương thức, ở cùng 1 thời điểm, chỉ có 1 luồng được phép gọi đến nó
    synchronized public void m1() {
        for (int i = 1; i < 100; i++) {
            System.out.println(i);
        }
    }
}
