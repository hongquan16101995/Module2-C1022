package day5;

public class Animal {
    public String name1 = "Voi";
    protected String name2;
    String name3;
    private String name4;

    public static String demo = "Thủ Lệ";

    public static void displayName() {
        //pt static gọi được thuộc tính static
        System.out.println(demo);
        //nhưng không gọi được thuộc tính non-static
//        System.out.println(name1);
    }

    public void display() {
        //pt non-static gọi được thuộc tính non-static
        System.out.println(name1);
        //và gọi được cả thuộc tính static
        System.out.println(demo);
    }
}
