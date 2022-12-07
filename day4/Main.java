package day4;

public class Main {
    public static void main(String[] args) {
        //cú pháp khởi tạo đối tượng; giống biến
        //new: từ khóa gọi đến hàm khởi tạo của lớp tương ứng
        Rectangle rectangle = new Rectangle();
        Rectangle rectangle1 = new Rectangle(10.0);
        System.out.println(rectangle.getWidth());
        System.out.println(rectangle1.getWidth());

        //hàm trả về thời gian hiện tại của hệ thống, tính theo milisecond, kld: long, time: 1-1-1970
        System.out.println(System.currentTimeMillis());
    }
}
