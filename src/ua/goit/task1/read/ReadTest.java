package ua.goit.task1.read;

import java.io.File;

public class ReadTest {
    public static void main(String[] args) {
        Readable reader = new ContentReader();
        File file = new File("src/ua/goit/task1/file.txt");
        String content = reader.contentRead(file);
        System.out.println(content);
    }
}
