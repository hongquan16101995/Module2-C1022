package day5;

public class MainAnimal {
    public static void main(String[] args) {
        //đối tượng 1
        Animal animal = new Animal();
        //đối tượng 2
        Animal animal1 = new Animal();
        //test access
        System.out.println(animal.name1);
        //truy xuất thuộc tính static trực tiếp từ lớp
        System.out.println(Animal.demo);
        //đổi thuộc tính của static từ đối tượng 1
        animal.demo = "Hòa Bình";
        //thuộc tính static của đối tượng 2 cũng bị thay đổi theo
        System.out.println(animal.demo);
        System.out.println(animal1.demo);
        //đổi thuộc tính non-static của đối tượng 1
        animal.name1 = "Hổ";
        //không làm thay đổi thuộc tính non-static của đối tượng2
        System.out.println(animal.name1);
        System.out.println(animal1.name1);
    }
}
