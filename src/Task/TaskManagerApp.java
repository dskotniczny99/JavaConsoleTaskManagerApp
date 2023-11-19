package Task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class TaskManagerApp {
    public static void main(String[] args) {

        FileHandler.loadFromFile();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int menuChoice = 0;
        try {

            do {
                System.out.println("\nEnter a number from 1 to 4 depending on what you want to do\n");
                System.out.println("1 -> ADD TASK\n2 -> REMOVE TASK\n3 -> SHOW TASKS\n4 -> SAVE TASKS\n0 -> EXIT");

                try {
                    System.out.print("Enter your choice: ");
                    menuChoice = Integer.parseInt(bufferedReader.readLine());

                    switch (menuChoice) {
                        case 1:
                            System.out.println("Set the title of the task");
                            String title = bufferedReader.readLine();

                            System.out.println("Set the task content");
                            String content = bufferedReader.readLine();

                            System.out.println("Set the task priority");
                            String priority = bufferedReader.readLine();

                            Task task = new Task(title, content, priority);
                            TaskManager.addNewTask(task);
                            break;

                        case 2:
                            TaskManager.removeTask();
                            break;

                        case 3:
                            TaskManager.printAllTasks();
                            break;

                        case 4:
                            FileHandler.saveTasksToFile(TaskManager.tasks);
                            break;

                        case 0:
                            System.out.println("Exiting program. Goodbye!");
                            break;

                        default:
                            System.out.println("Incorrect selection, please select again.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Incorrect selection, please choose again.");
                }

            } while (menuChoice != 0);
        } catch (IOException e) {
            System.err.println("IOException occurred: " + e.getMessage());
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                System.err.println("Error closing BufferedReader: " + e.getMessage());
            }
        }
    }
}
