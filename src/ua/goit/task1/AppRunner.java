package ua.goit.task1;

import ua.goit.task1.validate.ValidatorEngine;

import java.io.File;

public class AppRunner {
    public static void main(String[] args) {
        File file = new File("src/ua/goit/task1/file.txt");
        new ValidatorEngine().validateAndPrintResults(file);
    }
}
