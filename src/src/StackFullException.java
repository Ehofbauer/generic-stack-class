/**
 * Exception thrown when attempting to push onto a full stack.
 *
 * @author Elias Hofbauer
 * @version 23-02-2025
 */
public class StackFullException extends Exception {
    public StackFullException(String message) {
        super(message);
    }
}
