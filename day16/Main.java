package day16;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
//        ArrayList
//        File source = new File("C:\\Users\\ADMIN\\Desktop\\FirstProject\\src\\day16\\files\\source");
//        File dest = new File("C:\\Users\\ADMIN\\Desktop\\FirstProject\\src\\day16\\files\\dest");
//        Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
//        write("C:\\Users\\ADMIN\\Desktop\\FirstProject\\src\\day16\\files\\dest");
        read("C:\\Users\\ADMIN\\Desktop\\FirstProject\\src\\day16\\files\\dest");
    }

    public static void write(String path) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject("a");
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void read(String path) {
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            if (fileInputStream.available() != 0) {
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                Object object = objectInputStream.readObject();
                objectInputStream.close();
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
