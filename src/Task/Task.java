package Task;

import java.io.Serializable;

public record Task(String title, String content, String priority) implements Serializable {

    public Task {
        if (title == null || content == null || priority == null || title.isEmpty() || content.isEmpty() || priority.isEmpty()) {
            throw new IllegalArgumentException("Title, content, and priority cannot be null or empty");
        }
    }

    @Override
    public String toString() {
        return "Task: {" +
                "\n    title='" + title + '\'' +
                "\n    content='" + content + '\'' +
                "\n    priority='" + priority + '\'' +
                "\n}";
    }
}
