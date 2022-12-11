package baitap.product;

import java.util.Scanner;

public class ProductManager {
    private Product[] products;
    private static int INDEX = 0;

    public ProductManager() {
        products = new Product[10];
    }

    private Product createProduct(Scanner scanner) {
        System.out.println("Nhập mã của sản phẩm thứ " + (INDEX + 1));
        String code = scanner.nextLine();
        System.out.println("Nhập tên của sản phẩm thứ " + (INDEX + 1));
        String name = scanner.nextLine();
        System.out.println("Nhập giá của sản phẩm thứ " + (INDEX + 1));
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập loại của sản phẩm thứ " + (INDEX + 1));
        String type = scanner.nextLine();
        return new Product(code, name, price, type);
    }

    public void addProduct(Scanner scanner) {
        if (INDEX < products.length) {
            products[INDEX] = createProduct(scanner);
            INDEX++;
        } else {
            System.out.println("Danh sách sản phẩm đã đầy!");
        }
    }

    private boolean checkExistByCode(String code) {
        for (Product p : products) {
            if (p != null) {
                if (p.getCode().equals(code)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void updateProductByCode(Scanner scanner) {
        System.out.println("Nhập mã sản phẩm muốn sửa: ");
        String code = scanner.nextLine();
        if (checkExistByCode(code)) {
            for (Product p : products) {
                if (p.getCode().equals(code)) {
//                    Product productUpdate = p;
                    System.out.println("Nhập tên mới cho sản phẩm: " + p.getName());
                    String name = scanner.nextLine();
                    if (!name.equals("")) {
                        p.setName(name);
                    }
                    System.out.println("Nhập giá mới cho sản phẩm: " + p.getPrice());
                    String price = scanner.nextLine();
                    if (!price.equals("")) {
                        p.setPrice(Double.parseDouble(price));
                    }
                    System.out.println("Nhập loại mới cho sản phẩm: " + p.getType());
                    String type = scanner.nextLine();
                    if (!type.equals("")) {
                        p.setType(type);
                    }
                    System.out.println("Sửa thành công!");
                    System.out.println(p);
                    break;
                }
            }
        } else {
            System.out.println("Không có sản phẩm có mã tương ứng!");
        }
    }

    public void deleteProductByCode(Scanner scanner) {
        System.out.println("Nhập mã sản phẩm muốn xóa: ");
        String code = scanner.nextLine();
        if (checkExistByCode(code)) {
            for (int i = 0; i < products.length; i++) {
                if (products[i].getCode().equals(code)) {
                    Product productDelete = products[i];
                    for (int j = i; j < products.length - 1; j++) {
                        products[j] = products[j + 1];
                    }
                    System.out.println("Xóa thành công sản phẩm!");
                    System.out.println(productDelete);
                    break;
                }
            }
        } else {
            System.out.println("Không có sản phẩm có mã tương ứng!");
        }
    }

    public void searchProductByNameContaining(Scanner scanner) {
        System.out.println("Nhập tên sản phẩm muốn tìm: ");
        String nameSearch = scanner.nextLine();
        boolean check = false;
        for (Product p : products) {
            if (p != null) {
                if (p.getName().toLowerCase().contains(nameSearch.toLowerCase())) {
                    check = true;
                    System.out.println(p);
                }
            }
        }
        if (!check) {
            System.out.println("Không có sản phẩm có tên chứa từ khóa tương ứng!");
        }
    }

    public void displayAllProducts() {
        boolean check = false;
        for (Product p : products) {
            if (p != null) {
                System.out.println(p);
                check = true;
            }
        }
        if (!check) {
            System.out.println("Danh sách hiện không có sản phẩm nào!");
        }
    }
}
