package ua.goit.task3;

import ua.goit.task3.utils.TextWordsParser;

import java.io.File;

public class AppRunner {

    public static final String path = "src/ua/goit/task3/words.txt";

    public static void main(String[] args) {
        File file = new File(path);
        new TextWordsParser().parseAndPrintResults(file);

    }
}
