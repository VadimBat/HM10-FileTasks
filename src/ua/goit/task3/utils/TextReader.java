package ua.goit.task3.utils;

import java.io.File;
import java.util.*;

public class TextReader {

    StringJoiner result = new StringJoiner("\n");

    public String contentRead(File file) {
        try (Scanner scanner = new Scanner(file)){
            while(scanner.hasNextLine()){
                result.add(scanner.nextLine());
            }
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return result.toString();
    }
}
