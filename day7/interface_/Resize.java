package day7.interface_;

//interface: được coi là 1 hợp đồng, bản thiết kế phương thức chung để triển khai riêng biệt sau này
//không tạo được đối tượng cụ thẻ từ interface: do cần phải triển khai các phương thức trừu tượng của nó
//trong interface, 100% các phương thức là abstrac + public
//các thuộc tính nếu có sẽ là dạng hằng số + static
public interface Resize {
    void canFly();
}
