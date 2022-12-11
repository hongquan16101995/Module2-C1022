package baitap.product;

import java.util.Scanner;

public class MainManger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductManager productManager = new ProductManager();
        do {
            System.out.println("MENU");
            System.out.println("1. Hiển thị tất cả sản phẩm");
            System.out.println("2. Thêm sản phẩm");
            System.out.println("3. Sửa thông tin sản phẩm theo mã");
            System.out.println("4. Xóa sản phẩm theo mã");
            System.out.println("5. Tìm sản phẩm theo tên gần đúng");
            System.out.println("0. Thoát");
            System.out.println("Nhập vào lựa chọn của bạn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    productManager.displayAllProducts();
                    break;
                case 2:
                    productManager.addProduct(scanner);
                    break;
                case 3:
                    productManager.updateProductByCode(scanner);
                    break;
                case 4:
                    productManager.deleteProductByCode(scanner);
                    break;
                case 5:
                    productManager.searchProductByNameContaining(scanner);
                    break;
                case 0:
                    System.exit(0);
            }
        } while (true);
    }
}
