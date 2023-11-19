package Task;

import java.io.*;
import java.util.List;

class FileHandler implements Serializable {

    private static final String FILE_PATH = "tasks.ser";

    public static void saveTasksToFile(List<Task> tasks) {

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
            objectOutputStream.writeObject(tasks);
            System.out.println("Tasks File updated");
        } catch (IOException e) {
            throw new RuntimeException("Error saving tasks to file: " + e.getMessage(), e);
        }
    }

    public static void loadFromFile() {
        File file = new File(FileHandler.FILE_PATH);
        if(file.exists() && file.length() > 0) {
            try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(FILE_PATH))) {
                try {
                    Object readObject = objectInputStream.readObject();
                    if (readObject instanceof List) {
                        List<Task> loadedTasks = (List<Task>) readObject;
                        if (!loadedTasks.isEmpty()) {
                            TaskManager.tasks = loadedTasks;
                            TaskManager.printAllTasks();
                        }
                    } else {
                        System.out.println("Invalid data found in the file.");
                    }
                } catch (FileNotFoundException e) {
                    throw new RuntimeException("File not found: " + FILE_PATH, e);
                } catch (IOException | ClassNotFoundException e) {
                    throw new RuntimeException("Error loading tasks from file: " + e.getMessage(), e);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}