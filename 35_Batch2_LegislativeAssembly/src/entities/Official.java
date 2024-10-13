/**
 * The Official class represents an official in the Goa Legislative Assembly.
 * It contains the official's name and position.
 * 
 * <p>
 * This class extends the Entity class and overrides the toString method to display official details.
 * </p>
 * 
 * <h2>Features include:</h2>
 * <ul>
 *     <li>Creation of an official with a position and name</li>
 *     <li>Displaying the official's information</li>
 * </ul>
 * 
 * @author Rohan Daivajna
 * @version 1.0
 * @since 2024-09-22
 */
package entities;

public class Official extends Entity {
    private String position; // Position of the official
    private String name;     // Name of the official

    /**
     * Constructs a new Official with the given position and name.
     * 
     * @param position The position held by the official.
     * @param name     The name of the official.
     */
    public Official(String position, String name) {
        this.position = position;
        this.name = name;
    }

    /**
     * Returns a string representation of the Official, including their position and name.
     * 
     * @return The string representation of the official.
     */
    @Override
    public String toString() {
        return "Position: " + position + "\nName: " + name;
    }
}
