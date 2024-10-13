/**
 * The AssemblyService class provides services to manage the operations of the Goa Legislative Assembly.
 * 
 * <p>
 * This class handles the core functionality of managing bills, officials, and MLAs in the assembly. It
 * provides methods to introduce bills, pass bills, display a list of bills, elect officials, view officials,
 * add MLAs, and view MLAs. It serves as the service layer of the Goa Legislative Assembly system.
 * </p>
 * 
 * <h2>Core Functions:</h2>
 * <ul>
 *     <li>Introduce a new bill</li>
 *     <li>Pass a bill</li>
 *     <li>Display introduced bills</li>
 *     <li>Elect an official</li>
 *     <li>View elected officials</li>
 *     <li>Add an MLA</li>
 *     <li>View the list of MLAs</li>
 * </ul>
 * 
 * @author Rohan
 * @version 1.0
 * @since 2024-09-22
 */
package services;

import entities.Bill;
import entities.MLA;
import entities.Official;
import java.util.ArrayList;
import java.util.Scanner;

public class AssemblyService {
    private ArrayList<Bill> bills = new ArrayList<>();
    private ArrayList<Official> officials = new ArrayList<>();
    private ArrayList<MLA> mlas = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    /**
     * Displays the main menu of the Goa Legislative Assembly system.
     * This method presents the user with the options to manage bills, officials, and MLAs.
     */
    public void displayMenu() {
        System.out.println("\n================ Goa Legislative Assembly Menu ================");
        System.out.println("1. Introduce a Bill");
        System.out.println("2. Pass a Bill");
        System.out.println("3. Display Bills");
        System.out.println("4. Elect an Official");
        System.out.println("5. View Elected Officials");
        System.out.println("6. Add an MLA");
        System.out.println("7. View MLAs");
        System.out.println("8. Exit");
        System.out.println("===============================================================");
        System.out.print("Please select an option (1-8): ");
    }

    /**
     * Introduces a new bill to the assembly.
     * The user is prompted to enter the title and description of the bill, 
     * and the bill is then added to the list of bills.
     */
    public void introduceBill() {
        System.out.println("\n--- Introduce a New Bill ---");
        System.out.print("Enter the title of the bill: ");
        String title = scanner.nextLine().trim();
        System.out.print("Enter the description of the bill: ");
        String description = scanner.nextLine().trim();
        bills.add(new Bill(title, description));
        System.out.println("The bill titled '" + title + "' has been successfully introduced!");
    }

    /**
     * Passes a bill in the assembly.
     * The user selects a bill by title, and the status of the bill is marked as passed.
     * If no bills are available, an appropriate message is displayed.
     */
    public void passBill() {
        if (bills.isEmpty()) {
            System.out.println("\nThere are no bills available to pass at the moment.");
            return;
        }
        System.out.println("\n--- Pass a Bill ---");
        displayBills();
        System.out.print("Enter the title of the bill you would like to pass: ");
        String title = scanner.nextLine().trim();
        for (Bill bill : bills) {
            if (bill.toString().contains(title)) {
                bill.pass();
                System.out.println("The bill titled '" + title + "' has been successfully passed.");
                return;
            }
        }
        System.out.println("No bill found with the title '" + title + "'. Please check the title and try again.");
    }

    /**
     * Displays all introduced bills in the assembly.
     * If no bills have been introduced, an appropriate message is displayed.
     */
    public void displayBills() {
        if (bills.isEmpty()) {
            System.out.println("\nNo bills have been introduced yet.");
            return;
        }
        System.out.println("\n--- List of Bills ---");
        for (Bill bill : bills) {
            System.out.println(bill);
            System.out.println();
        }
    }

    /**
     * Elects a new official in the assembly.
     * The user is prompted to enter the position and name of the official, 
     * and the official is then added to the list of officials.
     */
    public void addOfficial() {
        System.out.println("\n--- Elect a New Official ---");
        System.out.print("Enter the position for the official (e.g., Speaker, Secretary): ");
        String position = scanner.nextLine().trim();
        System.out.print("Enter the name of the official: ");
        String name = scanner.nextLine().trim();
        officials.add(new Official(position, name));
        System.out.println("Official '" + name + "' has been successfully elected to the position of " + position + ".");
    }

    /**
     * Displays all elected officials in the assembly.
     * If no officials have been elected, an appropriate message is displayed.
     */
    public void viewOfficials() {
        if (officials.isEmpty()) {
            System.out.println("\nNo officials have been elected yet.");
            return;
        }
        System.out.println("\n--- Elected Officials ---");
        for (Official official : officials) {
            System.out.println(official);
            System.out.println();
        }
    }

    /**
     * Adds a new MLA to the assembly.
     * The user is prompted to enter the name and constituency of the MLA, 
     * and the MLA is then added to the list of MLAs.
     */
    public void addMLA() {
        System.out.println("\n--- Add a New MLA ---");
        System.out.print("Enter the name of the MLA: ");
        String name = scanner.nextLine().trim();
        System.out.print("Enter the constituency of the MLA: ");
        String constituency = scanner.nextLine().trim();
        mlas.add(new MLA(name, constituency));
        System.out.println("MLA '" + name + "' from '" + constituency + "' has been successfully added.");
    }

    /**
     * Displays all MLAs in the assembly.
     * If no MLAs have been added, an appropriate message is displayed.
     */
    public void viewMLAs() {
        if (mlas.isEmpty()) {
            System.out.println("\nNo MLAs have been added yet.");
            return;
        }
        System.out.println("\n--- List of MLAs ---");
        for (MLA mla : mlas) {
            System.out.println(mla);
            System.out.println();
        }
    }
}
