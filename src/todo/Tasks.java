package todo;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

public class Tasks {

    ArrayList<String> contentOfTasks = new ArrayList<>();

    public void listAllTasks(){
        try {
            Path filePath = Paths.get("./tasks.txt");
            contentOfTasks.addAll(Files.readAllLines(filePath));
        } catch (Exception e){
            System.out.println("File not found...");
        }
        int listNumber;
        if (contentOfTasks.size() == 0){
            System.out.println("No todos for today! :)");
        }else
        for (int i = 0; i < contentOfTasks.size() ; i++) {
            listNumber = i + 1;
            System.out.println(listNumber + " - " + contentOfTasks.get(i));
        }
    }

    public void addTask(){
        try {
            Path filePath = Paths.get("./tasks.txt");
            contentOfTasks.addAll(Files.readAllLines(filePath));
            Files.write(filePath, "\nFeed the monkey".getBytes(), StandardOpenOption.APPEND);
        } catch (Exception e) {
            System.out.println("File not found...");
        }
    }

}
