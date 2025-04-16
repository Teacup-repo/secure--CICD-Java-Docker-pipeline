import java.util.ArrayList;
import java.util.List;

/**
 * A simple To-Do List application.
 */
public class TodoList {
    private final List<String> tasks = new ArrayList<>();

    /**
     * Adds a new task to the list.
     * @param task The task description.
     * @return true if the task was added, false if the task was empty.
     */
    public boolean addTask(String task) {
        if (task == null || task.trim().isEmpty()) {
            return false;
        }
        tasks.add(task);
        return true;
    }

    /**
     * Removes a task by index.
     * @param index The index of the task to remove.
     * @return true if removed successfully, false if the index is invalid.
     */
    public boolean removeTask(int index) {
        if (index < 0 || index >= tasks.size()) {
            return false;
        }
        tasks.remove(index);
        return true;
    }

    /**
     * Gets the list of tasks.
     * @return A list of tasks.
     */
    public List<String> getTasks() {
        return new ArrayList<>(tasks);
    }

    /**
     * Main method for simple demonstration.
     */
    public static void main(String[] args) {
        TodoList todoList = new TodoList();
        
        todoList.addTask("Buy groceries");
        todoList.addTask("Finish homework");
        
        System.out.println("To-Do List:");
        for (String task : todoList.getTasks()) {
            System.out.println("- " + task);
        }
    }
}
