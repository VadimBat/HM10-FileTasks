package ua.goit.task1.read;

import ua.goit.task1.read.Readable;

import java.io.File;
import java.util.Scanner;
import java.util.StringJoiner;

public class ContentReader implements Readable {
    @Override
    public String contentRead(File file) {
        StringJoiner result = new StringJoiner("\n");

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
