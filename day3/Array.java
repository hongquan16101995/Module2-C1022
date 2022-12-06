package day3;

public class Array {
    public static void main(String[] args) {
        //c1: khai báo trực tiếp
        int[] ints = {1,2,3};

        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }

        //c2: khai báo thông qua từ khóa new
        int[] ints1 = new int[3];
        ints1[0] = 11;
        ints1[1] = 22;
        ints1[2] = 33;

        for (int i = 0; i < ints1.length; i++) {
            System.out.println(ints1[i]);
        }

        //kết hợp
        int[] ints2 = new int[]{1,2,3};

        //thay đổi vị trí của ký hiệu mảng
        int[] ints3;
        int ints4[];

        //mảng 2 chiều
        int[][] ints5 = new int[5][5];

        //thay đổi vị trí của ký hiệu mảng
        int[][] ints6;
        int ints7[][];
        int []ints8[];

        Array array = new Array();
        array.demoObject();
    }

    public void demoObject() {
        Method[] methods = new Method[2];
        methods[0] = new Method();
        methods[0].display("C0822I1");
    }
}
