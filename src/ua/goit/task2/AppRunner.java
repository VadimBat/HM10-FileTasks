package ua.goit.task2;

import ua.goit.task2.utils.JsonConvertor;

import java.io.*;

public class AppRunner {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        File file = new File("src/ua/goit/task2/files/file.txt");

        new JsonConvertor().convertAndPrintResults(file);

    }
}
