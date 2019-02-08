package todo;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {

        if (args.length == 0) {
            printHowToDoAnything();
        }
        Tasks allTasks = new Tasks();

        switch (args[0]) {
            case "-l":
                allTasks.listAllTasks();
                break;
            case "-a":
                allTasks.addTask();
                System.out.println("Task has been added");
        }
    }
    public static void printHowToDoAnything(){
        System.out.println("Command Line Todo application\n" +
                "=============================\n" +
                "\n" +
                "Command line arguments:\n" +
                " -l   Lists all the tasks\n" +
                " -a   Adds a new task\n" +
                " -r   Removes a task\n" +
                " -c   Completes a task");




    }

}
