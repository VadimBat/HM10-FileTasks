package ua.goit.task1;

import ua.goit.task1.validate.ValidatorEngine;

import java.io.File;

public class AppRunner {

    public static final String path = "src/ua/goit/task1/file.txt";
    public static void main(String[] args) {
        File file = new File(path);
        new ValidatorEngine().validateAndPrintResults(file);
    }
}
