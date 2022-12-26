package day16;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
//        ArrayList
        File source = new File("C:\\Users\\ADMIN\\Desktop\\FirstProject\\src\\day16\\files\\source");
        File dest = new File("C:\\Users\\ADMIN\\Desktop\\FirstProject\\src\\day16\\files\\dest");
        Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }
}
