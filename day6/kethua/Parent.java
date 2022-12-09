package day6.kethua;

public class Parent extends SuperParent{
    //triển khai ghi đè: là kỹ thuật cho phép thay đổi phần thân của phương thức kế thừa
    //phương thức ghi đè: phải có cùng tên, cùng tham số, cùng giá trị trả về

    //annotation @Override: đánh đấu đây là ghi đè, có thể không cần
    @Override
    public void m1() {
        //super: là từ khóa áp dụng trong kế thừa, để gọi đến 1 thành phần của lớp cha
        System.out.println("Đây là parent");
    }
}
