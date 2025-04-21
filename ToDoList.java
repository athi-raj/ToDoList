import java.util.ArrayList;
import java.util.Scanner;

public class ToDoListApp {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- TO-DO LIST MENU ---");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Remove Task");
            System.out.println("4. Exit");
            System.out.print("Enter your choice 1-4: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter your task: ");
                    String task = scanner.nextLine();
                    tasks.add(task);
                    System.out.println("Task added sucessfully!");
                    break;

                case 2:
                    System.out.println("\n--- Your Tasks are ---");
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks found.\n Enter 1 to add new task");
                    } else {
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter task number to remove: ");
                    int index = scanner.nextInt();
                    if (index >= 1 && index <= tasks.size()) {
                        tasks.remove(index - 1);
                        System.out.println("Task removed.");
                    } else {
                        System.out.println("Enter a valid task number!");
                    }
                    break;

                case 4:
                    System.out.println("You selects to exit!\n Goodbye...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 4);
    }
}
