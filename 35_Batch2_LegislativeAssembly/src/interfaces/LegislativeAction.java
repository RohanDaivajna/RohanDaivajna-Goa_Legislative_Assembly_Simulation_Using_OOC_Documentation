/**
 * The LegislativeAction interface defines the actions that can be performed 
 * on a legislative entity in the Goa Legislative Assembly system.
 * 
 * <p>
 * This interface enforces the implementation of methods to introduce and 
 * pass legislative items, ensuring that any class implementing this interface 
 * follows a standard protocol for handling legislative actions.
 * </p>
 * 
 * <h2>Key actions include:</h2>
 * <ul>
 *     <li>Introducing a legislative item (e.g., bill)</li>
 *     <li>Passing a legislative item</li>
 * </ul>
 * 
 * @author Rohan
 * @version 1.0
 * @since 2024-09-22
 */
package interfaces;

public interface LegislativeAction {

    /**
     * Introduces a legislative item, such as a bill, to the assembly.
     * Implementing classes will define the specific behavior for introducing 
     * their respective legislative items.
     */
    void introduce();

    /**
     * Marks the legislative item as passed in the assembly.
     * Implementing classes will define the specific behavior for passing 
     * their respective legislative items.
     */
    void pass();
}
