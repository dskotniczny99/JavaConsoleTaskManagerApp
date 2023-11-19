package Task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private static final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    static List<Task> tasks = new ArrayList<>();

    public static void removeTask() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks to remove");
            return;
        }

        System.out.println("Select the task to delete in order: [1 - " + tasks.size() + " ]");
        printAllTasks();

        try {
            int removeChoice = Integer.parseInt(bufferedReader.readLine()) - 1;

            if (isValidChoice(removeChoice)) {
                TaskManager.tasks.remove(removeChoice);
                FileHandler.saveTasksToFile(tasks);
                System.out.println("Task removed successfully.");
            } else {
                System.out.println("Invalid choice. Please enter a valid number.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        } catch (IOException e) {
            System.err.println("Error removing task: " + e.getMessage());
        }
    }

    private static boolean isValidChoice(int choice) {
        return choice >= 0 && choice < tasks.size();
    }

    public static void printAllTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks to do");
        } else {
            for (Task task : tasks) {
                System.out.println(task);
            }
        }
    }

    public static void addNewTask(Task obj) {
        tasks.add(obj);
        System.out.println("Added new task");
    }
}
