package oop.laboratory2.task1_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Display> displayList = new ArrayList<>();

        displayList.add(new Display( 27.0, 23.5, 163,"Dell UltraSharp U2720Q"));
        displayList.add(new Display(27.0, 23.5, 163, "LG 27UK850-W"));
        displayList.add(new Display(32.0, 28.0, 137, "ASUS ProArt PA32UCX"));
        displayList.add(new Display(27.0, 23.5, 144,"Samsung Odyssey G7"));
        displayList.add(new Display(32.0, 28.0, 137, "BenQ PD3220U"));

        Assistant assistant = new Assistant("Vasile", displayList);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("===== Display Assistant Menu =====");
            System.out.println("1. Show Best Display");
            System.out.println("2. Buy Display");
            System.out.println("3. Print Available Displays");
            System.out.println("4. Get Recommendation");
            System.out.println("5. Exit");
            System.out.print("Choose an option (1-5): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    // Show Best Display
                    assistant.assist();
                    break;

                case 2:
                    // Buy Display
                    System.out.print("Enter the name of the display to buy: ");
                    String displayName = scanner.nextLine();
                    // Assuming Display has a method to find a display by name
                    Display displayToBuy = assistant.findDisplayByName(displayName);
                    assistant.buyDisplay(displayToBuy);
                    break;

                case 3:
                    // Print Available Displays
                    assistant.printDisplay();
                    break;

                case 4:
                    // Get Recommendation
                    System.out.print("Enter the specifiactions for the display: ");
                    System.out.println();
                    System.out.print("Enter the height: ");
                    double height = scanner.nextDouble();
                    System.out.print("Enter the width: ");
                    double width = scanner.nextDouble();
                    System.out.print("Enter the ppi: ");
                    float ppi = scanner.nextFloat();

                    Display displayToRecommend = new Display(width, height, ppi, "");
                    assistant.getRecommandation(displayToRecommend);
                    break;

                case 5:
                    // Exit
                    System.out.println("Exiting the menu. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            System.out.println();
        }
    }
}
