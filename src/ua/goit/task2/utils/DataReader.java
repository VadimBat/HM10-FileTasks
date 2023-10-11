package ua.goit.task2.utils;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class DataReader {
    private ArrayList<User> users = new ArrayList<>();

    public ArrayList<User> contentRead(File file) {
        try (Scanner scanner = new Scanner(file)){
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] parts = line.split(" ");
                String name = parts[0];
                int age = Integer.valueOf(parts[1]);
                User user = new User(name,age);
                users.add(user);
            }
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return users;
    }
}
