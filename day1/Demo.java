package day1;

//class: quy định đây là 1 lớp trong chương trình Java đang viết
//day1.Demo: tên lớp đang viết
public class Demo {
    //public: quy định về phạm vi sử dụng của thành phần được đánh dấu
    //static: từ khóa quy định thành phần static, là thành phần thuộc về lớp
    //void: kiểu dữ liệu trả về của phương thức
    //main: tên của phương thức
    //String[] args: tham số của phương thức;
    //args = arguments; String[]: kiểu dữ liệu mảng String

    //javac day1.Demo: chuyển từ mã .java => .class
    //java day1.Demo.class: chạy file bytecode của Java trong cmd
    //psvm / main / public static void main(String[] args): được gọi là siêu main của 1 chương trình Java
    //là thành phần được JVM tìm đến đầu tiên khi khởi chạy chương trình Java
    public static void main(String[] args) {
        System.out.println("day1.Hello");
        Test.main(new String[]{"a"});
    }

    public int demo() {
        return 1;
    }
}
