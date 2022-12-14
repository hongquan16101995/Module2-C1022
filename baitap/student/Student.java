package baitap.student;

import baitap.product.Product;

public class Student {
    private static int ID_AUTO = 0;
    private int id;
    private String name;
    private int age;
    private String gender;
    private String address;
    private double avgPoint;

    public Student() {
    }

    public Student(String name, int age, String gender, String address, double avgPoint) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.avgPoint = avgPoint;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getAvgPoint() {
        return avgPoint;
    }

    public void setAvgPoint(double avgPoint) {
        this.avgPoint = avgPoint;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", avgPoint=" + avgPoint +
                '}';
    }

    public void display() {
        if (this.getAvgPoint() == -1) {
            System.out.printf("%-20s%-10s%-10s%-20s%s",
                    this.name, this.age, this.gender, this.address, "" + "\n");
        } else {
            System.out.printf("%-20s%-10s%-10s%-20s%s",
                    this.name, this.age, this.gender, this.address, this.avgPoint + "\n");
        }
    }
}
