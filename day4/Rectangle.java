package day4;

//mọi lớp trong Java đều kế thừa từ object
public class Rectangle {
    private double width;
    private double height;
    String color;

    //nếu không có constructor được định danh,
    //thì lớp có 1 constructor mặc định là loại không tham số

    //khi định danh 1 constructor bất kỳ, sẽ tự động bỏ đo constructor mặc định
    public Rectangle() {}

    public Rectangle(double width) {
        this.width = width;
    }

    //overloading method: là kỹ thuật cho phép thiết kế chương trình
    //trong 1 lớp có chứa nhiều phương thức cùng tên, khác nhau về tham số
    //khác về kiểu dữ liệu tham số
    //khác về số lượng tham số
    //khác về vị trí kiểu dữ liệu tham số
    public Rectangle(String color) {
        this.color = color;
    }

    public Rectangle(double height, String color) {
        this.height = height;
        this.color = color;
    }

    public Rectangle(String color, double height) {
        this.height = height;
        this.color = color;
    }

    public Rectangle(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    //getter: lấy giá trị của thuộc tính của đối tượng cụ thể
    //setter: thay đổi giá trị của thuộc tính của đối tượng cụ thể

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
