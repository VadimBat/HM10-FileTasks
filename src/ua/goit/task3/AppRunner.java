package ua.goit.task3;

import ua.goit.task3.utils.TextWordsParser;

import java.io.File;

public class AppRunner {

    public static void main(String[] args) {
        File file = new File("src/ua/goit/task3/words.txt");
        new TextWordsParser().parseAndPrintResults(file);

    }
}
