import java.util.Scanner;

public class HabitTracker {
    
    public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);

    //Get user name
    System.out.println("What's you name?");
    String name = scanner.nextLine();

    //Get user habits amount
    System.out.println("How many habits do you want to track?");
    int numOfHabits = scanner.nextInt();
    scanner.nextLine(); // consume leftover newline


    String[] habitNames = new String[numOfHabits];
    String[] habitStatus = new String[numOfHabits];

    

    //Loop to store habits
    
    for (int i = 0; i < numOfHabits; i++){
    
    //Ask for habit name
    System.out.println("What habit do you want to track?");
    habitNames[i] = scanner.nextLine();


    //Ask if completed
    System.out.println("Did you complete it? (Y/N)");
    habitStatus[i] = scanner.nextLine();
   }
    // Print summary
        System.out.println("\nHabit Summary for " + name + ":");
        for (int i = 0; i < numOfHabits; i++) {
            System.out.println("Habit: " + habitNames[i] + " | Completed: " + habitStatus[i]);
        }
    }
}