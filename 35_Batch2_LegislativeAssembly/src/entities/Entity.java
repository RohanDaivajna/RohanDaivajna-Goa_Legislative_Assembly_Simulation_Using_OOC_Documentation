/**
 * The Entity class is an abstract base class for all entities in the Goa Legislative Assembly system.
 * It serves as the parent class for various entities such as Bill, MLA, and Official.
 * 
 * <p>
 * This class enforces that all entities must implement a toString method to display their details.
 * </p>
 * 
 * @author Rohan Daivajna
 * @version 1.0
 * @since 2024-09-22
 */
package entities;

public abstract class Entity {
    /**
     * Abstract method to be implemented by all subclasses to return a string representation of the entity.
     * 
     * @return The string representation of the entity.
     */
    @Override
    public abstract String toString();
}
