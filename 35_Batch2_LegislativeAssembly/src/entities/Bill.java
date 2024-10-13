/**
 * The Bill class represents a legislative bill in the Goa Legislative Assembly.
 * It contains details about the bill's title, description, and its status of being passed or not.
 * 
 * <p>
 * This class demonstrates the use of encapsulation, constructors, and method overloading.
 * </p>
 * 
 * <h2>Features include:</h2>
 * <ul>
 *     <li>Creation of a bill with a title and optional description</li>
 *     <li>Ability to mark the bill as passed</li>
 *     <li>Displaying the bill's information</li>
 * </ul>
 * 
 * @author Rohan Daivajna
 * @version 1.0
 * @since 2024-09-22
 */
package entities;

public class Bill extends Entity {
    private String title;        // Title of the bill
    private String description;  // Description of the bill
    private boolean isPassed;    // Status indicating if the bill is passed

    /**
     * Constructs a new Bill with the given title and description.
     * 
     * @param title       The title of the bill.
     * @param description The description of the bill.
     */
    public Bill(String title, String description) {
        this.title = title;
        this.description = description;
        this.isPassed = false; // Initially, the bill is not passed
    }

    /**
     * Constructs a new Bill with the given title. A default description is provided.
     * 
     * @param title The title of the bill.
     */
    public Bill(String title) {
        this(title, "No description provided.");
    }

    /**
     * Marks the bill as passed.
     */
    public void pass() {
        this.isPassed = true;
    }

    /**
     * Returns a string representation of the Bill, including its title, description, and status.
     * 
     * @return The string representation of the bill.
     */
    @Override
    public String toString() {
        return "Title: " + title + "\nDescription: " + description + "\nStatus: " + (isPassed ? "Passed" : "Not Passed");
    }
}
