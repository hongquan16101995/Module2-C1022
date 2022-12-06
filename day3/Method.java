package day3;

public class Method {

    //public: quy định phạm vi sử dụng của phương thức (học bài 5)
    //void: kiểu dữ liệu trả về của phương thức không có return
    //display: tên của phương thức
    //String a: kiểu dữ liệu + tên của tham số
    public void display(String a, int b) {
        System.out.println(a);
    }

    public void display(String a, String b) {
        System.out.println(a);
    }

    public void display(int b, String a) {
        System.out.println(a);
    }

    public void display(String a) {
        System.out.println(a);
    }

    public int getNumber() {
        return 100;
    }

    //boolean: kiểu dữ liệu trả về của phương thức
    public boolean isTrue(boolean demo) {
        return demo;
    }
}
