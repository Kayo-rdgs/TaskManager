package entities;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {

    private List<Task> tasks;

    public TaskManager() {
        tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void removeTask(int index ) {
        if (index >= 0 && index < tasks.size() + 1) {
            tasks.remove(index - 1);
        } else {
        System.out.println("Invalid Index.");
        }
    }

    public void listTasks() {
        for (Task task : tasks) {
            String completed;
            if (task.isCompleted()){
                completed = "Yes";
            } else {
                completed = "No";
            }
            System.out.println("Task: " + task.getTitle() + " Completed: " + completed);
        }
    }

    public void taskDescription(int index) {
        if (index > 0 && index <= tasks.size()) {
            System.out.println("Task: " + tasks.get(index - 1).getTitle() + ", Description: " +  (tasks.get(index - 1).getDescription()));
        } else {
            System.out.println("Invalid Index.");
        }
    }

    public void markTaskAsCompleted(int index) {
        if (index > 0 && index <= tasks.size()) {
            tasks.get(index - 1).setCompleted();
        } else {
            System.out.println("Invalid Index.");
        }
    }
}
