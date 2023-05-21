import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        while (choice == 1) {
            System.out.println("Enter student's marks (out of 100):");
            int marks = scanner.nextInt();

            if (marks >= 90) {
                System.out.println("This is Good");
            } else if (marks >= 60) {
                System.out.println("This is also Good");
            } else if (marks >= 0) {
                System.out.println("This is Good as well");
            } else {
                System.out.println("Invalid input. Marks should be between 0 and 100.");
            }

            System.out.println("Enter 1 to continue or 0 to stop:");
            choice = scanner.nextInt();
        }

        System.out.println("Program stopped. Thank you!");
        scanner.close();
    }
}
