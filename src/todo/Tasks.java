package todo;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Tasks {

    public void listAllTasks(){

        try {
            Path filePath = Paths.get("./tasks.txt");
            ArrayList<String> contentOfTasks = new ArrayList<>();
            contentOfTasks.addAll(Files.readAllLines(filePath));
            int listNumber;
            for (int i = 0; i < contentOfTasks.size() ; i++) {
                listNumber = i+1;
                System.out.println(listNumber + " - " + contentOfTasks.get(i));
            }

        } catch (Exception e){
            System.out.println("File not found...");
        }

        /*System.out.println("\n" +
                "1 - Walk the dog\n" +
                "2 - Buy milk\n" +
                "3 - Do homework");*/
    }
}
