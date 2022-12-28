package day19;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegex {
    public static void main(String[] args) {
//        //Pattern: biên dịch mã Regex thành dạng để so khớp, thông qua phương thức compile()
//        //Matcher: dùng tạo đối tượng so khớp mã Regex với String được truyền vào
//        //thông qua phương thức matches(): trả về giá trị boolean (true/false)
//
//        //tạo Regex
//        String regex = "[a-z]+";
//        //tạo đối tượng Pattern chuyển String Regex => mã Regex
//        Pattern pattern = Pattern.compile(regex);
//        System.out.println("Nhập 1 giá trị bất kỳ: ");
//        String input = new Scanner(System.in).nextLine();
//        //tạo đối tượng Matcher để so khớp
//        Matcher matcher = pattern.matcher(input);
//        //phương thức matches() trả về kết quả sau khi so khớp Regex và chuỗi Input
//        if (matcher.matches()) {
//            System.out.println("Chuỗi khớp với Regex");
//        } else {
//            System.out.println("Chuỗi sai định dạng");
//        }


        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập 1 số tuổi:");
//        int a = scanner.nextInt();
//        scanner.nextLine();
        String a = scanner.nextLine();
        String regex = "^[0-9]{2}+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(a);
        if (matcher.matches()) {
            int age = Integer.parseInt(a);
            System.out.println("Tuổi phù hợp là: " + age);
        } else {
            System.out.println("Tuổi không phù hợp");
        }

        System.out.println("Nhập 1 chữ:");
        String b = scanner.nextLine();
        System.out.println("Số này: " + a);
        System.out.println("Chữ này: " + b);
    }
}
