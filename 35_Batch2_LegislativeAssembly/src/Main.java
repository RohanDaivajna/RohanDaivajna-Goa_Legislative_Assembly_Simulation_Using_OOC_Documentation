/**
 * Main class for the Goa Legislative Assembly System.
 * This class provides a menu-driven interface for simulating
 * operations such as managing bills, officials, and MLAs.
 * 
 * <p>
 * The system is object-oriented and demonstrates the use of 
 * encapsulation, inheritance, polymorphism, abstraction, constructors, 
 * and method overloading.
 * </p>
 * 
 * <h2>Operations include:</h2>
 * <ul>
 *     <li>Introducing bills</li>
 *     <li>Passing bills</li>
 *     <li>Displaying bills</li>
 *     <li>Adding officials</li>
 *     <li>Viewing officials</li>
 *     <li>Adding MLAs</li>
 *     <li>Viewing MLAs</li>
 * </ul>
 * 
 * @author Rohan Daivajna
 * @version 1.0
 * @since 2024-09-22
 */
import java.util.Scanner;
import services.AssemblyService;

public class Main {

    /**
     * The entry point of the Goa Legislative Assembly system.
     * 
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        int choice; // User choice for the menu
        AssemblyService assemblyService = new AssemblyService(); // Service class to manage assembly operations
        Scanner scanner = new Scanner(System.in);

        // Welcome message
        System.out.println("===== Welcome to the Goa Legislative Assembly System =====");

        // Loop to display the menu until the user chooses to exit
        do {
            // Display the menu options to the user
            assemblyService.displayMenu();

            // Validate input to ensure it's an integer
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number between 1 and 8.");
                scanner.next(); // Clear invalid input
            }

            // Get the user's choice
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            // Switch case to handle different menu options
            switch (choice) {
                case 1:
                    // Option to introduce a bill
                    assemblyService.introduceBill();
                    break;
                case 2:
                    // Option to pass a bill
                    assemblyService.passBill();
                    break;
                case 3:
                    // Option to display all bills
                    assemblyService.displayBills();
                    break;
                case 4:
                    // Option to add an official
                    assemblyService.addOfficial();
                    break;
                case 5:
                    // Option to view all officials
                    assemblyService.viewOfficials();
                    break;
                case 6:
                    // Option to add an MLA
                    assemblyService.addMLA();
                    break;
                case 7:
                    // Option to view all MLAs
                    assemblyService.viewMLAs();
                    break;
                case 8:
                    // Exit message
                    System.out.println("Thank you for using the Goa Legislative Assembly system! Goodbye!");
                    break;
                default:
                    // Handle invalid input
                    System.out.println("Invalid choice. Please select a valid option between 1 and 8.");
            }
        } while (choice != 8); // Loop until the user chooses to exit
    }
}
