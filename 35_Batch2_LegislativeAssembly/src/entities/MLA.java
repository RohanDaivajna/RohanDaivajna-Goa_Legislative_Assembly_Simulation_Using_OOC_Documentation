/**
 * The MLA class represents a Member of the Legislative Assembly (MLA) in the Goa Legislative Assembly.
 * It contains the MLA's name and constituency.
 * 
 * <p>
 * This class extends the Entity class and overrides the toString method to display MLA details.
 * </p>
 * 
 * <h2>Features include:</h2>
 * <ul>
 *     <li>Creation of an MLA with a name and constituency</li>
 *     <li>Displaying the MLA's information</li>
 * </ul>
 * 
 * @author Rohan Daivajna
 * @version 1.0
 * @since 2024-09-22
 */
package entities;

public class MLA extends Entity {
    private final String name;         // Name of the MLA
    private final String constituency; // Constituency the MLA represents

    /**
     * Constructs a new MLA with the given name and constituency.
     * 
     * @param name         The name of the MLA.
     * @param constituency The constituency the MLA represents.
     */
    public MLA(String name, String constituency) {
        this.name = name;
        this.constituency = constituency;
    }

    /**
     * Returns a string representation of the MLA, including their name and constituency.
     * 
     * @return The string representation of the MLA.
     */
    @Override
    public String toString() {
        return "Name: " + name + "\nConstituency: " + constituency;
    }
}
