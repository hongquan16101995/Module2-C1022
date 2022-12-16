package day10;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MainMap {
    public static void main(String[] args) {
        //key của map là 1 Integer, không trùng lặp
        //value của map là 1 String, có thể trùng lặp
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "abc");
        map.put(2, "xyz");
        //thêm giá trị cho 1 key đã tồn tại
        map.put(1, "C1022I1");

        //phương thức trả về tập hợp Key của map
        Set<Integer> keys =  map.keySet();
        //duyệt key và dùng phương thức của map để lấy value tương ứng
        for (Integer i : keys) {
            System.out.println("Key: " + i + "; value: " + map.get(i));
        }

        HashMap<Integer, Customer> customerHashMap = new HashMap<>();
        Customer customer1 = new Customer(1, "Ngọc");
        Customer customer2 = new Customer(2, "Linh");
        customerHashMap.put(customer1.getId(), customer1);
        customerHashMap.put(customer2.getId(), customer2);
        customer2.setName("Duy");
        customerHashMap.put(customer2.getId(), customer2);
        //duyệt trực tiếp map thông qua các entry của nó
        for (Map.Entry<Integer, Customer> a : customerHashMap.entrySet()) {
            System.out.println("Key: " + a.getKey() + "; value: " + a.getValue());
        }
    }
}
