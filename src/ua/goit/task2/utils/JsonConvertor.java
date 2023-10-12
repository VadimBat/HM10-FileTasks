package ua.goit.task2.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.util.ArrayList;

public class JsonConvertor {
    public void convertAndPrintResults(File file){

        DataReader usersData = new DataReader();
        ArrayList<User> users = new ArrayList<>();
        users = usersData.contentRead(file);
        System.out.println(users);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(users);
        System.out.println(json);

        try (OutputStream fileOutputStream = new FileOutputStream("src/ua/goit/task2/files/user.json");
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)){
            objectOutputStream.writeObject(json);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
