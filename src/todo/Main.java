package todo;

public class Main {
    public static void main(String[] args) {

        if (args.length == 0) {
            printHowToDoAnything();
        }

        switch (args[0]) {
            case "l":
                Tasks alltasks = new Tasks();
                alltasks.listAllTasks();
                break;
            case "a":
                System.out.println("THIS FUNCTION WILL ADD A NEW TASK");
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
