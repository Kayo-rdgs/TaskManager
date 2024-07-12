package application;

import entities.Task;
import entities.TaskManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TaskManager taskManager = new TaskManager();

        int op = -1;
        String title;
        String desc;

        while (op != 0) {
            System.out.println("""
                    Menu:\s
                    1. View current tasks\s
                    2. Show task description\s
                    3. Mark task as completed\s
                    4. Add a task\s
                    5. Remove a task\s
                    0. Exit""");

            System.out.print("Choose an option: ");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    taskManager.listTasks();
                    break;
                case 2:
                    System.out.print("Select the task to show it's description: ");
                    int indexDesc = sc.nextInt();
                    taskManager.taskDescription(indexDesc);
                    break;
                case 3:
                    System.out.print("Select the task to be marked as completed: ");
                    int indexCompleted = sc.nextInt();
                    taskManager.markTaskAsCompleted(indexCompleted);
                    break;
                case 4:
                    System.out.print("Enter the title of the task: ");
                    title = sc.next();
                    System.out.println("Task description: ");
                    desc = sc.next();
                    taskManager.addTask(new Task(title, desc));
                    break;
                case 5:
                    System.out.println("Enter the index of the task to be deleted: ");
                    int indexToRemove = sc.nextInt();
                    taskManager.removeTask(indexToRemove);
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Wrong input, try again");
            }
        }
        sc.close();
    }
}