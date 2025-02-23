/**
 * StackEmptyException is thrown when an operation is performed on an empty stack.
 *
 *  @author Elias Hofbauer
 *  @version 23-02-2025
 */
public class StackEmptyException extends Exception {
    public StackEmptyException(String message) {
        super(message);
    }
}
